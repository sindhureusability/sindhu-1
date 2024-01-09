package practicepack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.findElement(By.xpath("//input[@id=\"gparent_1\"]")).sendKeys("red");
		driver.findElement(By.xpath("//input[@id=\"parent_1\"]")).sendKeys("white");
		driver.findElement(By.xpath("//*[@id=\"child_1\"]")).sendKeys("yellow");
		driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div[1]/div/div/div/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div[2]/h2/span")).click();
		driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div[2]/div/div/div/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"frame2\"]")).sendKeys("sindhu");
		
		/* WebElement linkElement = driver.findElement(By.xpath("//a[text()='LinkText4']"));
	        System.out.println("Text of the link with XPath: " + linkElement.getText());

	        // Example 2: Finding elements by attribute value
	        WebElement textBoxElement = driver.findElement(By.xpath("//input[@name='fname']"));
	        textBoxElement.sendKeys("Selenium");

	        // Example 3: Finding elements using partial text
	        WebElement partialTextElement = driver.findElement(By.xpath("//*[contains(text(), 'Text to locate')]"));
	        System.out.println("Partial text located: " + partialTextElement.getText());

	        // Example 4: Finding elements based on position
	        WebElement nthElement = driver.findElement(By.xpath("//div[@id='post-body-6424438019623853953']//table//tr[2]/td[2]"));
	        System.out.println("Text of the 2nd row, 2nd column: " + nthElement.getText());

	        // Close the browser
	       // driver.quit();*/
	    }
	
    }
		
		
		
	


