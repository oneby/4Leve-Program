package module;

public class FanLowCommand implements Command{
	private Fan fan;
	public FanLowCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.setStatue(3);
		fan.lowSpeed();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
