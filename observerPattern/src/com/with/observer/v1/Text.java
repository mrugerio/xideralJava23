package com.with.observer.v1;

public class Text extends Observer {
	
	private String label;

	public Text(String label, Subject sb) {
		super(sb);
		this.label = label;
	}
	
	void showText() {
		System.out.println(label);
	}

	@Override
	void update() {
		showText();
	}

}
