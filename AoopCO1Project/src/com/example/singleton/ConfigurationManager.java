package com.example.singleton;

public class ConfigurationManager {
	 private static ConfigurationManager instance;

	    // Private constructor to prevent instantiation
	    private ConfigurationManager() {
	        // Initialize configuration settings here
	    }

	    // Public static method to provide access to the single instance
	    public static synchronized ConfigurationManager getInstance() {
	        if (instance == null) {
	            instance = new ConfigurationManager();
	        }
	        return instance;
	    }

	    public void showConfiguration() {
	        System.out.println("Configuration settings displayed.");
	    }
	}

	// Usage
	
