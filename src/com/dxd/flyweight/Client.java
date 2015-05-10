package com.dxd.flyweight;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FoodFactory foodFactory = FoodFactory.getFoodFactory();
		Flyweight food0 = foodFactory.getFood("rice");
		Flyweight food1 = foodFactory.getFood("noodle");
		Flyweight food2 = foodFactory.getFood("chicken");
		Flyweight food3 = foodFactory.getFood("rice");
		System.out.println(food0 == food3);
		food0.initOutState("kobe");
		food1.initOutState("john");
		food2.initOutState("sheldon");
		food3.initOutState("james");
	}

}
