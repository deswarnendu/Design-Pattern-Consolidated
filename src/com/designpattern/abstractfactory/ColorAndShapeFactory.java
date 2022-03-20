package com.designpattern.abstractfactory;

public class ColorAndShapeFactory {
	public AbstractFactory getFactory(String typeOfFactory) {
		if (typeOfFactory.equalsIgnoreCase("color")) {
			return new ColorFactory();
		} else if (typeOfFactory.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else {
			return null;
		}

	}
}
