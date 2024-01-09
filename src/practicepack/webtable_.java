package practicepack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable_ {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
	System.out.println("number of  rows :"+ rows);
	
	int colums = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
	System.out.println("number of colums :" + colums);
	
	String sindhu=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[6]//td[3]")).getText();
	System.out.println("sindhu");
	for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=colums;c++)
		{
			String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value1+"\t"); 
		}
		System.out.println();
	}
	//String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
	   // for(int r=2;r<=rows;r++)
	    {
	    	String author1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
	    	
	    	//if(author1.equals(subject));
	    }
             String abc = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[6]//td[4]")).getText(); 
             
			System.out.println(abc +" " +abc);
             
             
             
             
             
             
             
}
}








