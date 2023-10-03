package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		
		public void login()
		{
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		}
		public void findLead()
		{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("02");
		driver.findElement(By.name("phoneNumber")).sendKeys("9999999999");
		driver.findElement(By.linkText("Find Leads")).click();
		}
		
		public void delete()
		{
		String element = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a[1]")).getText();
		System.out.println(element);
		
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a[1]")).click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(element);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		}
		//driver.close();
		public static void main(String[] args)
		{
		
			DeleteLead del=new DeleteLead();
			del.login();
			del.findLead();
			del.delete();
			
		}

}
