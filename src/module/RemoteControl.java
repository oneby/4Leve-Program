package module;

public class RemoteControl {
	private Command onCommand;
	private Command offCommand;
	private Command lowCommand, midCommand, highCommand, toHotCommand, undoCommand;

	public void setCommand(Command onCommand, Command offCommand, Command lowCommand, Command midCommand,
			Command highCommand, Command toHotCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
		this.lowCommand = lowCommand;
		this.midCommand = midCommand;
		this.highCommand = highCommand;
		this.toHotCommand = toHotCommand;
	}

	public void turnOn() {
		onCommand.execute();
		this.undoCommand = onCommand;
	}

	public void turnOff() {
		offCommand.execute();
		this.undoCommand = offCommand;
	}

	public void toHot() {
		toHotCommand.execute();
		this.undoCommand = toHotCommand;
	}

	public void lowSpeed() {
		lowCommand.execute();
	}

	public void midSpeed() {
		midCommand.execute();
	}

	public void highSpeed() {
		highCommand.execute();
	}

	public void undo() {
		this.undoCommand.undo();
	}
}
