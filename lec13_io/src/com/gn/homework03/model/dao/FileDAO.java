package com.gn.homework03.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		boolean result = false;
		File checkFile = new File("C:\\test\\sub\\" + file + ".txt");
		if(checkFile.exists()) {
			result =  true;
		}
		return result;
	}
	
	public void fileSave(String file, String s) {
		File fileSave = new File("C:\\test\\sub\\" + file + ".txt");
		
		
		try(FileWriter fw = new FileWriter(fileSave)){
			fw.write(s);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		File fileOpen = new File("C:\\test\\sub\\" + file + ".txt");
		try(BufferedReader br = new BufferedReader(new FileReader(fileOpen))){
			while(true) {
			String data = br.readLine();
			if(data == null) {
				break;
			}
			sb.append(data).append("\n");
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		File fileEdit = new File("C:\\test\\sub\\" + file + ".txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileEdit, true))){
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
