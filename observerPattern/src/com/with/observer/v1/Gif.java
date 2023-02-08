package com.with.observer.v1;

public class Gif extends Observer {
	
	private String gif;

	public Gif(String gif,Subject sb) {
		super(sb);
		this.gif = gif;
	}
	
	void showGif() {
		System.out.println("Gif: "+gif);
	}

	@Override
	void update() {
		showGif();
	}

}
