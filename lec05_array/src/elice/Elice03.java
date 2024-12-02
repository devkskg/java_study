package elice;

import java.util.Scanner;

public class Elice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = "";
		
		for(int i = (str1.length() - 1); i >= 0; i--) {
			str2 += str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("대칭수");
		} else {
			System.out.println("대칭수아님");
		}

	}

}
