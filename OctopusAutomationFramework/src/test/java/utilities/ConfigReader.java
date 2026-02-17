package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties prop;

    public static void loadConfig() {

        try {
            prop = new Properties();

            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");

            prop.load(fis);

            System.out.println("Config file loaded successfully");

        } catch (IOException e) {

            System.out.println("Failed to load config file");

            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        if (prop == null) {
            loadConfig();
        }

        return prop.getProperty(key);
    }
}
