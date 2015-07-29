package com.dxd.decorator;

/**
 * The concrete decorator class.
 *
 */
public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Simple simple) {
		this.simple = simple;
	}

	@Override
	protected void doMoreThing() {
		System.out.println("I can do more thing! ^_^);
	}

}
