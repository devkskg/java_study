package pkg02_variable;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m) : ");
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height);
		double convertBmi = Math.round(bmi*10)/10.0;
		System.out.println("BMI 지수 : " + convertBmi);
		
		sc.close();

	}

}
