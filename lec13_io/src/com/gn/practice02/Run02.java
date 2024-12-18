package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run02 {
	public static void main(String[] args) {
		
		
		UUID uuid = UUID.randomUUID();
		String uu = uuid.toString().replace("-", "");
		File file = new File("C:\\test\\sub\\" + uu + ".txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
