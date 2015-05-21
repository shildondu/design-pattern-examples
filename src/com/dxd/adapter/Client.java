package com.dxd.adapter;

/**
 * 测试类
 * @author Shildon
 *
 */
public class Client {
    public static void main(String[] args) {
	Adapted adapted = new Adapted();
	Target target = new Adapter(adapted);
	target.operation0();
	target.operation1();
    }
}
