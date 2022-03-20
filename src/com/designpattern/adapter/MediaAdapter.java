package com.designpattern.adapter;

public class MediaAdapter implements MediaPlayer {

	@Override
	public void play(String fileType, String fileName) {
		if (fileType != null && fileType.equalsIgnoreCase("mp4")) {
			System.out.println("Media player playing " + fileName + " having " + fileType + " format");

		} else if (fileType != null && fileType.equalsIgnoreCase("avi")) {
			System.out.println("Media player playing " + fileName + " having " + fileType + " format");
		} else {
			System.out.println("Media player can't play " + fileType + " format");
		}

	}

}
