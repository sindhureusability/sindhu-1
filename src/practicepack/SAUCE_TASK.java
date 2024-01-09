package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SAUCE_TASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty( "webdriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
//		driver.findElement(By.id("user-name")).sendKeys("sindhu@9908");
//		driver.findElement(By.id("password")).sendKeys("9908");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("thisisaruna@9391");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("aruna@9391");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}

}
