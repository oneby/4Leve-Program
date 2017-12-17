package module;

import java.util.ArrayList;

import view.Observer;

public abstract class Subject {
	protected ArrayList<Observer> observers = new ArrayList<Observer>();

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public abstract void notifyObservers();

}
