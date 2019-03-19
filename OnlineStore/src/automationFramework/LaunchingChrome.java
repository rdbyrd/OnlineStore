package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {

		//direct to ChromeDriver
		String exePath = "C:\\Users\\rbyrd\\Documents\\Chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		//Instantiate a ChromeDriver class
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		
	}

}
