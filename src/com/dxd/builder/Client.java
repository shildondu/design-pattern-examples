package com.dxd.builder;

/**
 * 客户端类
 * @author Shildon
 *
 */
public class Client {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
	Director director = new Director();
	Product product0 = director.construct0();
	Product product1 = director.construct1();
    }
}
