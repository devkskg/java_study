package com.gn.homework02;

import java.io.File;

public class Run01 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		
		Practice01 p = new Practice01();
		
		p.method1(dir);
		p.method2(dir);
	}
}
