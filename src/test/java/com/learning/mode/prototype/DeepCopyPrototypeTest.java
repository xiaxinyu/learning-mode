package com.learning.mode.prototype;

import com.learning.mode.prototype.lightcopy.Prototype;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.learning.mode.prototype.deepcopy.NewPrototype;

public class DeepCopyPrototypeTest {
	private Logger logger = Logger.getLogger(DeepCopyPrototypeTest.class);

	@Test
	public void testNewPrototype() {
		Prototype pro = new Prototype();
		pro.setName("original object");
		NewPrototype newObj = new NewPrototype();
		newObj.setId("test1");
		newObj.setPrototype(pro);

		NewPrototype copyObj = (NewPrototype) newObj.clone();
		copyObj.setId("testCopy");
		copyObj.getPrototype().setName("changed object");

		logger.info("original object id:" + newObj.getId());
		logger.info("original object name:" + newObj.getPrototype().getName());

		logger.info("cloned object id:" + copyObj.getId());
		logger.info("cloned object name:" + copyObj.getPrototype().getName());
	}
}
