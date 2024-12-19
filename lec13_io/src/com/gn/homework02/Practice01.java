package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice01 {
	public void method1(File dir) {
		long start = System.nanoTime();
		
		File file = new File(dir, "나비야1.dat");
		try(FileInputStream fis = new FileInputStream(file)){
			
			byte[] arr = new byte[(int)file.length()];
			byte[] std = new byte[100];
			int idx = 0;
			while(true) {
				int data = fis.read(std);
				if(data == -1) {
					break;
				}
				System.arraycopy(std, 0, arr, idx, data);
				idx += data;
			}
			String str = new String(arr);
			System.out.println(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		System.out.println(end - start + "ns");
	}
	
	public void method2(File dir) {
		long start = System.nanoTime();
		
		File file = new File(dir, "나비야1.dat");
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
			
			byte[] arr = new byte[(int)file.length()];
			byte[] std = new byte[100];
			int idx = 0;
			while(true) {
				int data = bis.read(std);
				if(data == -1) {
					break;
				}
				System.arraycopy(std, 0, arr, idx, data);
				idx += data;
			}
			String str = new String(arr);
			System.out.println(str);
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		System.out.println(end - start + "ns");
	}
}
