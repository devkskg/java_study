package com.gn.practice05.model.vo;

public class Book {
	private String title;
	private String publishser;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		this("a", "n", "c", 1, 1.0);
		
	}
//	public Book(String title) {
//		this(title, "n", "c", 1, 1.0);
//		this.title = title;
//	}
	
	public Book(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publishser = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	 
	public void information() {
		System.out.println("=== " + title + " ===" );
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publishser);
		System.out.println("가격 : " + price + "원");
		System.out.println("할인율 : " + discountRate);
	}
	
	

}
