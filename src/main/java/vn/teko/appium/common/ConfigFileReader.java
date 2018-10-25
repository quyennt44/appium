package vn.teko.appium.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= "src/main/resources/configs/Configuration.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getDeviceName(){
		String deviceName = properties.getProperty("deviceName");
		if(deviceName!= null) return deviceName;
		else throw new RuntimeException("deviceName not specified in the Configuration.properties file.");		
	}
		
	public String getUDID() {
		String udid = properties.getProperty("udid");
		if(udid != null) return udid;
		else throw new RuntimeException("udid not specified in the Configuration.properties file.");
	}
	
	public String getPlatformName(){
		String platformName = properties.getProperty("platformName");
		if(platformName!= null) return platformName;
		else throw new RuntimeException("platformName not specified in the Configuration.properties file.");		
	}	

	public String getPlatforVersion(){
		String platformVersion = properties.getProperty("platformVersion");
		if(platformVersion!= null) return platformVersion;
		else throw new RuntimeException("platformVersion not specified in the Configuration.properties file.");		
	}	
	
	public String getTestName(){
		String testName = properties.getProperty("testName");
		if(testName!= null) return testName;
		else throw new RuntimeException("testName not specified in the Configuration.properties file.");		
	}
	
	public String getAppPackage(){
		String appPackage = properties.getProperty("appPackage");
		if(appPackage!= null) return appPackage;
		else throw new RuntimeException("appPackage not specified in the Configuration.properties file.");		
	}
	
	public String getAppActivity(){
		String appActivity = properties.getProperty("appActivity");
		if(appActivity!= null) return appActivity;
		else throw new RuntimeException("appActivity not specified in the Configuration.properties file.");		
	}	
	
	public String getGridServerUrl(){
		String gridServerUrl = properties.getProperty("gridURL");
		if(gridServerUrl!= null) return gridServerUrl;
		else throw new RuntimeException("gridServerUrl not specified in the Configuration.properties file.");		
	}	
	
	public String getNoReset(){
		String noReset = properties.getProperty("noReset");
		if(noReset!= null) return noReset;
		else throw new RuntimeException("noReset not specified in the Configuration.properties file.");		
	}		
	
}
