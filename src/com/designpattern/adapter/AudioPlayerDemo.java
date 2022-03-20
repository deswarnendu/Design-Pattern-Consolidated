package com.designpattern.adapter;

public class AudioPlayerDemo {

	public static void main(String[] args) {
		AudioAdapter audioAdapter = new AudioAdapter();
		audioAdapter.play("mp3", "A1.mp3");
		audioAdapter.play("avi", "A2.avi");
		audioAdapter.play("mp4", "A3.mp4");
		audioAdapter.play("mkv", "A4.mkv");

	}

}
