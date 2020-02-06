package com.learning.mode.bridge;

public class RedBox extends Box {

	public RedBox(Goods goods) {
		super(goods);
	}

	@Override
	public void showExterior() {
		red();
		super.showExterior();
	}

	public void red() {
		logger.info("Generate red box");
	}
}
