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
		System.out.println("���ȴ���");
		notifyObservers();
	}

	public void off() {
		statue = 0;
		System.out.println("���ȹر���");
		notifyObservers();
	}

	public void toHot() {
		statue = 2;
		System.out.println("���ȿ�ʼ������");
		notifyObservers();
	}

	public void lowSpeed() {
		statue = 3;
		System.out.println("����һ��");
		notifyObservers();
	}

	public void midSpeed() {
		statue = 4;
		System.out.println("���ȶ���");
	}

	public void highSpeed() {
		statue = 5;
		System.out.println("��������");
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
