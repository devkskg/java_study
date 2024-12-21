package com.gn.practice06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run02 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "output.txt");

		String[] lines = { "첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			for (int i = 0; i < lines.length; i++) {
				if (i == lines.length - 1) {
					bw.write(lines[i]);
				} else {
					bw.write(lines[i]);
					bw.newLine();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
