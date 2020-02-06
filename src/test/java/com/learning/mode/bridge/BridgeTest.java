package com.learning.mode.bridge;

import org.junit.Test;

public class BridgeTest {
	@Test
	public void testBridge() {
		Goods goods = new IPhone();
		Box box = new CircularBox(goods);
		box.showExterior();
	}
}
