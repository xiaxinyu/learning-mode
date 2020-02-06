package com.learning.mode.command;

public class DownVoiceCommand implements Command {
	private Receiver receiver;

	public DownVoiceCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void action() {
		receiver.execute();
	}
}
