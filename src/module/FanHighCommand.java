package module;

public class FanHighCommand implements Command{
	private Fan fan;
	public FanHighCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.setStatue(5);
		fan.highSpeed();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
