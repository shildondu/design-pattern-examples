package com.dxd.memento;

/**
 * @author Shildon
 *
 */
public class Originator {

	private String state;

	// create the memento.
	public MementoIF createMemento() {
		return new Memento(this.state);
	}

	// restore the state.
	public void restoreMemento(MementoIF memento) {
		Memento aMemento = (Memento)memento;
		this.setState(memento.getState());
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	protected class Memento implements MementoIF {

		private String savedState;

		private Memento(String savedState) {
			this.savedState = savedState;
		}

		private void setSavedState(String savedState) {
			this.savedState = savedState;
		}

		private String getSavedState() {
			return this.savedState;
		}

}
