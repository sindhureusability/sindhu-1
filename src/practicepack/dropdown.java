package practicepack;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(" welcome to dropdowns");
//		
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote--allow--origins--");
//		 
		WebDriver driver = new EdgeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement sindhu = driver.findElement(By.id("country-list"));
		Select sc = new Select(sindhu);
		sc.selectByIndex(3);
		Thread.sleep(2000);
		sc.selectByValue("2");
		Thread.sleep(2000);
		sc.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement sr = driver.findElement(By.id("state-list"));
		Select sb = new Select(sr);
		sb.selectByValue("22");

	
	}

}
