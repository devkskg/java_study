package com.gn.study;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufOutRun01 {
	public static void main(String[] args) {
//		1. 디렉토리 생성
		File dir = new File("C:\\test\\241219");
		if (dir.exists() == false) {
			dir.mkdirs();
		}

//		2. 파일 객체
		File file = new File(dir, "sample3.dat");

//		3. 스트림 생성
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; // 보조 스트림!!(보조 에스컬레이터!)

		try { // 만들 때 순서 주의!!
			fos = new FileOutputStream(file); // 터널 열고
			bos = new BufferedOutputStream(fos); // 에스컬레이터 열고

			String str = "how are you? \nI'm fine thank you\n";
			bos.write(str.getBytes());
			bos.write(str.getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 닫을 때 순서 주의!!
				if(bos != null) { // 에스컬레이터 닫고
					bos.close();
				}
				if(fos != null) { // 터널 닫고
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
