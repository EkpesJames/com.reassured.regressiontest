package com.reassured.drivers.fileReaders;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "config.properties";

    //Read the config file
    public ConfigFileReader() {
        InputStream input = getClass().getClassLoader().getResourceAsStream(propertyFilePath);
        properties = new Properties();
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDriverPath() {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null)
            return driverPath;
        else
            throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getScreenshotPath() {
        String screenShotPath = properties.getProperty("screenShotPath");
        if (screenShotPath != null)
            return screenShotPath;
        else
            throw new RuntimeException("ScreenShotPath Path not specified in the Configuration.properties file for the Key:screenShotPath");
    }

}
