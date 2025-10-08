package com.AutomationExercise.Utils;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ConfigReader {
	    private static Properties prop;

	    public static void loadConfig() {
	        prop = new Properties();
	        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\resources\\config.properties")) {
	            prop.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String get(String key) {
	        if (prop == null) {
	            loadConfig();
	        }
	        return prop.getProperty(key);
	    }
	}
	
	

