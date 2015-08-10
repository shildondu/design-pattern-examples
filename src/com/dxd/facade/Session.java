package com.dxd.facade;

/**
 * The facade called session.
 * @author Shildon
 *
 */
public class Session {

	private SubBean0 subBean0;
	private SubBean1 subBean1;

	public Session(SubBean0 subBean0, SubBean1 subBean1) {
		this.subBean0 = subBean0;
		this.subBean1 = subBean1;
	}

	public void sayHello() {
		subBean0.sayHello();
	}

	public void sayBye() {
		subBean1.sayBye();
	}

}
