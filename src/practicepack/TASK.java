package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class TASK {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new EdgeDriver(options);
			driver.get("https://demo.nopcommerce.com/computers");
			driver.manage().window().maximize();
//			registration_____________________________-
			driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("bhanu");
			driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("nukala");
			WebElement bhanu=driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
			Select bb=new Select(bhanu);
			bb.selectByValue("2");
			Thread.sleep(2000);
			
			WebElement bhanuElement=driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
			Select mul=new Select(bhanuElement);
			mul.selectByIndex(2);
			
			WebElement bhanuyear=driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
			Select bhanuy=new Select(bhanuyear);
			bhanuy.selectByValue("1997");
			
			driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("bhanunukala234@gmail.com");
			driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Bhanu@12345");
			driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Bhanu@12345");
			driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
			 Thread.sleep(2000);
//		      login__________________________________
		      driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		      
		      driver.findElement(By.id("Email")).sendKeys("bhanunukala234@gmail.com");
		      
		      driver.findElement(By.id("Password")).sendKeys("Bhanu@12345");
		      
		      driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		      
		      //	 computer
	          Thread.sleep(2000);
	           
	          driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
	           
	          driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();
	     
	          Thread.sleep(4000);
	          
	          driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg\"]")).click();
	          
	          Thread.sleep(3000);
	          
	          
	//INSPECTING THE ELEMENT_____________________________
		      
		      WebElement com= driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
	          
	          Select Processer=new Select(com);
	          
	          Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
	          
	  //RAM____________________________________
	          
	           WebElement com1=driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));
	           
	           Select RAM=new Select(com1);
	           
	           RAM.selectByVisibleText("8GB [+$60.00]");
	           
	           Thread.sleep(2000);
	           
	           
	           
	  //HDD___________________________
	           
	          driver.findElement(By.id("product_attribute_3_6")).click();
	          
	          Thread.sleep(2000);
	          
	          driver.findElement(By.id("product_attribute_3_7")).click();
	          
	          Thread.sleep(2000);
	          
	  //OS______________________________
	          
	            driver.findElement(By.id("product_attribute_4_9")).click();
	            
	            Thread.sleep(2000);
	            
	            driver.findElement(By.id("product_attribute_4_8")).click();
	            
	            Thread.sleep(2000);
	            
	            
	   //SOFTWARE_____________________________
	            
	            	driver.findElement(By.id("product_attribute_5_11")).click();
	            	
	            	Thread.sleep(2000);
	            	
	            	driver.findElement(By.id("product_attribute_5_12")).click();
	            	
	            	Thread.sleep(2000);
	            	
	            	driver.findElement(By.id("product_attribute_5_10")).click();
	            	
	         	Thread.sleep(2000);
	            	
	      //ADD TO CARD____________________________
	            	
	            	
	            	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
	            	
	            	Thread.sleep(2000); 	
	            	
	            	
	  	//THIS ELEMENT IS NOTEBOOK 
	            	
	        //NOTEBOOK___________________________________
	            	
//	            	driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
	           driver.navigate().back(); 
	           driver.navigate().back();
	     		Thread.sleep(2000);
//	     		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();
//	     		Thread.sleep(2000);
	     		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
	     		
	     		Thread.sleep(2000);
	     		
	    //CPU TYPE___________________________________
	     		
	     		driver.findElement(By.id("attribute-option-6")).click();
	     		
	     		Thread.sleep(1000);
	     		
	     		driver.findElement(By.id("attribute-option-7")).click();
	     		
	     		Thread.sleep(2000);
	             
		//MEMORY_____________________________________
	     		
	     		driver.findElement(By.id("attribute-option-8")).click();
	     		
	     		Thread.sleep(3000);
	     		
	     		driver.findElement(By.id("attribute-option-9")).click();
	     		
	     		Thread.sleep(3000);
	     		
	     		driver.findElement(By.id("attribute-option-10")).click();
	     		
	     		Thread.sleep(3000);
	     		
	     		
	 //SORT BYY______________________________________
	     WebElement	s1=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	     
	     		Select Sortby=new Select(s1);
	     		
	     		Sortby.selectByVisibleText("Created on");
	     		
	     		Thread.sleep(2000);
	     		
	     		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();
	     		
	     		Thread.sleep(3000);
	     		
	     		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();
	     		
	     		Thread.sleep(3000);
	     		
	     		
	     		
	   //NUMBER THREE ELEMENT SOFTWARE________________________
	     		
	     		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
	            	
	     		Thread.sleep(2000);
	     		
	     		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
	     		Thread.sleep(2000);
	     	
	     		//SORT BYE_______________________________ 
	     		
	     	           WebElement A1= driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	     	
	     	           Select Sortby1=new Select(A1);
	     	           
	     	           Thread.sleep(2000);
	     	           
	     	           Sortby1.selectByVisibleText("Created on");
	     	           
	     	           Thread.sleep(1000);
	     	           
	     	           driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();
	     	           
	     	           Thread.sleep(2000);
	     	           
	     	           driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();
	     	           
	     	           Thread.sleep(2000);
	     	           
	     	           driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();
	     	           
	     	           Thread.sleep(3000);
	     	           
	     	           driver.findElement(By.id("FriendEmail")).sendKeys("bhanu99@gmail.com");
	     	           
	     	           Thread.sleep(2000);
	     	           
	     	           driver.findElement(By.id("YourEmailAddress"));
	     	           
	     	           Thread.sleep(2000);
	     	           
	     	           driver.findElement(By.id("PersonalMessage")).sendKeys("first sigment is done");
	     	           
	     	           Thread.sleep(2000);
	     	           
	     	           driver.findElement(By.name("send-email")).click();
	     	           driver.navigate().to("https://demo.nopcommerce.com/electronics");
	     	           
