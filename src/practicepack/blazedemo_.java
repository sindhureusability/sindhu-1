package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class blazedemo_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty( "webdriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver-exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoblaze.com/index.html");
				//driver.findElement(By.xpath("//a[@class=\"nav-link\"][1]")).click();
				//driver.findElement(By.xpath("//h5[@id=logInModalLabel]")).click();
				driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.xpath("//input[@id=\"loginusername\"][1]")).sendKeys("sindhu dasari");
				driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys("sindhu@1234");
				Thread.sleep(2000);
				//driver.findElement(By.xpath(".//button[@onclick='logIn()']")).click();
				driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
				driver.findElement(By.linkText("Log in")).click();
				//signup
				driver.findElement(By.linkText("Sign up")).click();
				driver.findElement(By.xpath("//input[@id=\"sign-username\"]")).sendKeys("aruna");
			
	}

}
