package com.learning.mode.strategy;

public class SilverMemberPrice implements MemberPrice {

	@Override
	public double calcPrice(double price) {
		logger.info("Silver members enjoy a 5% discount.");
		return price * 0.95;
	}

}
