package module;

public class FanMidCommand implements Command{
	private Fan fan;
	public FanMidCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.setStatue(4);
		fan.midSpeed();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
