package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" welcome to dropdowns");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * ); ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote--allow--origins--");
		 */
		WebDriver driver = new EdgeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		String cityToSelect = "New York";

		WebElement countryDropdown = driver.findElement(By.id("country-list"));
		countryDropdown.click();
		List<WebElement> countryOptions = driver.findElements(By.xpath("//select[@name=\"country\"]//option"));
		for (WebElement country : countryOptions) {

			if (country.getText().equals("USA")) {
				country.click();
				break;
			}
		}
		List<WebElement> stateOptions = driver.findElements(By.xpath("//select[@name=\"state\"]//option"));
		for (WebElement state : stateOptions) {

			if (state.getText().equals(cityToSelect)) {
				state.click();
				break;
			}
		}

		driver.quit();
	}

}
