package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BlazeTesting 
{
	WebDriver driver;
	@BeforeTest
    public void beforeTest() throws InterruptedException
      {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Automation Setup\\Browser Extension\\chromedriver.exe"); 
      driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.manage().window().maximize();

 }
	  @Test
	  public void Blaze() throws InterruptedException 
	  {
		  driver.get("https://blazedemo.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).sendKeys("Paris");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")).sendKeys("Buenos Aires");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input")).click();
	      driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("PoojaK");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Azad Road");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Pune");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Maharashtra");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("411017");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"cardType\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("dfght234");
	      Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("12");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2021");
	       Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("ghjk");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();

	     
	}
	  
 
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
