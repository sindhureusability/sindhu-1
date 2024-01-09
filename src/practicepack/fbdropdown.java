package practicepack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdown {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow--origins=*"); 	  
	       WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		dropdown.click();
		Select singledropdown = new Select(dropdown);
		singledropdown.selectByIndex(1);
		singledropdown.selectByValue("6");
		singledropdown.selectByVisibleText("8");
		System.out.println("Selected option in single dropdown: " + singledropdown.getFirstSelectedOption().getText());

		// Multiple Dropdown
		WebElement multipleDropdown = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select multipleSelect = new Select(multipleDropdown);
		multipleSelect.selectByIndex(3);
		multipleSelect.selectByValue("10");
		multipleSelect.selectByVisibleText("Oct");

		// Print all selected options in the multiple dropdown
       // System.out.println("selected option in multiple dropdown:"+ multipleSelect.getAllSelectedOptions());
		for (WebElement option : multipleSelect.getAllSelectedOptions()) {
			System.out.println(option.getText());
		}

		// Deselect an option from the multiple dropdown
		multipleSelect.deselectByVisibleText("Oct");
        //System.out.println("Selected options count: " + multipleSelect.getAllSelectedOptions().size());

		// Close the browser
		driver.quit();

	}

}
