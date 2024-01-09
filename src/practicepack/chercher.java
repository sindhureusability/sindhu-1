package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class chercher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement singledropdown = driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select sc = new Select(singledropdown);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		sc.selectByValue("Apple");
		Thread.sleep(2000);
		sc.selectByVisibleText("Bing");
		
	    WebElement multiple =	driver.findElement(By.xpath("//select[@id=\"second\"]"));
	    Select sp = new Select(multiple);
	    sp.selectByIndex(3);
	    sp.selectByValue("burger");
	    sp.selectByVisibleText("Donut");
	    
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("sindhu");
		
		driver.navigate().to("https://www.google.com/search?q");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("sindhu");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("9908");
		System.out.println(driver.findElement(By.id("email")));
		System.out.println(driver.findElement(By.id("pass")));
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
