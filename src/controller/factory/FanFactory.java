package controller.factory;

import module.Command;
import module.Fan;
import module.FanHighCommand;
import module.FanLowCommand;
import module.FanMidCommand;
import module.FanOffCommand;
import module.FanOnCommand;
import module.FanToHotCommand;
import module.Subject;
import view.FanView;
import view.Observer;

public class FanFactory implements AbstractFactory{
	private Fan fan;
	private FanView fanView;
	private FanOnCommand fanOnCommand;
	private FanOffCommand fanOffCommand;
	private FanLowCommand fanLowCommand;
	private FanMidCommand fanMidCommand;
	private FanHighCommand fanHighCommand;
	private FanToHotCommand fanToHotCommand;
	private static FanFactory Instance;
	
	private FanFactory(){
		
	}
	
	public static FanFactory getInstance(){
		if(Instance==null){
			Instance = new FanFactory();
		}
		return Instance;
	}
	@Override
	public void oneMore() {
		// TODO Auto-generated method stub
		fan = new Fan();
		fanView = new FanView();
		new Thread(fanView).start();
		fanOnCommand = new FanOnCommand(fan);
		fanOffCommand = new FanOffCommand(fan);
		fanLowCommand = new FanLowCommand(fan);
		fanMidCommand = new FanMidCommand(fan);
		fanHighCommand = new FanHighCommand(fan);
		fanToHotCommand = new FanToHotCommand(fan);
	}

	@Override
	public Subject getSubject() {
		// TODO Auto-generated method stub
		return fan;
	}

	@Override
	public Command getOnCommand() {
		// TODO Auto-generated method stub
		return fanOnCommand;
	}

	@Override
	public Command getOffCommand() {
		// TODO Auto-generated method stub
		return fanOffCommand;
	}

	@Override
	public Command getToHotCommand() {
		// TODO Auto-generated method stub
		return fanToHotCommand;
	}

	@Override
	public Command getLowCommand() {
		// TODO Auto-generated method stub
		return fanLowCommand;
	}

	@Override
	public Command getMidCommand() {
		// TODO Auto-generated method stub
		return fanMidCommand;
	}

	@Override
	public Command getHighCommand() {
		// TODO Auto-generated method stub
		return fanHighCommand;
	}

	@Override
	public Observer getObserver() {
		// TODO Auto-generated method stub
		return fanView;
	}

}
