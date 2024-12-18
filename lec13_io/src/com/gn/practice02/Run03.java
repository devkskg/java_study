package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run03 {
	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub");
		
//		if(!dir.exists()) {
//			dir.mkdirs();
//		}
//		
//		UUID uuid = UUID.randomUUID();
//		String uu = uuid.toString().replace("-", "");
//		
//		
//		File file = new File(dir, uu + ".txt");
//		
//		try {
//			if(!file.exists()) {
//				file.createNewFile();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Practice02 p = new Practice02();
		p.deleteFiles(dir);
		
		
	}
}
