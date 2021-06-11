package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;
	BasePage basepage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String username, String password) throws Throwable {
		loginPage.enterCredentials(username, password);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		loginPage.clickLoginButton();
	}

	@Then("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() throws Throwable {
		loginPage.getPageTitle();
	}

	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		loginPage.clickBankandCashbutton();
	}

	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		loginPage.clickNewAccountbutton();
	}

	@When("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accountTitle,
			String description, String initialBalance, String accountNumber, String contactPerson, String phone,
			String internetBankingUrl) throws Throwable {
		loginPage.FillUpTheFormAndClicksOnSubmitButton(accountTitle, description, initialBalance, accountNumber,
				contactPerson, phone, internetBankingUrl);
	}

	@Then("^User should be able to validate new account created$")
	public void user_should_be_able_to_validate_new_account_created() throws Throwable {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getPageTitle1();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenshotAtTheEndOfTest(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}