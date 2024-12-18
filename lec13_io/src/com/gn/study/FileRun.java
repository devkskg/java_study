package com.gn.study;

import java.io.File;

public class FileRun {
	public static void main(String[] args) {
//		1. 디렉토리 생성
//		(1) File 객체 선언
//		File dir1;
//		(2) File 객체 생성 -> 디렉토리 경로 지정
//		dir1 = new File("C:\\exampleDir");
//		(3) 디렉토리 생성
//		dir1.mkdir();

//		File dir2 = new File("C:\\parentDir\\childDir");
//		dir2.mkdirs();

//		2. 디렉토리 삭제
//		(1) File 객체 선언 및 생성
//		File path1 = new File("C:\\exampleDir");
//		(2) delete() 메소드 호출
//		path1.delete();

//		File path2 = new File("C:\\parentDir\\childDir");
//		File path2 = new File("C:\\parentDir");
//		path2.delete();

//		File path2 = new File("C:\\parentDir");
//		path2.delete();
//		if (path2.delete()) {
//			System.out.println("삭제완료");
//		} else {
//			System.out.println("하위 디렉토리 존재");
//		}

//		3. 디렉토리 존재 유무 확인
//		File dir3 = new File("C:\\testDir");
//		if (dir3.exists()) {
//			System.out.println("이미 존재하는 경로");
//		} else {
////			dir3.mkdirs();
////			System.out.println("디렉토리 생성이 완료되었습니다.");
//			if (dir3.mkdirs()) {
//				System.out.println("정상 생성");
//			} else {
//				System.out.println("생성 실패");
//			}
//		}
//		if (dir3.exists()) {
//			if (dir3.delete()) {
//				System.out.println("정상 삭제");
//			} else {
//				System.out.println("실패");
//			}
//		} else {
//			System.out.println("존재하지 않는 경로");
//		}

//		if (dir3.exists()) {
//			dir3.delete();
//		} else {
//			dir3.mkdirs();
//		}

//		4. 파일 생성
		File dir1 = new File("C:\\parentDir\\childDir");

		File file1 = new File("C:\\parentDir\\childDir\\example.txt");
////		방법 1) 트라이 캐치
////		방법 2) throws 해주기
//		try {
//			if (!dir1.exists()) {
//				dir1.mkdirs();
//			}
//			if (file1.createNewFile()) {
//				System.out.println("파일 생성 성공");
//			} else {
//				System.out.println("파일 생성 실패");
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		5. 파일 삭제
		if (file1.exists()) {
			if (file1.delete()) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}
	}
}
