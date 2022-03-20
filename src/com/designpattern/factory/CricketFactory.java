package com.designpattern.factory;

public class CricketFactory {
	
	public Cricket getCricketFormat(String formatName) {
		if(formatName.equalsIgnoreCase("odi")) {
			return new ODICricket();
		} else if(formatName.equalsIgnoreCase("test")) {
			return new TestCricket();
		} else if(formatName.equalsIgnoreCase("t20")){
			return new T20Cricket();
		}
		return null;
	}

}
