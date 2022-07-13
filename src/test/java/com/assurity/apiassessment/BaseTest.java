package com.assurity.apiassessment;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.assurity.listeners.TestListener;
import com.assurity.utilities.PropertyValue;

@Listeners(TestListener.class)
public class BaseTest {

	protected PropertyValue prop = PropertyValue.getInstance();
	protected String base_URI;

	@BeforeTest
	public void setUp() {

		String environment;

		/*
		 * This code block caters facility for changing the environment through system
		 * variables or property files without touching the code.
		 */

		if (System.getProperty("ENVIRONMENT") == null) {
			environment = prop.getPropertyValue("ENVIRONMENT");
		} else {
			environment = System.getProperty("ENVIRONMENT");
		}
		base_URI = prop.getPropertyValue(environment + "_BASE_URI");
	}

}
