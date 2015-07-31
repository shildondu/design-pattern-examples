package com.dxd.composite;

/**
 * the picture of the graphics.
 * @author
 *
 */
public class Picture implements Graphics {

	private List<Graphics> graphics;

	@Override
	public void draw() {
		System.out.println("draw a picture");
	}

	public void add(Graphics graphic) {
		graphics.add(graphic);
	}

	public void remove(Graphics graphic) {
		graphics.remove(graphic);
	}

	public void getGraphics() {
		return this.graphics;
	}

}
