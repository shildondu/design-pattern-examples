package com.dxd.state;

/**
 * @author Shildon
 *
 */
public class Context {

	private State state;

	public void do() {
		state.do();
	}

	public void setState(State state) {
		this.state = state;
	}

}
