package com.learning.mode.util;

public class ReflectUtil {
	public static Object getObject(String className) {
		try {
			return Class.forName(className).newInstance();
		} catch (Exception e) {
			return null;
		}
	}
}