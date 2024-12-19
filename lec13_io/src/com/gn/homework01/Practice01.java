package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice01 {
	public Practice01() {}
	
	public void method1(String song) {
		long start = System.nanoTime();
		
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) dir.mkdirs();
		File file = new File(dir, "나비야1.dat");
		
//		FileOutputStream fos = null;
//		try{
//			fos = new FileOutputStream(file);
//		byte[] arr = song.getBytes();
//		fos.write(arr);
//		fos.flush();
//		System.out.println("생성완료");
//	} catch (IOException e) {
//		e.printStackTrace();
//	} finally {
//		try {
//			if(fos != null) {
//				fos.close();
//			}
//		} catch (IOException e2) {
//			e2.printStackTrace();
//		}
//	}
		
		
		try(FileOutputStream fos = new FileOutputStream(file)) {
			byte[] arr = song.getBytes();
			fos.write(arr);
			fos.flush();
			System.out.println("생성완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("sdf");
		}
		
		long end = System.nanoTime();
//		double convert = (double)(end - start) / Math.pow(10, 9);
		System.out.println(end - start + "ns");
	}
	
	
	
	public void method2(String song) {
		long start = System.nanoTime();
		
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) dir.mkdirs();
		File file = new File(dir, "나비야1.dat");
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))){
			bos.write(song.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
//		long convert = (end - start) / (long)Math.pow(10, 9);
		System.out.println(end - start + "ns");
	}
}
