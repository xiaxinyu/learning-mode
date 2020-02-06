package com.learning.mode.observer;

import org.junit.Test;

public class ObserverTest {
	@Test
	public void testObserver() {
		WeatherObserverable observable = new WeatherObserverable();
		observable.addObserver(new SummerObserver());
		observable.addObserver(new WinnerObserver());
		observable.setWeather("cloudy");
		observable.setWeather("rainy");
	}
}
