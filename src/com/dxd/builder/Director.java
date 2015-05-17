package com.dxd.builder;

/**
 * 导演者类，负责指示构造顺序
 * @author Shildon
 *
 */
public class Director {
    private Builder builder0;
    private Builder builder1;
    
    public Product construct0() {
	builder0 = new ConcreteBuilder0();
	builder0.buildPart0();
	builder0.buildPart1();
	return builder0.getProduct();
    }
    
    public Product construct1() {
	builder1 = new ConcreteBuilder1();
	builder1.buildPart0();
	builder1.buildPart1();
	return builder1.getProduct();
    }
    
}
