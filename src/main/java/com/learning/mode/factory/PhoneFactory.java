package com.learning.mode.factory;

import com.learning.mode.factory.bean.Phone;
import com.learning.mode.factory.service.IPhoneService;
import com.learning.mode.util.PropertiesUtil;
import com.learning.mode.util.ReflectUtil;

public class PhoneFactory {
	public static Phone createPhone() {
		String className = PropertiesUtil.getValue("phoneService");
		return ((IPhoneService) ReflectUtil.getObject(className)).createPhone();
	}
}
