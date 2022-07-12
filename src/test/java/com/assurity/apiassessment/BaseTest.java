package com.assurity.apiassessment;

import org.testng.annotations.BeforeTest;

import com.assurity.utilities.Propert_Value;

public class BaseTest {

	Propert_Value prop = Propert_Value.getInstance();
	String base_URI;

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
