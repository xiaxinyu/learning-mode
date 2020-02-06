package com.learning.mode.cof;

import org.junit.Test;

public class COFTest {
	@Test
	public void testCOF() {
		Auditing manager = new Manager(null);
		Auditing deptManager = new DepartmentManager(manager);
		Auditing leader = new TeamLeader(deptManager);
		Auditing worker = new Worker(leader);

		worker.approve(500);
		worker.approve(1500);
	}
}
