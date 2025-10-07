package com.AutomationExercise.Utils;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class configReader {
	    private static Properties prop;

	    public static void loadConfig() {
	        prop = new Properties();
	        try (FileInputStream fis = new FileInputStream("/PracticeTestNG/src/test/java/com/resources/config.properties")) {
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
	
	

