package com.gn.study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufWriterRun01 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "sample2.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
//			fw = new FileWriter(file); // 이거는 생성 모드
			fw = new FileWriter(file, true); // 이거는 추가 모드
			bw = new BufferedWriter(fw);
						
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다.");
			bw.newLine();
			bw.flush();
			
			System.out.println("생성 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}
	}
}
