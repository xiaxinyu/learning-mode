package com.learning.mode.decoration;

import org.junit.Test;

public class TestDecoration {
	@Test
	public void testCoding() {
		Project programer = new Programer();

		Project saler = new Saler(programer);
		saler.coding();

		Project ba = new BusinessAnalyst(programer);
		ba.coding();

		Project tester = new Tester(programer);
		tester.coding();
		
		Project manager = new ProjectManager(new Saler(new BusinessAnalyst(new Tester(new Programer()))));
		manager.coding();
	}
}