//	     	          driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
	     	          driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();
	     	         
	     	         Thread.sleep(3000);
	     	         
	     	         driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();
	     	         
	     	         Thread.sleep(3000);
	     	         
	     	         driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
	     	     	
	     	     	Thread.sleep(2000);
	     	     	driver.navigate().back();
	     	     	driver.navigate().back();
//	     	     	cell phones________________________________
	     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
//	     	     	sort by_________________________________-
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
//	     	  		sheos element____________________________________
	     		    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
	     	         
	     	        Thread.sleep(1000);
	     	         
	     	        driver.findElement(By.xpath("//*[@id=\"attribute-option-16\"]")).click();
	     	         
	     	        Thread.sleep(1000);
//	     	        sort by___________________________________
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
//	     	     	clothing element______________________________________
	     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000011_clothing_450.jpeg\"]")).click();
//	     	    	sort by_________________________________-
	     	        WebElement	s11=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	     	        
	     	 		Select Sortby112=new Select(s11);
	     	 		
	     	 		Sortby112.selectByVisibleText("Created on");
	     			
	     	  		Thread.sleep(2000);
	     	  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000060_levis-511-jeans_415.jpg\"]")).click();
	     	  		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();

	     	     	Thread.sleep(2000);
	     	  		driver.navigate().back();
	     	     	driver.navigate().back();
//	     	     	accesories element____________________________________
	     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000012_apparel-accessories_450.jpg\"]")).click();
	     	     	
	     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000064_ray-ban-aviator-sunglasses_415.jpg\"]")).click();
	     	  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
	     	  		
//	     	  		digital downloads element________________________________
	     	     	driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
	     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000067_science-faith_415.jpeg\"]")).click();
	     	     	WebElement pric=driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
	     	     	pric.clear();
	     	     	pric.sendKeys("100");
	     	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();

//	     	        books element___________________________
	     	     	driver.navigate().to("https://demo.nopcommerce.com/books");
	     	     	 WebElement	s111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	     	         
	     	  		Select Sortby111=new Select(s111);
	     	  		
	     	  		Sortby111.selectByVisibleText("Created on");
	     	  		Thread.sleep(2000);
	     	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Pride and Prejudice\"]")).click();
	     	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();
	     	     	
//	     	     	jewelry element___________________________
	     	     	driver.navigate().to("https://demo.nopcommerce.com/jewelry");
	     	    	 WebElement	s1111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	     	        
	     	 		Select Sortby1111=new Select(s1111);
	     	 		
	     	 		Sortby1111.selectByVisibleText("Created on");
	     	 		Thread.sleep(2000);
	     	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Vintage Style Engagement Ring\"]")).click();
	     	     	Thread.sleep(2000);
	     	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();
	     	     	
