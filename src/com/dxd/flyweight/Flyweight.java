package com.dxd.flyweight;

//抽象享元类
public abstract class Flyweight {
	
	//类型作为内蕴状态
	protected String type;
	
	//初始化外蕴状态
	public abstract void initOutState(String customer);
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
