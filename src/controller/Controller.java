package controller;

import controller.factory.AbstractFactory;
import controller.factory.FanFactory;
import module.Fan;
import module.RemoteControl;
import module.Subject;
import view.FanView;
import view.Observer;

public class Controller {
	private Subject subject;
	private Observer observer;
	private RemoteControl rc;

	public Controller() {
		// TODO Auto-generated constructor stub
		rc = new RemoteControl();
		AbstractFactory factory = FanFactory.getInstance();
		factory.oneMore();
		subject = factory.getSubject();
		observer = factory.getObserver();
		subject.registerObserver(observer);
		rc.setCommand(factory.getOnCommand(), factory.getOffCommand(), factory.getLowCommand(),
				factory.getMidCommand(), factory.getHighCommand(), factory.getToHotCommand());
//		fan = new Fan();
//		fanView = new FanView();
//		fan.registerObserver(fanView);
//		rc.setCommand(new FanOnCommand(fan), new FanOffCommand(fan), new FanLowCommand(fan), new FanMidCommand(fan),
//				new FanHighCommand(fan), new FanToHotCommand(fan));
		//fanView = new DecoratorSupportFanView(new DecoratorSupportFanView(new DecoratorSupportFanView(fanView)));
	}

	public Subject getSubjects() {
		return subject;
	}

	public Observer getObservers() {
		return observer;
	}

	public RemoteControl getRc() {
		return rc;
	}

}
