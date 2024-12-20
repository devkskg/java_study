package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run02 {
	public static void main(String[] args) {
		File dir = new File("c:\\test\\sub\\practice\\");
		File file = new File(dir, "output.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			
			while(true) {
				line = br.readLine();
				if(line == null) break;
				sb.append(line).append("\n");
			}
			sb.deleteCharAt(sb.length()-1);
			int length = sb.toString().replace(" ", "").replace("\n", "").length();
			System.out.println(sb);
			System.out.println("공백 제외 글자수 : " + length);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
