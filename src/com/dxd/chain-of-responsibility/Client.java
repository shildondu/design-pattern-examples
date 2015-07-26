package com.dxd.chain-of-responsibility;

/**
 * The client.
 * @author Shildon
 *
 */
public class Client {

	public void main(String[] args) {

		Handler handler0 = new ConcreteHandler();
		Handler handler1 = new ConcreteHandler();

		handler0.setNextHandler(handler1);

		handler0.handleRequest();
	
	}

}
