package com.with.observer.v0;

public class ScrollBar extends Observer {
	
	void moveScrollBar() {
		System.out.println("Move ScrollBar");
	}

	@Override
	void update() {
		moveScrollBar();
	}

}
