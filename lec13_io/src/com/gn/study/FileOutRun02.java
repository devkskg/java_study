package com.gn.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun02 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\241219");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "sample2.dat");
		FileOutputStream fos = null;
		try {
//			여러번 하면 str이 여러번 추가 된다!
			fos = new FileOutputStream(file, true); // 추가모드!! 생성 말고 추가 할거니까 모양이 다름
			String str = "안녕하세요~ 반갑습니다.\n";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
			
			System.out.println("만들었다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
