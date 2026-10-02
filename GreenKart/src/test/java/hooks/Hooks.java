package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		WebDriver driver = new ChromeDriver();
        DriverManager.setDriver(driver);
	}
	
	@After
	public void tearDown() {
		DriverManager.getDriver().quit();
		DriverManager.unload();
	}
}
