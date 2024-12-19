package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run01 {
	public static void main(String[] args) {
		File file = new File("c:/test/sub/practice/output.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				sb1.append(data).append("\n");
				sb2.append(data);
			}
			System.out.println(sb1.toString());
			String str = sb2.toString().replace(" ", "");
			System.out.println("공백 제외 글자수 : " + str.length());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
