package com.gn.practice02;

import java.io.File;

public class Practice02 {
	public void deleteFiles(File dir) {
		File file = new File(dir.getPath());
		File[] files = file.listFiles();
		for(File f : files) {
			f.delete();
		}
	}
}
