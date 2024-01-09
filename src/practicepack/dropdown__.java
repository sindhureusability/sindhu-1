package practicepack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown__ {
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
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		WebElement singledropdown = driver.findElement(By.id("course"));
		singledropdown.click();
        Select sc = new Select(singledropdown);
		sc.selectByIndex(1);
		sc.selectByValue("java");
		sc.selectByVisibleText("Javascript");
		
		WebElement multipledropdown = driver.findElement(By.id("ide"));
		Select sd = new Select(multipledropdown);
		sd.selectByIndex(2);
		sd.selectByValue("ij");
		sd.selectByVisibleText("NetBeans");
		List<WebElement> dropdown = sd.getAllSelectedOptions();
		for (WebElement drop : dropdown) {

			/*drop.click();
			break;*/
		}
		sd.deselectByVisibleText("NetBeans");
		sd.deselectAll();
		driver.quit();

	}

}
