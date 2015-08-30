package com.dxd.iterator;

/**
 * The concrete aggregate.
 * @author Shildon
 *
 */
public class ConcreteAggregate extends Aggregate {

	private Object[] obj = { "shildon", "drake", "jason" };

	public Iterator createIterator() {
		return new Iterator();
	}

	private class ConcreteIterator implements Iterator {
		
		private int currentIndex = 0;

		@Override
		public void first() {
			currentIndex = 0;
		}

		@Override
		public void next() {
			if (currentIndex < obj.length) {
				currentIndex++;
			}
		}

		@Override
		public Object currentItem() {
			return obj[currentIndex];
		}

}
