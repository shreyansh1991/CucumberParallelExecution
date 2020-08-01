package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class WebDriverFactoryStaticThreadLocal {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static  void setDriver() {
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().version("84.0.4147.30").setup();
		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void closeBrowser()
	{
		driver.get().close();
		driver.remove();
	}
	
 
}