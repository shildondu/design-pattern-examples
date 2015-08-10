package com.dxd.bridge;

/**
 * The abstract class.
 * @author Shildon
 *
 */
public abstract class Abstract {

	private Implementor implementor;

	public abstract void doImpl() {
		implementor.doImpl();
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

}
