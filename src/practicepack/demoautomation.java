package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow--origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/my-account/");

        // Register a new user
        WebElement registerEmail = driver.findElement(By.id("reg_email"));
        registerEmail.sendKeys("example@example.com");

        WebElement registerPassword = driver.findElement(By.id("reg_password"));
        registerPassword.sendKeys("yourpassword");

        WebElement registerButton = driver.findElement(By.name("register"));
        registerButton.click();

        // Login with registered user credentials
        WebElement loginEmail = driver.findElement(By.id("username"));
        loginEmail.sendKeys("example@example.com");

        WebElement loginPassword = driver.findElement(By.id("password"));
        loginPassword.sendKeys("yourpassword");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // Close the browser
      //  driver.quit();
    }
	}


