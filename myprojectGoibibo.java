package automation_Projects;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
    public class myprojectGoibibo {
	
	   WebDriver driver;
	   Select s;
	   List<WebElement> ls;
		  @BeforeTest
   
   public void beforeTest() throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Automation Setup\\Browser Extension\\chromedriver.exe"); 
       driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		//get url
		driver.get("https://www.goibibo.com/");
		  Thread.sleep(2000);
  }
 
  @Test(priority=1)
	  
	  public void smoketesting() throws InterruptedException
		{
			//Create object of Actions class
			Actions a=new Actions(driver);
			//Create object of list with element
			ls=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[1]/div/header"));
			Thread.sleep(1200);
			
			//Store list size
			int size=ls.size();
			System.out.println("No of modules:" +size);
			Thread.sleep(1200);
			for(int i=1;i<=size;i++)
			{
				Thread.sleep(2000);
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/header["+i+"]")).getText());
				Thread.sleep(2000);
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/header["+i+"]"))).click().perform();
				Thread.sleep(1200);
			}
		}
  
  @Test(priority=2)
  public void Hotels() throws InterruptedException 
	{
	  //Hotels
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//International
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/input")).click();
	Thread.sleep(2000);
	//Where
		driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]")).sendKeys("London");
		Thread.sleep(2000);
		//check in
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[33]")).click();
		Thread.sleep(2000);
		//check out//*[@id="root"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[34]
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[34]")).click();
			Thread.sleep(2000);
		//Rooms and guests
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[4]/div/input")).click();
		//	Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[1]/div/span[2]")).click();
			Thread.sleep(2000);
			driver .findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[1]/div")).click();
			Thread.sleep(2000);
			//Adults
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[2]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[2]/div/span[2]")).click();
			Thread.sleep(2000);
			//children
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[3]/div/span[2]")).click();
			Thread.sleep(2000);
			//age children
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[4]/div/span/svg")).sendKeys("2");
			Thread.sleep(2000);
			//Done
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[5]/button")).click();
			Thread.sleep(2000);
			//Search
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/button")).click();
			Thread.sleep(2000);
			//show hotel choose pop
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
			Thread.sleep(2000);
			//More options
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[2]/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/a")).click();
			Thread.sleep(2000);
			//select rooms
			driver.findElement(By.xpath("//*[@id=\"18001618\"]/div/div[2]/div[3]/div[3]/div[2]/button")).click();
			Thread.sleep(2000);
			//guest
			//FIRST NAME
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[2]/input")).sendKeys("ABC");
			Thread.sleep(2000);
			//LAST NAME
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[3]/input")).sendKeys("KSDG");
			Thread.sleep(2000);
			//Email
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/input")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);
			//mobile no
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/div/input")).sendKeys("123456789");
			Thread.sleep(2000);
			//addd gst
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[3]/ul/li/div/div[2]/div/button")).click();
			Thread.sleep(2000);
			//proceed button
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/button")).click();
			Thread.sleep(2000);
			//reviews
			driver.findElement(By.xpath("//*[@id=\"guest-reviews\"]/div/div/div[1]/h3")).click();
			Thread.sleep(2000);
			//show ratingand reviews
			driver.findElement(By.xpath("//*[@id=\"guest-reviews\"]/div/div/div[3]/div[1]/div/div[1]")).click();
			Thread.sleep(2000);
			//othrs hotels rating and views show
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[2]/div[2]/div/div[12]/div/div[1]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			//captures rate other hotels
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[2]/div[2]/div/div[12]/div/div[1]/div[2]/div[2]")).click();
			Thread.sleep(2000);
	}
  
  
  

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
