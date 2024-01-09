package practicepack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Taskcommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		Thread.sleep(2000);
		WebElement doller = driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]"));
		doller.click();
		Select doller1 = new Select(doller);
		doller1.selectByVisibleText("Euro");

		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("thisissindhu11@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("sindhu");
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("dasari");
		WebElement daydropdown = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
		daydropdown.click();
		Select sc = new Select(daydropdown);
		sc.selectByIndex(18);
		Thread.sleep(2000);
		sc.selectByValue("30");
		Thread.sleep(2000);
		sc.selectByVisibleText("25");
		WebElement selectedOption = sc.getFirstSelectedOption();
		String selectedText = selectedOption.getText();
		System.out.println("Selected option: " + selectedText);

		WebElement month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
		Select mn = new Select(month);
		mn.selectByIndex(9);
		Thread.sleep(2000);
		mn.selectByValue("3");
		Thread.sleep(2000);
		mn.selectByVisibleText("September");
		WebElement Option = mn.getFirstSelectedOption();
		String Text = Option.getText();
		System.out.println("Selected option: " + Text);

		WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
		year.click();
		Select yr = new Select(year);
		yr.selectByIndex(5);
		yr.selectByValue("1920");
		yr.selectByVisibleText("1950");
		WebElement Option1 = yr.getFirstSelectedOption();
		String Text1 = Option1.getText();
		System.out.println("Selected option: " + Text1);

		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("charani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("sindhu@9908");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("sindhu@9908");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();

		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"ico-wishlist\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id=\"topcartlink\"]")).click();
		driver.navigate().to("https://demo.nopcommerce.com/login?");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("thisisaruna@9391");		
        driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).click();
   		 Thread.sleep(2000);

	      //	 computer
			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();

			driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();

			Thread.sleep(4000);
			driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg\"]")).click();
			Thread.sleep(3000);
        	      
			WebElement com = driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
			Select Processer = new Select(com);
			Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
			// RAM
			WebElement com1 = driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));

			Select RAM = new Select(com1);
			
			RAM.selectByVisibleText("2 GB");
			
					Thread.sleep(2000);

			// HDD
			driver.findElement(By.id("product_attribute_3_6")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("product_attribute_3_7")).click();

			Thread.sleep(2000);
			// OS
			driver.findElement(By.id("product_attribute_4_9")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("product_attribute_4_8")).click();

			Thread.sleep(2000);
			 //SOFTWARE
            
        	driver.findElement(By.id("product_attribute_5_11")).click();
        	
        	Thread.sleep(2000);
        	
        	driver.findElement(By.id("product_attribute_5_12")).click();
        	
        	Thread.sleep(2000);
        	
        	driver.findElement(By.id("product_attribute_5_10")).click();
        	
			Thread.sleep(2000);

			// ADD TO CARD

			driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();

			driver.navigate().to("https://demo.nopcommerce.com/desktops");
			WebElement sortByDropdown = driver.findElement(By.id("products-orderby"));
			sortByDropdown.click();
			// Create a Select object
			Select dropdown = new Select(sortByDropdown);
			dropdown.selectByIndex(1); // Selects the second option
			dropdown.selectByValue("5"); // '5' represents 'Price: High to Low'
			dropdown.selectByVisibleText("Name: Z to A");
			WebElement selected = dropdown.getFirstSelectedOption();
			String selected1 = selected.getText();
			System.out.println("Selected option: " + selected1);

			WebElement size = driver.findElement(By.id("products-pagesize"));
			size.click();
			Select sz = new Select(size);
			sz.selectByIndex(2);
			sz.selectByValue("6");
			sz.selectByVisibleText("9");
			WebElement selectedOption1 = sz.getFirstSelectedOption();
			String selectedText1 = selectedOption1.getText();
			System.out.println("Selected option: " + selectedText1);

			driver.navigate().to("https://demo.nopcommerce.com/notebooks");
			WebElement radiobutton = driver.findElement(By.id("attribute-option-6"));
			radiobutton.click();
			Thread.sleep(2000);
			if (radiobutton.isSelected())
				radiobutton.click();
			WebElement radiobutton1 = driver.findElement(By.id("attribute-option-7"));
			radiobutton1.click();
			Thread.sleep(2000);
			if (radiobutton1.isSelected())
				radiobutton1.click();
			WebElement radio = driver.findElement(By.id("attribute-option-8"));
			radio.click();
			Thread.sleep(2000);
			if (radio.isSelected())
				radio.click();
			WebElement radio1 = driver.findElement(By.id("attribute-option-9"));
			radio1.click();
			Thread.sleep(2000);
			if (radio1.isSelected())
				radio1.click();
			WebElement radio2 = driver.findElement(By.id("attribute-option-10"));
			radio2.click();
			Thread.sleep(2000);
			if (radio2.isSelected())
				radio2.click();
			
			Thread.sleep(2000);

