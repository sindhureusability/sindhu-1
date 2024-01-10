package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Navigate to Facebook
	        driver.get("https://www.facebook.com/");

	       
	            // Find the element using XPath
	            WebElement element = driver.findElement(By.xpath("YOUR_XPATH_EXPRESSION_HERE"));

	            // Check if the element exists
	            if (element != null) {
	                // Print the text content of the element
	                System.out.println(element.getText().trim());
	            } else {
	                System.out.println("Element not found");
	            }
//	        } catch (Exception e) {
//	            System.out.println("Exception occurred: " + e.getMessage());
//	        } finally {
//	            // Quit the WebDriver session
//	            driver.quit();
	        }
	    }
	
	


