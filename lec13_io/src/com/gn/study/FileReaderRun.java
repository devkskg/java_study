package com.gn.study;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRun {
	public static void main(String[] args) {
//		1. 디렉토리 생성 스킵, 파일 생성(파일 읽을 거니까 = 디렉토리 만들 이유가 없음, 이미 있는 것을 확신하기 때문)
		File file = new File("C:\\test\\sub\\sample1.txt");
		
//		2. 파일 입력 스트림 선언(텍스트)
		FileReader fr = null;
		
		try {
//			3. 파일 입력 스트림 생성
			fr = new FileReader(file);
//			4. 읽을 단위를 지정 -> int, char[]
//			(1) int
//			StringBuilder sb = new StringBuilder();
//			while(true) {
//				int data = fr.read();
//				if(data == -1) {
//					break;
//				}
//				sb.append((char)data);
//			}
//			System.out.println(sb.toString());
			
//			(2) char[]
			StringBuilder sb = new StringBuilder();
			char[] std = new char[2];
			while(true) {
				int data = fr.read(std);
				if(data == -1) {
					break;
				}
				sb.append(std, 0, data); // 붙여줄 배열, 배열의 몇번째부터?, 몇개만큼?
			}
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
