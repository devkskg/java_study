package elice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Elice02 {
	public static void main(String[] args) {
		long a = 0;
		long b = 0;
		File dir = new File("C:\\data");
		File file = new File(dir, "logo.png");
		
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream(file);
			
			
			
			byte[] arr1 = new byte[(int)file.length()];
			byte[] size = new byte[1000];
			int data1 = 0;
			int idx1 = 0;
			while(true){
				data1 = fis.read(size);
				if(data1 == -1) {
					break;
				}
				System.arraycopy(size, 0, arr1, idx1, data1);
				idx1 += data1;
			}
			a = arr1.length;
			
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try{
				if(fis != null){
					fis.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		
		FileInputStream fis1 = null;
		try{
			fis1 = new FileInputStream(file);
			
			
			
			byte[] arr2 = new byte[1000];
			byte[] size2 = new byte[1000];
			int data2 = 0;
			int idx2 = 0;
				data2 = fis1.read(size2);
				System.arraycopy(size2, 0, arr2, idx2, data2);
				b = arr2.length;
				
			
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try{
				if(fis1 != null){
					fis1.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		
		System.out.println(a - b);
	}
}
