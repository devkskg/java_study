package elice;

import java.util.Scanner;

public class Elice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    char[] chars = str.toCharArray();
	    int countA = 0;
	    int countB = 0;
	    int countD = 0;
	    int countF = 0;

	    for(char ch : chars) {
	    	if(ch == 'a') {
	    		countA++;
	    	}
	    	if(ch == 'b') {
	    		countB++;
	    	}
	    	if(ch == 'd') {
	    		countD++;
	    	}
	    	if(ch == 'f') {
	    		countF++;
	    	}
	    }
	    System.out.println("a:" + countA + "개");
	    System.out.println("b:" + countB + "개");
	    System.out.println("d:" + countD + "개");
	    System.out.println("f:" + countF + "개");
	    sc.close();

	}

}
