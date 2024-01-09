package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(" welcome to dropdowns");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * ); ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote--allow--origins--");
		 */
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cD = driver.findElement(By.xpath("//*[@id=\"common-header-region\"]"));
		cD.click();
//        WebElement stateDropdown = driver.findElement(By.xpath("//input[@id=\'state-list\']"));
//        stateDropdown.click();
//        
//      WebElement cityDropdown = driver.findElement(By.xpath("//input[@id=\'city-input\']"));
//        cityDropdown.click();

		List<WebElement> cityOptions = driver.findElements(By.xpath("//ul[@id=\'city-ul\']/li"));
		for (WebElement city : cityOptions) {
			if (city.getText().equals("Los Angeles")) {
				city.click();
				break;
			}
		}

		driver.quit();
	}

}