//	     	     	gift card element___________________________
	     	     	driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
	     	   	 WebElement	s11111=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	     	       
	     			Select Sortby11111=new Select(s11111);
	     			
	     			Sortby11111.selectByVisibleText("Created on");
	     			Thread.sleep(2000);
	     	    	driver.findElement(By.xpath("//img[@alt=\"Picture of $50 Physical Gift Card\"]")).click();
	     	    	Thread.sleep(2000);
	     	    	driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("p");
	     	    	driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("bhanu");
	     	    	driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("My heart stops when ever you look at me");
	     	    	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
					
		           
		          driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
		           
		          driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();
		     
		          Thread.sleep(4000);
		          
		          driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg\"]")).click();
		          
		          Thread.sleep(3000);
		          
		          
		//INSPECTING THE ELEMENT_____________________________
			      
			      WebElement com11= driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
		          
		          Select Processer1=new Select(com11);
		          
		          Processer1.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
		          
		  //RAM____________________________________
		          
		           WebElement com12=driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));
		           
		           Select RAM1=new Select(com1);
		           
		           RAM.selectByVisibleText("8GB [+$60.00]");
		           
		           Thread.sleep(2000);
		           
		           
		           
		  //HDD___________________________
		           
		          driver.findElement(By.id("product_attribute_3_6")).click();
		          
		          Thread.sleep(2000);
		          
		          driver.findElement(By.id("product_attribute_3_7")).click();
		          
		          Thread.sleep(2000);
		          
		  //OS______________________________
		          
		            driver.findElement(By.id("product_attribute_4_9")).click();
		            
		            Thread.sleep(2000);
		            
		            driver.findElement(By.id("product_attribute_4_8")).click();
		            
		            Thread.sleep(2000);
		            
		            
		   //SOFTWARE_____________________________
		            
		            	driver.findElement(By.id("product_attribute_5_11")).click();
		            	
		            	Thread.sleep(2000);
		            	
		            	driver.findElement(By.id("product_attribute_5_12")).click();
		            	
		            	Thread.sleep(2000);
		            	
		            	driver.findElement(By.id("product_attribute_5_10")).click();
		            	
		         	Thread.sleep(2000);
		            	
		      //ADD TO CARD____________________________
		            	
		            	
		            	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
		            	
		            	Thread.sleep(2000); 	
		            	
		            	
		  	//THIS ELEMENT IS NOTEBOOK 
		            	
		        //NOTEBOOK___________________________________
		            	
//		            	driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
		           driver.navigate().back(); 
		           driver.navigate().back();
		     		Thread.sleep(2000);
//		     		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[2]")).click();
//		     		Thread.sleep(2000);
		     		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
		     		
		     		Thread.sleep(2000);
		     		
		    //CPU TYPE___________________________________
		     		
		     		driver.findElement(By.id("attribute-option-6")).click();
		     		
		     		Thread.sleep(1000);
		     		
		     		driver.findElement(By.id("attribute-option-7")).click();
		     		
		     		Thread.sleep(2000);
		             
			//MEMORY_____________________________________
		     		
		     		driver.findElement(By.id("attribute-option-8")).click();
		     		
		     		Thread.sleep(3000);
		     		
		     		driver.findElement(By.id("attribute-option-9")).click();
		     		
		     		Thread.sleep(3000);
		     		
		     		driver.findElement(By.id("attribute-option-10")).click();
		     		
		     		Thread.sleep(3000);
		     		
		     		
		 //SORT BYY______________________________________
		     WebElement	s12=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     
		     		Select sortSelect=new Select(s12);
		     		
		     		sortSelect.selectByVisibleText("Created on");
		     		
		     		Thread.sleep(2000);
		     		
		     		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000030_hp-envy-6-1180ca-156-inch-sleekbook_415.jpeg\"]")).click();
		     		
		     		Thread.sleep(3000);
		     		
		     		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();
		     		
		     		Thread.sleep(3000);
		     		
		     		
		     		
		   //NUMBER THREE ELEMENT SOFTWARE________________________
		     		
		     		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
		            	
		     		Thread.sleep(2000);
		     		
		     		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
		     		Thread.sleep(2000);
		     	
		     		//SORT BYE_______________________________ 
		     		
		     	           WebElement A12= driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     	
		     	           Select Sortby121=new Select(A12);
		     	           
		     	           Thread.sleep(2000);
		     	           
		     	           Sortby1.selectByVisibleText("Created on");
		     	           
		     	           Thread.sleep(1000);
		     	           
		     	           driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]")).click();
		     	           
		     	           Thread.sleep(2000);
		     	           
		     	           driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();
		     	           
		     	           Thread.sleep(2000);
		     	           
		     	           driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();
		     	           
		     	           Thread.sleep(3000);
		     	           
		     	           driver.findElement(By.id("FriendEmail")).sendKeys("bhanu99@gmail.com");
		     	           
		     	           Thread.sleep(2000);
		     	           
		     	           driver.findElement(By.id("YourEmailAddress"));
		     	           
		     	           Thread.sleep(2000);
		     	           
		     	           driver.findElement(By.id("PersonalMessage")).sendKeys("first sigment is done");
		     	           
		     	           Thread.sleep(2000);
		     	           
		     	           driver.findElement(By.name("send-email")).click();
		     	           driver.navigate().to("https://demo.nopcommerce.com/electronics");
		     	           
