package week2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook

{		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhu A\\eclipse-workspace\\karthiga\\selenium\\driver\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		
		public void LaunchBrowser()
		{
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		}
		
		public void createAccount()
		{
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		}
		public void accountDetails()
		{
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("123");
		driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		driver.findElement(By.id("password_step_input")).sendKeys("karthiga_123");
		WebElement day_dd = driver.findElement(By.id("day"));
		Select day=new Select(day_dd);
		day.selectByValue("1");
		WebElement month_dd = driver.findElement(By.id("month"));
		Select month=new Select(month_dd);
		month.selectByValue("1");
		WebElement year_dd = driver.findElement(By.id("year"));
		Select year=new Select(year_dd);
		year.selectByValue("1990");
		driver.findElement(By.xpath("//span/label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		}
		public static void main(String[] args) 
		{
		Facebook fb=new Facebook();
		fb.LaunchBrowser();
		fb.createAccount();
		fb.accountDetails();
		}
}
