package com.learning.mode.proxy.dynamic.jdk;

import org.junit.Test;
import com.learning.mode.proxy.statics.IUser;
import com.learning.mode.proxy.statics.SummerUserImpl;

public class DynamicProxyTest {
	@Test
	public void testSayHello(){
		IUser userProxy = (IUser)JDKDynamicProxy.newProxy(new SummerUserImpl());
		userProxy.sayHello("Dynamic Proxy");
	}
}
