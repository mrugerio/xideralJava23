package com.with.observer.v1;

public class ScrollBar extends Observer {
	
	ScrollBar(Subject sb){
		super(sb);
	}
	
	void moveScrollBar() {
		System.out.println("Move ScrollBar");
	}

	@Override
	void update() {
		moveScrollBar();
	}

}
