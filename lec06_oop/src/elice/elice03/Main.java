package elice.elice03;

import java.util.Scanner;
//	메소드 실습
class Calculator{
	int begin;
	int end;
	int evenTotal;
	
	int getEvenTotal(int begin, int end) {
		evenTotal = 0;
		for(int i= begin;  i <= end; i++) {
			if(i % 2 == 0) {
				evenTotal += i;
			}
		};
		return evenTotal;}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  int begin = scan.nextInt();
		  int end = scan.nextInt();
		  Calculator calc = new Calculator();
		  System.out.println(calc.getEvenTotal(begin, end));
		 }

	}


