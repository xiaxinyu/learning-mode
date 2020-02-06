package com.learning.mode.memonto;

public class Memento {
	private Status status;

	public Memento(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
