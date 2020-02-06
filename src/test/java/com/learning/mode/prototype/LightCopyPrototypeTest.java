package com.learning.mode.prototype;

import com.learning.mode.prototype.lightcopy.Prototype;
import org.junit.Assert;
import org.junit.Test;

public class LightCopyPrototypeTest {
	@Test
	public void testPrototype() {
		Prototype pro = new Prototype();
		pro.setName("original object");
		Prototype pro1 = (Prototype) pro.clone();		
		Assert.assertNotEquals(pro , pro1);
		Assert.assertEquals(pro.getName(), pro1.getName());
	}
}
