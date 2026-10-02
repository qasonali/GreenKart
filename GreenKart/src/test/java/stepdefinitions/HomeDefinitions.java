package stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeDefinitions {
	HomePage homepage;
	List<WebElement> products;

	@Given("User is opened the application")
	public void user_is_opened_the_application() throws IOException {
		homepage = new HomePage();
	}

	@Given("the user is on home screen")
	public void the_user_is_on_home_screen() {
		boolean homeVisible = homepage.checkHomeDisplayed();
		Assert.assertTrue(homeVisible);
	}

	@When("User enters product name {string} on search box")
	public void user_enters_product_name_on_search_box(String string) {

		homepage.validNameSearch(string);

	}

	@Then("relevant search result should be displayed")
	public void relevant_search_result_should_be_displayed() {

		products = homepage.displaySearchResult();
		Assert.assertTrue(products.size() > 0, "No suggestions displayed");
	}

	@Then("result shows items that contains letter {string}")
	public void result_shows_items_that_contains_letter(String string) {
		if (products.size() > 0) {
			for (WebElement prod : products) {
				Assert.assertTrue(prod.getText().contains(string));
			}
		}

	}
	
	@When("the user enters {string} in the search box")
	public void the_user_enters_brocolli_in_the_search_box(String keyword) {
	    // Write code here that turns the phrase above into concrete actions
		homepage.validNameSearch(keyword);		
	}
	
	@Then("search results should be displayed for {string}")
	public void search_results_should_be_displayed_for_string(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (products.size() > 0) {
			for (WebElement prod : products) {
				Assert.assertTrue(prod.getText().contains(string));
			}
		}
	}
	
	@When("User enters product name as {string} in the search box.")
	public void the_user_enters_prod_name_search_box(String keyword) {
	    // Write code here that turns the phrase above into concrete actions
		homepage.validNameSearch(keyword);
		

		
	}
	@Then("a message {string} should displayed")
	public void no_prod_msg(String string) {
		WebElement error_msg=homepage.checkMessage(string);
		Assert.assertTrue(error_msg.isDisplayed());
	}
	 

}
