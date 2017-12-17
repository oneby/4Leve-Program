package module;

public class FanOffCommand implements Command{
	private Fan fan;
	public FanOffCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.setStatue(0);
		fan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.setStatue(1);
		fan.on();
	}

}
