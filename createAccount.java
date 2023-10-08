package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount 
{
		EdgeDriver driver=new EdgeDriver();
		
		public void LaunchBrowser()
		{
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		public void accountDetails()
		{
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("accountName")).sendKeys("Karthiga_test");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));	
		Select indus=new Select(industry);
		indus.selectByIndex(2);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select owner=new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select source1=new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing_id = driver.findElement(By.id("marketingCampaignId"));
		Select campaign=new Select(marketing_id);
		campaign.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province=new Select(state);
		province.selectByValue("TX");
		}
		public void submit()
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		}
		
		public static void main(String[] args)
		{
			createAccount test=new createAccount();
			test.LaunchBrowser();
			//test.accountDetails();
			//test.submit();
		
		}
	
}