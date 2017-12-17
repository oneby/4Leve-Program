package module;

public class FanToHotCommand implements Command{
	private Fan fan;
	public FanToHotCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.setStatue(2);
		fan.toHot();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.setStatue(1);
	}
	
}
