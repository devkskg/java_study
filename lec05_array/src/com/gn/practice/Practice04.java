package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
 public static void main(String[] args) {
//	 1) 문제
// 다섯명 학생의 나이를 저장한 배열 ages가 있습니다.
// 이 학생들 중 가장 나이가 많은 학생의 나이를 찾아서 출력하세요.
// 위 지시사항을 완료하시면 가장 나이가 어린 학생도 찾아보세요.
// int[] ages = {20, 18, 22, 19, 21};
// 2) 출력 예시
// 가장 나이가 많은 학생의 나이 : 22
// 가장 어린 학생의 나이 : 18
	 int[] ages = {20, 18, 22, 19, 21};
	 int max = ages[0];
	 int min = ages[0];
	 for(int age : ages) {
		 if(age > max) {
			 max = age;
		 }
		 if(age < min) {
			 min = age;
		 }
	 }
	 System.out.println("가장 나이가 많은 학생의 나이 : " + max);
	 System.out.println("가장 어린 학생의 나이 : " + min);
	 
	 Scanner sc = new Scanner(System.in);
	 int[] ages2 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
	 int max2 = ages2[0];
	 int min2 = ages2[0];
	 for(int age : ages2) {
		 if(age > max2) {
			 max = age;
		 }
		 if(age < min2) {
			 min = age;
		 }
	 }
	 System.out.println("가장 나이가 많은 학생의 나이 : " + max);
	 System.out.println("가장 어린 학생의 나이 : " + min);
	 sc.close();
	 
 }
}
