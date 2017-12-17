package controller.factory;

import module.Command;
import module.Subject;
import view.Observer;

public interface AbstractFactory {
	public void oneMore();
	public Subject getSubject();
	public Command getOnCommand();
	public Command getOffCommand();
	public Command getToHotCommand();
	public Command getLowCommand();
	public Command getMidCommand();
	public Command getHighCommand();
	public Observer getObserver();
	
}
