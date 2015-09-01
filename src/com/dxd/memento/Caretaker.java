package com.dxd.memento;

/**
 * @author Shildon
 *
 */
public class Caretaker {

	private MementoIF memento;

	public MementoIF retireMemento() {
		return this.memento;
	}

	public void saveMemento(MementoIF memento) {
		this.memento = memento;
	}

}
