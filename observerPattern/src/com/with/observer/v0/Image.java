package com.with.observer.v0;

public class Image extends Observer {
	
	private String img;

	public Image(String img) {
		this.img = img;
	}
	
	void showImage() {
		System.out.println(img);
	}

	@Override
	void update() {
		showImage();
	}

}
