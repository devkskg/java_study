package com.gn.practice06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run01 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\practice");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "output.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			String[] lines = {"첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다"};
			
			for(String l : lines) {
				bw.write(l);
				bw.newLine();
			}
//			bw.write(lines[0]);
//			bw.newLine();
//			bw.write(lines[1]);
//			bw.newLine();
//			bw.write(lines[2]);
//			bw.newLine();
			
			bw.flush();
			
			System.out.println("생성완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
				
		
		
		
	}
}
