package com.designpattern.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		//Cricket obj = new ODICricket();
		//Cricket obj = new TestCricket();
		//obj.formatOfTheGame();
		CricketFactory cricketFactory = new CricketFactory();
		cricketFactory.getCricketFormat("odi").formatOfTheGame();

	}

}
