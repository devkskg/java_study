package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputRun02 {
	public static void main(String[] args) {
//		1. 디렉토리 지정
		File dir = new File("C:\\test\\241219");
//		2. 파일 지정
		File file = new File(dir, "sample2.dat");
//		3. 파일 입력 스트림 선언
		FileInputStream fis = null;
		
		try {
//			4. 파일 입력 스트림 생성
			fis = new FileInputStream(file);
			
//			여기부터 좀 다름
//			5. 읽은 데이터 저장할 배열
			byte[] b = new byte[(int)file.length()];
//			6. 읽을 단위 나타낼 배열
			byte[] stand = new byte[5]; // 5칸씩 가져올거다.
//			7. 읽어오기
			int idx = 0; //
			while(true) {
				int data = fis.read(stand); // 배열단위로 가져오면 내가 가져온 데이터 갯수만큼을 data로..?
				if(data == -1) {
					break;
				}
//				stand에 담긴 것을 b에 넣기
				System.arraycopy(stand, 0, b, idx, data); // 
				idx += data; // 
			}
//			8. 확인하기
			System.out.println("=====");
			System.out.println(b.length);
			String str = new String(b);
			System.out.println(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
