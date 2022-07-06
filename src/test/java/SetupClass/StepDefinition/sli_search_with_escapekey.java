package SetupClass.StepDefinition;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetupClass.SetUpClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sli_search_with_escapekey extends SetUpClass {
	@Given("user is on Home Page")
	public void user_is_on_home_page() throws InterruptedException {

		log.info("It's opening the website URL");
		Thread.sleep(2000);
		driver.get(AppURL);
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	@Then("Enter data in search filed")
	public void enter_data_in_search_filed() throws Throwable {

		WebElement search_field = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
		search_field.sendKeys("HR");
		Thread.sleep(3000);
	}

	@Then("press escape key")
	public void press_escape_key() throws Throwable {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			System.out.println("key pressed");
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			System.out.println("key release");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	@Then("verify the pop-up")
	public void verify_the_pop_up() throws Throwable {
		Thread.sleep(1000);
		boolean pop_up_Value = driver.findElement(By.xpath("//ul[@id='sli_autocomplete']")).isDisplayed();
		System.out.println("pop-up is displayed  " + pop_up_Value);
		// assertTrue(pop_up_Value == false);

		boolean img_value = driver.findElement(By.xpath("//div[@class='banner-slides-img']//img[@alt='Banner']"))
				.isDisplayed();
		System.out.println("images are displayed=  " + img_value);
		assertTrue(img_value == true);
		Thread.sleep(2000);

	}

	@Then("Click on Sign in button")
	public void click_on_sign_in_button() throws Throwable {
		Thread.sleep(2000);
		WebElement sign_In = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Sign In']")));
		// sign_In.click();
		js.executeScript("arguments[0].click();", sign_In);
		Thread.sleep(4000);
	}

	@Then("Enter free valid username and password")
	public void enter_free_valid_username_and_password() {
		WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		email.sendKeys("nishadhiman0027@gmail.com");
		WebElement password = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")));
		password.sendKeys("Qwerty");
		WebElement login_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Login']")));
		login_btn.click();
	}

	@Then("Enter Data in Search filed")
	public void Enter_Data_in_Search_filed() throws Throwable {

		WebElement search_field = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
		search_field.sendKeys("HR");
		Thread.sleep(3000);
	}

	@Then("Press Escape key")
	public void press_Escape_key() throws Throwable {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			System.out.println("key pressed");
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			System.out.println("key released");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

	}

	@Then("verify the Pop-up")
	public void verify_the_Pop_up() throws Throwable {
		/*
		 * Thread.sleep(1000); //boolean pop_up_Value =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//ul[@id='sli_autocomplete']"))).isDisplayed(); boolean pop_up_Value =
		 * driver.findElement(By.xpath("//ul[@id='sli_autocomplete']")).isDisplayed();
		 * System.out.println("pop-up is displayed  " + pop_up_Value);
		 * //assertTrue(pop_up_Value == false); // clear the search field
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@id='search']"))).clear();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement sign_Out = wait .until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//a[normalize-space()='Sign Out']")));
		 * js.executeScript("arguments[0].click();", sign_Out); //sign_Out.click();
		 * 
		 * String verification_Message = wait
		 * .until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='base']"
		 * ))) .getText();
		 * 
		 * System.out.println("verification_Message = " + verification_Message);
		 * Assert.assertTrue("user is not sign out from apploication",
		 * verification_Message.contains("YOU ARE NOW LOGGED OUT"));
		 */
	}

}
