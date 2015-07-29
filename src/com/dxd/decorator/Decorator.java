package com.dxd.decorator;

/**
 * The abstract decorator.
 *
 */
public abstract Decorator implements Simple {

	protected Simple simple;

	public void setSimple(Simple simple) {
		this.simple = simple;
	}

	public Simple getSimple() {
		return this.simple;
	}

	// do more thing in this method.
	protected abstract doMoreThing();

	public void doSimpleThing() {
		doMoreThing();
		simple.doSimpleThing();
	}

}
