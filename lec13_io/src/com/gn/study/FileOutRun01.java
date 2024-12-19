package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun01 {
	public static void main(String[] args) {

//		1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if (dir.exists() == false) {
			dir.mkdirs();
		}

//		2. 파일 생성
		File file = new File(dir, "sample1.dat");
//		3. FileOutputStream 생성 // 선언 - 생성을 따로하여 close가 작동할 수 있도록 만든다.
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file); // FileNotFoundException 조심!
//			4. 출력할 데이터 구성 - FileOutputStream이 중괄호 안에서 영향력 끼치니 같은 중괄호 안에서 해결하자
			String str = "Hello";
			byte[] arr = str.getBytes(); // 바이트 배열로 반환하는 메소드
//			5. 출력
			out.write(arr); // IOException 조심!
//			6. 플러싱(선택)
			out.flush();
			System.out.println(file.length() + "크기의 " + file.getParent() + " 파일 생성");
//			만약 스트링 닫는 것을 try문 안에 넣었을 때 
//			-> 중간에 오류 생기면 catch쪽으로 순서가 넘어가서 close가 작동하지 않는다.
		} catch (IOException e) { // IOException(부모)과 FileNotFoundException(자식) 상속관계
			e.printStackTrace();
		} finally {
			try {
//				7. 스트림 닫기
				if(out != null) { // out = new FOS(file);이 잘 동작 했다면(=터널이 잘 뚫렸다면!)
					out.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
