package com.learning.mode.proxy.statics;

import org.junit.Test;

/**
 * @author summer.xia
 */
public class StaticProxyTest {
	@Test
	public void testSayHello() {
		IUser user = new SummerUserImpl();
		UserProxy proxy = new UserProxy(user);
		proxy.sayHello("Proxy");
	}
}
