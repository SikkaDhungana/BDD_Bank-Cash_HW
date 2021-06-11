package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.When;

public class LoginPage extends BasePage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement LOGIN_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement DASHBOARD_PAGE;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANKANDCASH_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEWACCOUNT_FIELD;

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement INTERNET_BANKING_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement ACCOUNTS_PAGE;

	public void enterCredentials(String username, String password) {
		USERNAME_FIELD.sendKeys(username);
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickLoginButton() {
		LOGIN_FIELD.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankandCashbutton() {
		BANKANDCASH_FIELD.click();
	}

	public void clickNewAccountbutton() {
		NEWACCOUNT_FIELD.click();
	}

	public void FillUpTheFormAndClicksOnSubmitButton(String accountTitle, String description, String initialBalance,
			String accountNumber, String contactPerson, String phone, String internetBankingUrl) {
		ACCOUNT_TITLE_FIELD.sendKeys(generateNumber(999) + accountTitle);
		DESCRIPTION_FIELD.sendKeys(description);
		INITIAL_BALANCE_FIELD.sendKeys(initialBalance);
		ACCOUNT_NUMBER_FIELD.sendKeys(generateNumber(999) + accountNumber);
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
		PHONE_FIELD.sendKeys(generateNumber(999) + phone);
		INTERNET_BANKING_FIELD.sendKeys(internetBankingUrl);
		SUBMIT_FIELD.click();
	}

	public String getPageTitle1() {
		return driver.getTitle();
	}

	public void takeScreenshotAtTheEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot srnshot = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = srnshot.getScreenshotAs(OutputType.FILE);
		String CurrentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(CurrentDirectory + "/screenshots/" + label + ".png"));
	}
}
