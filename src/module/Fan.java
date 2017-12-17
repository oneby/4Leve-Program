package module;

import view.Observer;

public class Fan extends Subject {
	private int statue = 0;
	public int isStatue(){
		return statue;
	}
	public void setStatue(int statue){
		this.statue = statue;
		this.notifyObservers();
	}
	public void on() {
		statue = 1;
		System.out.println("风扇打开了");
		notifyObservers();
	}

	public void off() {
		statue = 0;
		System.out.println("风扇关闭了");
		notifyObservers();
	}

	public void toHot() {
		statue = 2;
		System.out.println("风扇开始加热了");
		notifyObservers();
	}

	public void lowSpeed() {
		statue = 3;
		System.out.println("风扇一档");
		notifyObservers();
	}

	public void midSpeed() {
		statue = 4;
		System.out.println("风扇二档");
	}

	public void highSpeed() {
		statue = 5;
		System.out.println("风扇三档");
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(statue);
		}
	}

}
