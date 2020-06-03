package WindowHandlerAndTestNG.WindowHandlerAndTestNG;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class IRCTCUptoLogin {

	WebDriver driver;

	WebDriverWait wait;

	@BeforeSuite(alwaysRun = true)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\RequiredFilesUtility\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println(" Browser Launching");
	}

	@BeforeClass(alwaysRun = true, description = "App is Opened in")
	public void OpenApp() {
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

	@BeforeTest(description = "Removing Alert")
	public void RemoveAlertFromLandingPage() {

	}

	@AfterTest(enabled = false, description = "Browser closed successfully")
	public void TerminateBrowser() {
		driver.close();
		System.out.println("Browser closed successfully");

	}

	public void Enterusername(String username) {

		System.out.println("This class used-: " + username);

	}

	public void WindowsHandles() {
		System.out.println("Title is - " + driver.getTitle());

		// Opening new tab with blank title
		driver.switchTo().newWindow(WindowType.WINDOW.TAB);

		System.out.println("New window title-" + driver.getTitle());

		// Opening new tab in new url
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0-alpha-6");
		System.out.println("New window title-" + driver.getTitle());

		// To handle windows

		Set<String> handles = driver.getWindowHandles();

		ArrayList<String> ls = new ArrayList<String>(handles);

		String ParentWindow = ls.get(0);

		System.out.println("Parent window: " + ParentWindow);
		// driver.quit();

		driver.switchTo().window(ParentWindow);
		driver.get("https://www.facebook.com/");
	}
}
