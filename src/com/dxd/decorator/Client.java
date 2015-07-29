package com.dxd.decorator;

/**
 * The client.
 *
 */
public class Client {

	public void main(String[] args) {
		Simple simple = new ConcreteSimple();
		Simple more = new ConcreteDecorator(simple);
		simple.doSimpleThing();
		more.doMoreThing();
	}

}
