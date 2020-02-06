package com.learning.mode.command;

import org.apache.log4j.Logger;

public class UpVoiceReceiver implements Receiver {
	private Logger logger = Logger.getLogger(UpVoiceReceiver.class);
	
	@Override
	public void execute() {
		logger.info("execute down voice command");
	}

}
