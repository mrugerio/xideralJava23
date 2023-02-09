package com.with.observer.v1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	List<Observer> listaObservers = new ArrayList<>();
	
	void attach(Observer o) {
		listaObservers.add(o);
	}

	void detach(Observer o) {
		listaObservers.remove(o);
	}

	void notificar() {
		//System.out.println("*Notificar Observers*");
		for(Observer o:listaObservers)
			o.update();
	}

}
