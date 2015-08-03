package com.dxd.proxy;

/**
 * The concrete class which is proxyed.
 * @author
 *
 */
public class Concrete implements Common {

	@Override
	public void doSomething() {
		System.out.println("I do something");
	}

}
