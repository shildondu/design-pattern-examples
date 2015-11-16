package com.dxd.prototype;

/**
 * 测试类
 * @author Shildon
 *
 */
public class Client {
    
    public static void main(String[] args) {
	Prototype prototype0 = new Prototype();
	try {
	    Prototype prototype1 = (Prototype)prototype0.clone();
	    System.out.println(prototype0 == prototype1);
	    //可以看出下面打印结果true，说明clone方法默认是浅克隆
	    System.out.println(prototype0.getKey() == prototype1.getKey());
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
    }
    
}
