package com.gn.practice04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "애국가1.dat");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file, true);
			String str = "\n남산위에 저 소나무 철갑을 두른듯"
					+ "\n바람서리 불변함은 우리기상 일세"
					+ "\n무궁화 삼천리 화려강산 "
					+ "\n대한사람 대한으로 길이보전하세";
			byte[] arr = str.getBytes();
			
			fos.write(arr);
			fos.flush();
			
			System.out.println(dir.getPath() + " 폴더의 " + file.getName() + " 파일에 내용이 추가 되었습니다.");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
