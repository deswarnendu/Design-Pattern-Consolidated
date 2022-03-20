package com.designpattern.adapter;

public class AudioAdapter extends MediaAdapter {
	
	@Override
	public void play(String fileType, String fileName) {
		if (fileType != null && fileType.equalsIgnoreCase("mp3")) {
			System.out.println("Audio player playing " + fileName + " having " + fileType + " format");

		} else {
			super.play(fileType, fileName);
		}
	}

}
