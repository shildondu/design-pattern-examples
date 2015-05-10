package com.dxd.flyweight;

public class Food extends Flyweight {
	
	public Food(String type) {
		this.type = type;
	}

	//对外蕴状态进行处理
	@Override
	public void initOutState(String customer) {
		System.out.println(customer + " buy " + getType());
	}

}
