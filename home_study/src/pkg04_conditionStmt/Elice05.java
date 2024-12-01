package pkg04_conditionStmt;

import java.util.Scanner;

public class Elice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int year = sc.nextInt();

	    if(year % 400 == 0){
	        System.out.println("윤년");
	    } else if(year % 100 == 0){
	        System.out.println("평년");
	    } else if(year % 4 == 0){
	         System.out.println("윤년");
	    } else{
	        System.out.println("평년");
	    }
//	    아래와 같이 범위가 넓은 조건부터 해버리면 true 값을 받아버려서 뒤에서 원하는 좁은 범위를 사요하지 못하게 된다.
//	    
//	    if(year % 4 == 0){
//	        System.out.println("윤년");
//	    } else if(year % 100 == 0){
//	        System.out.println("평년");
//	    } else if(year % 400 == 0){
//	         System.out.println("윤년");
//	    } else{
//	        System.out.println("평년");
//	    }

	    sc.close();

	}

}
