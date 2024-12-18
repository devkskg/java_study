package com.gn.study;

import java.io.File;
import java.text.SimpleDateFormat;

public class RunRun {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir.getPath() + "\\test.txt");
		long millies = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = sdf.format(millies);
		System.out.println(date);

	}
}
