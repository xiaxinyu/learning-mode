package com.learning.mode.state;

import org.junit.Test;

public class StateTest {
	@Test
	public void testState() {
		VotePerson p = new VotePerson("summer");

		for (int i = 0; i < 10; i++) {
			p.vote("Chairman Mao");
		}
	}
}
