package com.dxd.command;

/**
 * The invoker which invokes the command.
 * @author Shildon
 *
 */
public class Invoker {

	// the command it want to invoke.
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action {
		command.execute();
	}
}
