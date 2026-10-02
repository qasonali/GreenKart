package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class HomePage extends BasePage {
	By search = By.xpath("//div[@class='search']");
	By logo =By.xpath("//div[@class='brand greenLogo']");
	By searchInput=By.xpath("//input[@type='search']");
	By productList=By.className("products");

	public HomePage() throws IOException {
		// TODO Auto-generated constructor stub
		initDriver();
	}

	public boolean checkHomeDisplayed() {
		boolean isSearchDisplayed = driver.findElement(search).isDisplayed();
		boolean isLogoDisplayed = driver.findElement(logo).isDisplayed();

		return isSearchDisplayed && isLogoDisplayed;
		
	}

	public void validNameSearch(String string) {
		driver.findElement(searchInput).sendKeys(string);	
	}
	
	public List<WebElement> displaySearchResult() {
        List<WebElement> suggestions = driver.findElements(productList);
        return suggestions;
	}

	public WebElement checkMessage(String string) {
		// TODO Auto-generated method stub
		WebElement error_msg=driver.findElement(By.xpath("//h2[text()='Sorry, no products matched your search!']"));
		return error_msg;
		
		
	}

}
