package com.learning.mode.factory.service.impl;

import com.learning.mode.factory.bean.Phone;
import com.learning.mode.factory.service.IPhoneService;

public class MiServiceImpl implements IPhoneService {

	public Phone createPhone() {
		return new Phone("Mi-001","Mi");
	}

}
