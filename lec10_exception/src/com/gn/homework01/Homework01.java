package com.gn.homework01;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		int rd = (int) (Math.random() * 50) + 1;
		System.out.println(rd);
		int count = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.print("1~50사이의 숫자 : ");
				int num = sc.nextInt();
				sc.nextLine(); // 이거 저번에 배웠는데 왜 몰랐지? 바보인가봐
				if (1 <= num && num <= 50) {
					if (rd == num) {
						count++;
						sc.close();
						break;
					} else if (rd < num) {
						System.out.println("Down!");
						count++;
					} else if (rd > num) {
						System.out.println("Up!");
						count++;
					}
				} else if (num < 1 || 50 < num) {
					System.out.println("범위 안의 숫자 입력 필요 : ");
				} 
//					else {
////					throw new Exception("범위 안의 숫자 입력 필요 : ");
//				}

			} catch (Exception e) {
//				System.out.println(e.getMessage());
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
//				throw new Exception();
//				sc.close();
//				break;
			} finally {
//				System.out.println("sldkfjlksdjfl");
//				num = sc.nextInt();
//				if (1 <= num && num <= 50) {
//					if (rd == num) {
//						break;
//					} else if (rd < num) {
//						System.out.println("Down!");
//					} else if (rd > num) {
//						System.out.println("Up!");
//					}
//				} else if (num < 1 || 50 < num) {
//					System.out.println("범위 안의 숫자 입력 필요 : ");
//				}
				
			}
		}

		System.out.println("축하합니다~ 정답이에요");
		System.out.println("정답은 : " + rd + "이고, " + count + "회 입력 하셨습니다.");
	}
}
