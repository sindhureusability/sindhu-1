package practicepack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WEBTABLE__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		int rows = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
		System.out.println(rows);
		int col = driver.findElements(By.xpath("//table[@id=\"countries\"]//td")).size();
		System.out.println(col);
		
		for( int r=2;r<=rows;r++)
		{
		//String currency = driver.findElement(By.xpath("//table[@id=countries]//tr["+r+"]//td[4]")).getText();
		//if(currency.equals(United States Dollar))
		{
			driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[3]")).click();
			String language = driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[\"+r+\"]//td[5]")).getText();
			//driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[\"+r+\"]//td[2]")).getText();
			System.out.println(language+":"+language);
		}
	}

	}
}