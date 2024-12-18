package com.gn.practice01;

import java.io.File;

public class Practice {
	public void deleteFile(File dir) {
		File list = new File(dir.getPath());
		File[] files = list.listFiles();
		for (File file : files) {
			System.out.println(file + "파일 삭제");
			file.delete();
		}
	}
}
