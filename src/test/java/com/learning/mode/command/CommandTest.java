package com.learning.mode.command;

import org.junit.Test;

public class CommandTest {
	@Test
	public void testCommand() {
		Receiver r1 = new PowerReceiver();
		Receiver r2 = new UpVoiceReceiver();
		Receiver r3 = new DownVoiceReceiver();

		Command c1 = new PowerCommand(r1);
		Command c2 = new UpVoiceCommand(r2);
		Command c3 = new DownVoiceCommand(r3);

		String n1 = "Power";
		String n2 = "UpVoice";
		String n3 = "DownVoice";
		Button b1 = new Button(n1, c1);
		Button b2 = new Button(n2, c2);
		Button b3 = new Button(n3, c3);

		Keyboard keyboard = new Keyboard();
		keyboard.addButton(b1);
		keyboard.addButton(b2);
		keyboard.addButton(b3);

		keyboard.click(n1);
		keyboard.click(n2);
		keyboard.click(n3);
	}
}
