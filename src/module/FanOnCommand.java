package module;

public class FanOnCommand implements Command{
	private Fan fan;
	public FanOnCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.setStatue(1);
		fan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.setStatue(0);
		fan.off();
	}

}
