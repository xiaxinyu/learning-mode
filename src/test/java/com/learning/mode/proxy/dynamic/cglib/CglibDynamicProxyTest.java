package com.learning.mode.proxy.dynamic.cglib;

import com.learning.mode.proxy.statics.IUser;
import com.learning.mode.proxy.statics.SummerUserImpl;
import org.junit.Test;

public class CglibDynamicProxyTest {
	@Test
	public void testSayHello(){
		CglibDynamicProxy proxy = new CglibDynamicProxy();
		IUser user = (IUser)proxy.getInstance(new SummerUserImpl());
		user.sayHello("Cglib Dynamic Proxy");
	}
}
