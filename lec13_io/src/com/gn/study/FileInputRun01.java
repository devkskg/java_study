package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputRun01 {
	public static void main(String[] args) {
//		1. 파일 위치 지정 - 있는 것을 가져오는 애라서 dir 만들기 불필요
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, "sample1.dat");
		
//		2. 파일 입력 스트림 선언
		FileInputStream in = null;
		
//		3. 파일 입력 스트림 생성
		try {
			in = new FileInputStream(file); // 파일 위치 지정
//			4. 읽은 데이터를 보관할 배열
//			(1) 파일 크기만한 비어있는 배열
			byte[] arr = new byte[(int)file.length()]; // file.length가 long타입이라서 다운캐스팅
			
//			5. 읽어오기
//			(2) 읽어올 데이터 담을 변수
			int data; // data = 0 으로 밖에 선언하고 while의 조건문을 data != -1로 하면 break문 없어도 된다.
//			(3) 반복문 파일 내부 정보 읽어옴
			int idx = 0;
			while(true) {
				data = in.read(); // 읽은 정보를 data변수에 넣기
				if(data == -1) {
					break;
				}
				arr[idx++] = (byte)data; // data변수를 바이트배열에 넣기(다운캐스팅, index 설정)
			}
			
//			6. 확인하기(배열 표준출력)
//			System.out.println(arr);
			String str = new String(arr); // byte배열 형태를 문자열로 바꾸기
			System.out.println(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
//			7. 닫아주기
			try {
				if(in != null) {
					in.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
