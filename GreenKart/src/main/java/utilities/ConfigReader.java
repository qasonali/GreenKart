package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	 Properties prop;
	 
	public ConfigReader() throws IOException {
		// TODO Auto-generated constructor stub
		    prop = new Properties();
			FileInputStream fis;
			try {
				fis = new FileInputStream("src/test/resources/config.properties");
				prop.load(fis);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public Object getBaseURL() {
		return prop.get("baseurl");
	}

}
