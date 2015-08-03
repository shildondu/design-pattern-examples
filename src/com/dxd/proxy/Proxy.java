package com.dxd.proxy;

/**
 * The proxy class.
 * @author
 *
 */
public class Proxy implements Common {

	private Concrete concrete;

	public Proxy {
		this.concrete = concrete;
	}

	public void before() {
		System.out.println("do something before");
	}

	public void after() {
		System.out.println("do something after");
	}

	@Override
	public void doSomething() {
		this.before();
		concrete.doSomething();
		this.after();
	}

}
