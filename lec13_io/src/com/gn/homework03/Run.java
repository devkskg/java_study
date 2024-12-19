package com.gn.homework03;

import java.io.File;

import com.gn.homework03.view.FileMenu;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		FileMenu fm = new FileMenu();
		fm.mainMenu();
		
		
	}
}
