package com.dxd.command;

/**
 * The concrete command which implements command.
 * @author Shildon
 *
 */
public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();
	}

}
