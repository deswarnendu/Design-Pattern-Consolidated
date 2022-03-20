package com.designpattern.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {

		if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		} else {
			return null;
		}

	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
