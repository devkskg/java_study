package test241223.elice.elice09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			
			int num = sc.nextInt();
			list.add(num);
			
			if(num == 999 && list.size() % 2 == 0) {
				break;
			}
			
		}
		
		list.remove(list.size() - 1);
		
		Collections.sort(list);
		
		int idx = list.size() - 1;
		int mid = idx / 2;
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		double average = (sum * 10) / (list.size() * 10.0);
		
		System.out.println("평균:" + average);
		System.out.println("중간값:" + list.get(mid));
	
	}
}
