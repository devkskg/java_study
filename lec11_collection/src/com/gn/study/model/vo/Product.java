package com.gn.study.model.vo;

public class Product implements Comparable<Product> {
	private String name;
	private int price;

	public Product() {
		super(); // 그냥 써놓은 것이긴한데 Object를 상속 받으니 틀린 말은 아닌 것이네
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

//	중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해
	@Override
	public int compareTo(Product other) {
//		if (this.price > other.price) {
//			return 1;
//		} else if (this.price < other.price) {
//			return -1;
//		} else {
//			return 0;
//		}
//		return this.price - other.price;
		return this.name.compareTo(other.name);
	}
//	중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해중요해

	@Override
	public String toString() {
		return name + ":" + price + "원";
	}
}
