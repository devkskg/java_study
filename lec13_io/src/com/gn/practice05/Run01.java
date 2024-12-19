package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run01 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, "애국가1.dat");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] b = new byte[(int)file.length()];
			int idx = 0;
//			int data = 0;
			int data;
			
//			while(data != -1) {
			while(true) {
				data = fis.read();
				if(data == -1) {
					break;
				}
				b[idx++] = (byte)data;
			}
			
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
