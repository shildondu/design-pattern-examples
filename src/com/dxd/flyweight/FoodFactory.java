package com.dxd.flyweight;

/**
 * 食物工厂类
 */
public class FoodFactory {
	private static final FoodFactory foodFactory = new FoodFactory();
	//假设一共有10种食物类型
	private Flyweight[] flyweights = new Food[10];
	private int length = 0;
	
	//私有构造方法
	private FoodFactory() {
		
	}
	
	//饿汉式单例模式
	public static FoodFactory getFoodFactory() {
		return foodFactory;
	}
	
	//生产食物
	public Flyweight getFood(String type) {
		for(int i = 0; i < length; i++) {
			if(flyweights[i].getType() == type) {
				return flyweights[i];
			}
		}
		Flyweight flyweight = new Food(type);
		flyweights[length++] = flyweight;
		return flyweight;
	}
}
