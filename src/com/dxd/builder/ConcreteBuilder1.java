package com.dxd.builder;

/**
 * 产品1建造者,负责零件的构造
 * @author Shildon
 *
 */
public class ConcreteBuilder1 implements Builder {
    
    private Product1 product1 = new Product1();

    @Override
    public void buildPart0() {
	product1.setPart0(0);
	System.out.println("build part0 of product1 as " + product1.getPart0());
    }

    @Override
    public void buildPart1() {
	product1.setPart1(1);
	System.out.println("build part1 of product1 as " + product1.getPart1());
    }

    @Override
    public Product getProduct() {
	return product1;
    }
    
}
