package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run02 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, "애국가1.dat");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] b = new byte[5];
			byte[] arr = new byte[(int)file.length()];
//			
			int idx = 0;
			while(true) {
				int data = fis.read(b);
				if(data == -1) {
					break;
				}
				
				System.arraycopy(b, 0, arr, idx, data);
				
				idx += data;
				
				
			}
			
			String str = new String(arr);
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
