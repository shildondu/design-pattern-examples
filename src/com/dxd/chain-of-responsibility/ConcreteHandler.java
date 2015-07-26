package com.dxd.chain-of-responsibility;

/**
 * the concrete handler which extends Handler.
 * @author Shildon
 *
 */
public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {

		System.out.println("I do something.");

		if (null != getNextHandler()) {
			getNextHandler().handleRequest();
		}
	
	}

}