//		     	          driver.findElement(By.xpath("//div[@class=\"menu-toggle\"]")).click();
		     	          driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]")).click();
		     	         
		     	         Thread.sleep(3000);
		     	         
		     	         driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000035_nikon-d5500-dslr_415.jpeg\"]")).click();
		     	         
		     	         Thread.sleep(3000);
		     	         
		     	         driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
		     	     	
		     	     	Thread.sleep(2000);
		     	     	driver.navigate().back();
		     	     	driver.navigate().back();
//		     	     	cell phones________________________________
		     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
//		     	     	sort by_________________________________-
		     	     	 WebElement	mob12=	driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
		     	         
		     	  		Select Sortby113=new Select(mob12);
		     	  		
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
//		     	  		sheos element____________________________________
		     		    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
		     	         
		     	        Thread.sleep(1000);
		     	         
		     	        driver.findElement(By.xpath("//*[@id=\"attribute-option-16\"]")).click();
		     	         
		     	        Thread.sleep(1000);
//		     	        sort by___________________________________
		     	        WebElement	s134=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     	        
		     	 		Select Sortby21=new Select(s134);
		     	 		
		     	 		Sortby2.selectByVisibleText("Created on");
		     	 		
		     	 		Thread.sleep(2000);
		     	        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/a/img")).click();
		     	         
		     	        Thread.sleep(1000);
		     	        
		     	        WebElement	size13=	driver.findElement(By.xpath("//select[@name=\"product_attribute_9\"]"));
		     			Select Sortby123=new Select(size13);
		     			Sortby123.selectByVisibleText("8");
		     			
		     	        driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
		     	     	
		     	     	Thread.sleep(1000);
		     	     	driver.navigate().back();
		     	     	driver.navigate().back();
//		     	     	clothing element______________________________________
		     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000011_clothing_450.jpeg\"]")).click();
//		     	    	sort by_________________________________-
		     	        WebElement	s112=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     	        
		     	 		Select Sortby34=new Select(s112);
		     	 		
		     	 		Sortby34.selectByVisibleText("Created on");
		     			
		     	  		Thread.sleep(2000);
		     	  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000060_levis-511-jeans_415.jpg\"]")).click();
		     	  		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();

		     	     	Thread.sleep(2000);
		     	  		driver.navigate().back();
		     	     	driver.navigate().back();
//		     	     	accesories element____________________________________
		     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000012_apparel-accessories_450.jpg\"]")).click();
		     	     	
		     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000064_ray-ban-aviator-sunglasses_415.jpg\"]")).click();
		     	  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
		     	  		
//		     	  		digital downloads element________________________________
		     	     	driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
		     	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000067_science-faith_415.jpeg\"]")).click();
		     	     	WebElement price =driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
		     	     	pric.clear();
		     	     	pric.sendKeys("100");
		     	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();

//		     	        books element___________________________
		     	     	driver.navigate().to("https://demo.nopcommerce.com/books");
		     	     	 WebElement	s=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     	         
		     	  		Select Sort=new Select(s);
		     	  		
		     	  		Sortby111.selectByVisibleText("Created on");
		     	  		Thread.sleep(2000);
		     	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Pride and Prejudice\"]")).click();
		     	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();
		     	     	
//		     	     	jewelry element___________________________
		     	     	driver.navigate().to("https://demo.nopcommerce.com/jewelry");
		     	    	 WebElement	ss=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     	        
		     	 		Select sr =new Select(ss);
		     	 		
		     	 		Sortby1111.selectByVisibleText("Created on");
		     	 		Thread.sleep(2000);
		     	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Vintage Style Engagement Ring\"]")).click();
		     	     	Thread.sleep(2000);
		     	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();
		     	     	
//		     	     	gift card element___________________________
		     	     	driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
		     	   	 WebElement	ss1 =	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		     	       
		     			Select  ss2 =new Select(s11111);
		     			
		     			ss2.selectByVisibleText("Created on");
		     			Thread.sleep(2000);
		     	    	driver.findElement(By.xpath("//img[@alt=\"Picture of $50 Physical Gift Card\"]")).click();
		     	    	Thread.sleep(2000);
		     	    	driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("p");
		     	    	driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("bhanu");
		     	    	driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("My heart stops when ever you look at me");
		     	    	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
			

		
	}

}
