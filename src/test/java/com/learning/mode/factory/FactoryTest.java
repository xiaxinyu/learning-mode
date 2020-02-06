package com.learning.mode.factory;

import com.learning.mode.factory.bean.Phone;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
	@Test
	public void testFactory1() {
		Phone phone = PhoneFactory.createPhone();
		Assert.assertFalse(new Phone("Mi-001", "Mi").equals(phone));
	}
}