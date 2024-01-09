package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class boolmyshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * ); ChromeOptions options = new ChromeOptions();
		 */

		WebDriver driver = new EdgeDriver();

		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");

		driver.manage().window().maximize();

		WebElement moviesTab = driver.findElement(By.xpath("//a[text()='Movies']"));
		moviesTab.click();

		driver.quit();
	}

}
