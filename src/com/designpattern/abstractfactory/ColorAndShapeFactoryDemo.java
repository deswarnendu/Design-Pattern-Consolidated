package com.designpattern.abstractfactory;

public class ColorAndShapeFactoryDemo {

	public static void main(String[] args) {
		ColorAndShapeFactory colorAndShapeFactory = new ColorAndShapeFactory();
		AbstractFactory abstractFactoryColor = colorAndShapeFactory.getFactory("color");
		Color c = abstractFactoryColor.getColor("red");
		c.paint();

		AbstractFactory abstractFactoryShape = colorAndShapeFactory.getFactory("shape");
		Shape s = abstractFactoryShape.getShape("circle");
		s.draw();

	}

}
