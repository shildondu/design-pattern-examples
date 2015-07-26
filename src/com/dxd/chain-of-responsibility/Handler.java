package com.dxd.chain-of-responsibility;

/**
 * The abstract handler.
 * @author Shildon
 *
 */
public abstract class Handler {

	// specify the next handler.
	protected Handler nextHandler;

	public void handleRequest();

	public void setNextHandler(Handler handler) {
		nextHandler = handler;
	}

	public Handler getNextHandler() {
		return this.nextHandler;
	}

}
