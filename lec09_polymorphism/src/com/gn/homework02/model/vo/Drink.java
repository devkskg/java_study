package com.gn.homework02.model.vo;

public class Drink extends Menu {
	private String recipe;

	public Drink() {
	}

	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getRecipe() {
		return recipe;
	}

	@Override
	public void cook() {
		System.out.println(super.toString());
		System.out.println("레시피는 " + recipe + "입니다.");
	}

}
