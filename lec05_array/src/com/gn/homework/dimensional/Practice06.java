package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice06 {
	public void ptc06() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int k = 0;
		int z = 0;
		int y = 0;
		String[] arr;
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		arr = new String[num + n];
		
		while(true) {
			
			String[] arr2 = new String[num + n];
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			
			arr = new String[num + n];
			for(int i = 0; i< arr.length; i++) {
				arr[i] = arr2[i];
			}
			
			while(n < arr.length) {
				System.out.print((n + 1) + "번째 문자열 : ");
				String str = sc.nextLine();
				arr[n] = str;
				n++;
				System.out.println(n);
			}
			
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				String str2 = sc.nextLine();
				if(str2.equals("Y") || str2.equals("y")) {
					System.out.print("더 값을 입력하고 싶은 개수 : ");
					num = sc.nextInt();
					sc.nextLine();
					break;
				} else if(str2.equals("N") || str2.equals("n")) {
					k++;
					break;
				} else {
					System.out.println("입력할 수 없는 값입니다.");
					continue;
				}
			}
//			n += num;
			if(k==1) {
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
