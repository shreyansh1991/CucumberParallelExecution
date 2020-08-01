package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.WebDriverFactoryStaticThreadLocal;

public class StepDefs {

	WebDriver driver;

	/*
	 * @Before public void before_or_after(Scenario s) { scenario = s; }
	 */

	@Given("I open the Browser and Navigate to the URL {string}")
	public void i_open_the_Browser_and_Navigate_to_the_URL(String string) {
		WebDriverFactoryStaticThreadLocal.setDriver();

		System.out.println(Thread.currentThread().getId() + " on driver reference "
				+ WebDriverFactoryStaticThreadLocal.getDriver());
		driver = WebDriverFactoryStaticThreadLocal.getDriver();
		driver.get(string);
		WebDriverFactoryStaticThreadLocal.closeBrowser();
	}

}