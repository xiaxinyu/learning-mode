package com.learning.mode.strategy;

public class Price {
	private MemberPrice memberPrice;

	public Price(MemberPrice memberPrice) {
		this.memberPrice = memberPrice;
	}

	public double calcPrice(double price) {
		return this.memberPrice.calcPrice(price);
	}
}
