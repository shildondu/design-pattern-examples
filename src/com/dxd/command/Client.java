package com.dxd.command;

/**
 * The client.
 * @author Shildon
 *
 */
public class Client {

	public void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
