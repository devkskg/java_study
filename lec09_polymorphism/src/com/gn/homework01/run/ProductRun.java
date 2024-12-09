package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		Product fd = new Food("치킨", 20000, 5);
		Product bk = new Book("자바의 정석", 15000);

		System.out.println(fd.getName() + "의 최종 가격 : " + fd.calculatePrice());
		System.out.println(bk.getName() + "의 최종 가격 : " + bk.calculatePrice());

	}

}
