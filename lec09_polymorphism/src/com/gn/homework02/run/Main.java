package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Main {
	public static void main(String[] args) {
		Menu[] arr = new Menu[5];
		Menu dish = new Dish("스테이크", 5000, "고기");
		Menu drink = new Drink("콜라", 150, "비밀");

		while (true) {
			int rd1 = (int) (Math.random() * 5);
			int rd2 = (int) (Math.random() * 10) + 1;
			if (rd2 / 2 == 1) {
				arr[rd1] = dish;
			} else {
				arr[rd1] = drink;
			}

			if (arr[0] != null && arr[1] != null && arr[2] != null && arr[3] != null && arr[4] != null) {
				break;
			}
		}

		for (Menu a : arr) {
			System.out.println(a);
		}

	}
}
