package elice;

import java.util.Scanner;

public class Elice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    char[] chars = str.toCharArray();
	    int[] count = new int[26];
	    
	    
	    for(int i = 0; i < chars.length; i++) {
	    	if('a' <= chars[i] && chars[i] <= 'z') {
	    		count[chars[i] - 'a']++; // 제일 어려운 부분
	    	}
	    }
	    
	    
	    for(int i = 0; i < count.length; i++) {
	    	if(count[i] == 0) {
	    		continue;
	    	} else {
	    		System.out.println((char)(i+'a') + ":" + count[i] + "개");
	    	}
	    }
	    
	    
//	    int countA = 0;
//	    int countB = 0;
//	    int countC = 0;
//	    int countD = 0;
//	    int countE = 0;
//	    int countF = 0;
//	    for(int i = 0; i < count.length; i++) {
//	    	for(int j = 97; j <= 97 + 26; j++) {
//	    		if((int)chars[i] == j) {
//	    			count[j-97] = (int)chars[i];
//	    		}
//	    	}
//	    }
//	    
//	    for(int i = 0; i < count.length; i++) {
//	    	
//	    	System.out.println((char)(i+97) + ":");
//	    	count[i] = count[i] / (i+97);
//	    	System.out.println(count[i] + "개");
//	    }
//	    System.out.println((int)chars[0]);
	    
	    
	    
//	    for(int i = 0; i < count.length; i++) {
//	    	System.out.println(count[i]);
//	    }
////	    
//	    for(char ch : chars) {
//	    	if(ch == 'a') {
//	    		countA++;
//	    	}
//	    	if(ch == 'b') {
//	    		countB++;
//	    	}
//
//	    	if(ch == 'c') {
//	    		countC++;
//	    	}
//	    	if(ch == 'd') {
//	    		countD++;
//	    	}
//	    	if(ch == 'f') {
//	    		countF++;
//	    	}
//	    }
//	    System.out.println("a:" + countA + "개");
//	    System.out.println("b:" + countB + "개");
//	    System.out.println("d:" + countD + "개");
//	    System.out.println("f:" + countF + "개");
	    
//	    System.out.println((char)97);
	    sc.close();

	}

}
