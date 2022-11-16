package controlExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReadControl {
	Properties prop;
	public ConfigReadControl() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\WebAutomation\\TestData\\config.properties");
		prop = new Properties();
        prop.load(fis);
	}
	public String getBrowser() {
		// TODO Auto-generated method stub
		 return prop.getProperty("AppUrl");
	}
	

}
