package com.designpattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {

		return null;

	}

	@Override
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		} else {
			return null;
		}
	}

}
