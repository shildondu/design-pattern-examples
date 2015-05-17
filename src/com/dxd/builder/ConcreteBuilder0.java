package com.dxd.builder;

/**
 * 产品0建造类
 * @author Shildon
 *
 */
public class ConcreteBuilder0 implements Builder {

    private Product0 product0 = new Product0();
    
    @Override
    public void buildPart0() {
	product0.setPart0("part0");
	System.out.println("build " + product0.getPart0() + " of product0!");
    }

    @Override
    public void buildPart1() {
	product0.setPart1("part1");
	System.out.println("build " + product0.getPart1() + " of product0!");
    }

    @Override
    public Product getProduct() {
	return product0;
    }

}
