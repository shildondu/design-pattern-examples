package com.dxd.iterator;

/**
 * The interface of iterator.
 * @author Shildon
 *
 */
public interface Iterator {

	// set the index to the first one.
	public void first();

	// set the index to the next one.
	public void next();

	// get the current item.
	public Object currentItem();

}
