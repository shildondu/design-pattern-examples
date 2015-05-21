package com.dxd.adapter;

/**
 * 对象的配器类(有类的适配器和对象的适配器)
 * @author Shildon
 *
 */
public class Adapter implements Target {
    private Adapted adapted;
    
    public Adapter(Adapted adapted) {
	this.adapted = adapted;
    }
    
    @Override
    public void operation0() {
	adapted.operation0();
    }
    
    @Override
    public void operation1() {
	System.out.println("Do somethings in adapter");
    }
}
