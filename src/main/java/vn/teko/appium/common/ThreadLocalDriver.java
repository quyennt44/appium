package vn.teko.appium.common;

import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {

    @SuppressWarnings("rawtypes")
	private static ThreadLocal<AndroidDriver> tlDriver = new ThreadLocal<>();

    @SuppressWarnings("rawtypes")
	public synchronized static void setTLDriver(AndroidDriver driver) {
        tlDriver.set(driver);
    }

    @SuppressWarnings("rawtypes")
	public synchronized static AndroidDriver getTLDriver() {
        return tlDriver.get();
    }
}
