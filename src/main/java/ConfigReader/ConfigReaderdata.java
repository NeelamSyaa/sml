package ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderdata {
	 private static Properties prop;

	    public static Properties loadProperties() {

	        try (FileInputStream file = new FileInputStream(
	                System.getProperty("user.dir") +
	                "/src/test/resources/config.properties")) {

	        	prop = new Properties();
	        	prop.load(file);

	        } catch (IOException e) {
	            throw new RuntimeException("❌ Failed to load config.properties", e);
	        }

	        return prop;
	    }
}
