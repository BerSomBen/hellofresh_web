package com.hellofresh.challange.commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Class that loads settings from config.properties
 * 
 * @author Brant Unger
 *
 */
public class Settings {
	public static String browser = new String();
	public static String HOMEURL = new String();
	public static String SAMPLEPRODUCTID = new String();
	public static String SAMPLECATEGORYID = new String();

	/**
	 * Load settings from config.properties
	 */
	public static void load() {
		try {
			Properties appSettings = new Properties();
			FileInputStream fis = new FileInputStream("config.properties"); // put config properties file to buffer
			appSettings.load(fis); // load config.properties file

			// This is where you add your config variables:
			browser = (String) appSettings.get("browser");
			HOMEURL = (String) appSettings.get("HOMEURL");
			SAMPLEPRODUCTID = (String) appSettings.get("SAMPLEPRODUCTID");
			SAMPLECATEGORYID = (String) appSettings.get("SAMPLECATEGORYID");

			fis.close();

		} catch (IOException e) {
			System.out.println("Could not load settings file.");
			System.out.println(e.getMessage());
		}
	}

}