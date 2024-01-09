package practicepack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class nopcommerceautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
        
        // Click on the "Computers" menu
        WebElement computersMenu = driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Computers']"));
        computersMenu.click();

        // Click on "Notebooks" within the "Computers" section
        WebElement notebooksLink = driver.findElement(By.xpath("//a[text()='Notebooks ']"));
        notebooksLink.click();

        // Verify if the correct page is opened (you can add more detailed verifications here)
        if (driver.getTitle().contains("Notebooks")) {
            System.out.println("Successfully navigated to Notebooks page.");
        } else {
            System.out.println("Navigation to Notebooks page failed.");
        }

        // Print the names of all available notebooks
        List<WebElement> notebookNames = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        System.out.println("List of Notebooks available:");
        for (WebElement notebook : notebookNames) {
            System.out.println(notebook.getText());
        }

        // Close the browser
        driver.quit();
    }

	}


