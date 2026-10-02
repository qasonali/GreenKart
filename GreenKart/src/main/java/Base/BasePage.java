package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.Utility;

public class BasePage {

	protected WebDriver driver;

	protected ConfigReader configReader;

	public void initDriver() throws IOException {
		driver = DriverManager.getDriver();
		configReader = new ConfigReader();
		String url = configReader.getBaseURL().toString();
		driver.get(url);
		driver.manage().window().maximize();

	}
}
