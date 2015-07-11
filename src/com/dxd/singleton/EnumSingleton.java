package com.dxd.singleton;

/**
 *
 * 用Enum实现单例类，避免反序列化时不是同一个单例
 * @author Shildon
 *
 */
 public enum EnumSingleton {
	 
	 INSTANCE;
	 
	 public void doSomething() {
		 System.out.println("Do Something!");
	 }
	 
	 public static void main(String[] args) {
		 EnumSingleton.INSTANCE.doSomething();
	 }
	 
 }