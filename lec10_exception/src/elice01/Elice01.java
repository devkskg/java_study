package elice01;

import java.util.Scanner;

public class Elice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		int num1 = 0;
		int num2 = 0;
		  
		   String str1 = scan.next();
		   String str2 = scan.next();
		   
		   try {
			   for(int i = 0; i < str1.length(); i++) {
				   if('0' <= str1.charAt(i) && str1.charAt(i) <= '9') {
					 
				   }else {
					   c1++;
				   }
			   }
			   if(c1 != 0) {
				   throw new Exception(str1 + "는 정수가 아닙니다");
			   } else {
				   num1 = Integer.parseInt(str1);
			   }
			   
			   for(int i = 0; i < str2.length(); i++) {
				   if('0' <= str2.charAt(i) && str2.charAt(i) <= '9') {
					   
				   }else {
					   c2++;
				   }
			   }
			   if(c2 != 0) {
				   throw new Exception(str2 + "는 정수가 아닙니다");
			   } else {
				   num2 = Integer.parseInt(str2);
				   System.out.println(num1+num2);
			   }
			   System.out.println(num1+num2);
			   
		   } catch(Exception e) {
			   System.out.println(e.getMessage());
		   }
		   scan.close();
		   
	}
}
			   
			   
		  
			   
			   
			   
			
		
		   
		   
		   
			
			
			
			
			
			
			
			
			
//			try {
//				if((double)Integer.parseInt(str1) % 1 == 0 ) {
//					num1 = Integer.parseInt(str1);
//				} else {
//					throw new Exception(str1 + "는 정수가 아닙니다");
//				}
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//			try {
//				num2 = Integer.parseInt(str2);
//				if(num2 % 1 == 0 ) {
//				} else {
//					throw new Exception(str2 + "는 정수가 아닙니다");
//				}
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//			System.out.println(num1 + num2);
			
			
			
//			try {
//				num1 = Integer.parseInt(str1);
////				throw new Exception(str1 + "는 정수가 아닙니다");
//			} catch (NumberFormatException e) {
//				System.out.println(e.getMessage());
//			} finally {
//				sc.close();
//			}
//			
//			try {
//				num2 = Integer.parseInt(str2);
////				throw new Exception(str2 + "는 정수가 아닙니다.");
//			} catch (NumberFormatException e) {
//				System.out.println(e.getMessage());
//			}
//			System.out.println(num1+num2);


//class UnExpectedException extends Exception {
//	public UnExpectedException(String msg) {
//		super(msg);
//	}
//
//}
