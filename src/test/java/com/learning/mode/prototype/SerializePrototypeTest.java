package com.learning.mode.prototype;

import com.learning.mode.prototype.serialize.NewSerializePrototype;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.learning.mode.prototype.serialize.SerializePrototype;

public class SerializePrototypeTest {
	private Logger logger = Logger.getLogger(SerializePrototypeTest.class);

	@Test
	public void testNewPrototype() {
		SerializePrototype po = new SerializePrototype();
		po.setName("test1");
		NewSerializePrototype se = new NewSerializePrototype();
		se.setSerializePrototype(po);

		NewSerializePrototype deepClone = (NewSerializePrototype) se.deepClone();
		deepClone.getSerializePrototype().setName("test2");

		logger.info("original name:" + se.getSerializePrototype().getName());
		logger.info("cloned name:" + deepClone.getSerializePrototype().getName());
	}
}