//SORT BYY
			WebElement s1 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
			Select Sortby = new Select(s1);

			Sortby.selectByVisibleText("Created on");

			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();

			Thread.sleep(3000);

			driver.get("https://demo.nopcommerce.com/software");
			// Find and interact with elements on the page using different locators and
			// XPath
			WebElement pageTitle = driver.findElement(By.tagName("h1"));
			System.out.println("Page Title: " + pageTitle.getText());

			WebElement productItem = driver.findElement(By.className("product-item"));
			System.out.println("Product Item Text: " + productItem.getText());

			WebElement firstProductName = driver.findElement(By.xpath("//div[@class='item-grid']//h2/a"));
			System.out.println("First Product Name: " + firstProductName.getText());
			Thread.sleep(2000);

			driver.navigate().to("https://demo.nopcommerce.com/software");
			List<WebElement> products = driver.findElements(By.className("product-item"));
			// Display the count of products found on the Software page
			System.out.println("Number of products found: " + products.size());
			// Display the names of the products found on the Software page
			System.out.println("Product names:");
			for (WebElement product : products) {
				WebElement productName = product.findElement(By.tagName("h2"));
				System.out.println(productName.getText());
			}

			// Click on a product (for example, the first product in the list)
			if (products.isEmpty()) {
				products.get(0).click();
				System.out.println("Clicked on the first product.");
			} else {
				System.out.println("No products found.");
			}
			driver.get("https://demo.nopcommerce.com/electronics");
			driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
			pageTitle = driver.findElement(By.tagName("h1"));
			// products = driver.findElements(By.className("product-item"));
			WebElement sortByDropdown1 = driver.findElement(By.id("products-orderby"));
			Select dropdown2 = new Select(sortByDropdown1);
			dropdown2.selectByVisibleText("Name: Z to A");
			WebElement selectedOption2 = dropdown2.getFirstSelectedOption();
			String selectedText2 = selectedOption2.getText();
			System.out.println("Selected option: " + selectedText2);
			Thread.sleep(2000);
			driver.navigate().to("https://demo.nopcommerce.com/others");
			sortByDropdown1 = driver.findElement(By.id("products-orderby"));
			// Find and interact with elements on the page
			WebElement pageTitle1 = driver.findElement(By.tagName("h1"));
			System.out.println("Page Title: " + pageTitle1.getText());

			WebElement product = driver.findElement(By.className("product-item"));
			{
				System.out.println("Product Name: " + product.getText());
			}
			driver.navigate().to("https://demo.nopcommerce.com/electronics");
	          driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();
	         
	         Thread.sleep(3000);
	         
	         driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();
	         
	         Thread.sleep(3000);
	         
	         driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
	     	
	     	Thread.sleep(2000);
	     	driver.navigate().back();
	     	driver.navigate().back();
//	     	cell phones
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
//	     	sort by
	     	 WebElement	mob1=	driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
	         
	  		Select Sortby11=new Select(mob1);
	  		
	  		Sortby11.selectByVisibleText("Created on");
	  		
	  		Thread.sleep(2000);
	  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000044_nokia-lumia-1020_415.jpeg\"]")).click();
	  		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();

	     	Thread.sleep(2000);
	  		driver.navigate().back();
	     	driver.navigate().back();
	     	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/div/a/img")).click();
	     	
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000048_portable-sound-speakers_415.jpeg\"]")).click();
	  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
	  		Thread.sleep(2000);
	  		
	  		driver.navigate().to("https://demo.nopcommerce.com/apparel");
	  		Thread.sleep(2000);
//	  		sheos element
		    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
	         
	        Thread.sleep(1000);
	         
	        driver.findElement(By.xpath("//*[@id=\"attribute-option-16\"]")).click();
	         
	        Thread.sleep(1000);
//	        sort by
	        WebElement	s13=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	        
	 		Select Sortby2=new Select(s13);
	 		
	 		Sortby2.selectByVisibleText("Created on");
	 		
	 		Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/a/img")).click();
	         
	        Thread.sleep(1000);
	        
	        WebElement	size1=	driver.findElement(By.xpath("//select[@name=\"product_attribute_9\"]"));
			Select Sortby12=new Select(size1);
			Sortby12.selectByVisibleText("8");
			
	        driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
	     	
	     	Thread.sleep(1000);
	     	driver.navigate().back();
	     	driver.navigate().back();
//	     	clothing 
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000011_clothing_450.jpeg\"]")).click();
//	    	sort by
	        WebElement	s11=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	        
	 		Select Sortby112=new Select(s11);
	 		
	 		Sortby112.selectByVisibleText("Created on");
			
	  		Thread.sleep(2000);
	  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000060_levis-511-jeans_415.jpg\"]")).click();
	  		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();

	     	Thread.sleep(2000);
	  		driver.navigate().back();
	     	driver.navigate().back();
//	     	accesories element__
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000012_apparel-accessories_450.jpg\"]")).click();
	     	
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000064_ray-ban-aviator-sunglasses_415.jpg\"]")).click();
	  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
	  		
//	  		digital downloads element
	     	driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000067_science-faith_415.jpeg\"]")).click();
	     	WebElement pric=driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
	     	pric.clear();
	     	pric.sendKeys("100");
	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();

//	        books element
	     	driver.navigate().to("https://demo.nopcommerce.com/books");
	     	 WebElement	s111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	         
	  		Select Sortby111=new Select(s111);
	  		
	  		Sortby111.selectByVisibleText("Created on");
	  		Thread.sleep(2000);
	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Pride and Prejudice\"]")).click();
	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();
	     	
//	     	jewelry element
	     	driver.navigate().to("https://demo.nopcommerce.com/jewelry");
	    	 WebElement	s1111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	        
	 		Select Sortby1111=new Select(s1111);
	 		
	 		Sortby1111.selectByVisibleText("Created on");
	 		Thread.sleep(2000);
	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Vintage Style Engagement Ring\"]")).click();
	     	Thread.sleep(2000);
	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();
	     	
//	     	gift card element
	     	driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
	   	 WebElement	s11111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	       
			Select Sortby11111=new Select(s11111);
			
			Sortby11111.selectByVisibleText("Created on");
			Thread.sleep(2000);
	    	driver.findElement(By.xpath("//img[@alt=\"Picture of $50 Physical Gift Card\"]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("s");
	    	driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("sindhu");
	    	driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("get whatever you want");
	    	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
			
         
      
   	        
   	      
   	     
	}
}

