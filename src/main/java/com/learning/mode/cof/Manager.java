package com.learning.mode.cof;

public class Manager extends Auditing {
	public Manager(Auditing auditing) {
		super(auditing);
	}

	@Override
	public void approve(double expense) {
		logger.info("Manager approves the expense.");
	}
}
