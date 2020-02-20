package login.trademart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
static WebDriver driver;
	@BeforeClass
	public static void url(){
System.setProperty("webdriver.chrome.driver", "F:\\mahi java\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://products.ncryptedprojects.com/trademart/");

}
	@AfterClass
	public static void close(){
		//driver.close();
	}
	@Test
	public void applogin() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='login_signup']/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div[4]/div/div/form/div[1]/div/div[1]/input")).sendKeys("buyer.ncrypted@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("submitLogin")).click();
		Thread.sleep(5000);
		//WebDriverWait wait=new WebDriverWait(driver,6000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button"))));
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button")).click();
		driver.findElement(By.linkText("Add New Buying Requirement")).click();
		driver.findElement(By.xpath("//span[text()='Upload Image']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='avatar-upload']")).click();
		//Screen sc=new Screen();
		//sc.type("./filename.JPG", "C:\\Users\\SWAPNA\\Pictures\\Saved Pictures\\file1.jpeg");
		//sc.click("./open.JPG");
		
		
				
		
	}
	/*@Test
	public void apphomepage(){
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}*/
}