package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class bookmyshow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();

		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().window().maximize();
		WebElement cityDropdown = driver.findElement(By.cssSelector("div.__location>div>button"));
		cityDropdown.click();

		List<WebElement> cityOptions = driver.findElements(By.cssSelector("div._1X3h1>div>ul>li"));

		String desiredCity = "Vijayawada";

		for (WebElement city : cityOptions) {
			String cityName = city.getText();
			if (cityName.equalsIgnoreCase(desiredCity)) {
				city.click();
				break;
			}
		}

		driver.quit();
	}
}
