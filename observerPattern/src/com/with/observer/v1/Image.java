package com.with.observer.v1;

public class Image extends Observer {
	
	private String img;

	public Image(String img, Subject sb) {
		super(sb);
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
