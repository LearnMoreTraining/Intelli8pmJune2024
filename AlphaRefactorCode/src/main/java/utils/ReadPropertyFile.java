package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static String getValueFromPropertyFile(String key){
        File f = new File("src/main/resources/configuration/frameworkconfiguration.properties");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties = new Properties();
        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      return  properties.getProperty(key);
    }
}
