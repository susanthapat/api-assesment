package com.assurity.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyValue {
	private static PropertyValue propertyValue = null;
	private Properties prop = null;

	private PropertyValue() {
		prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("src/config.properties");
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static PropertyValue getInstance() {
		if (propertyValue == null) {
			propertyValue = new PropertyValue();
		}
		return propertyValue;
	}

	public String getPropertyValue(String key) {

		return prop.getProperty(key);
	}

}
