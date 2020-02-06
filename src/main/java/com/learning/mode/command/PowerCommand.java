package com.learning.mode.command;

public class PowerCommand implements Command {
	private Receiver receiver;

	public PowerCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void action() {
		receiver.execute();
	}
}
