package com.sin.observer;

public class Mouse {
	
	//ALTO ACOMPLAMIENTO O ALTA DEPENDENCIA
	Text txt = new Text("Hello");
	ScrollBar sb = new ScrollBar();
	Image img = new Image("Duck");
	
	void click() {
		txt.showText();
		sb.moveScrollBar();
		img.showImage();
	}

}
