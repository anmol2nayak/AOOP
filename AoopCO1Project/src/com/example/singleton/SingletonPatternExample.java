package com.example.singleton;

public class SingletonPatternExample {
	public static void main(String[] args) {
        // Get the single instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.showConfiguration();
    }

}
