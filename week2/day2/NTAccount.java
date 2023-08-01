package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTAccount {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		WebElement crr=driver.findElement(By.name("currencyUomId"));
		Select a=new Select(crr);
		a.selectByValue("INR");
		
		driver.findElement(By.xpath("//textarea[@id=\"ext-gen629\"]")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id=\"groupNameLocal\"]")).sendKeys("localname1");
		driver.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("sitename1");
		
		WebElement ind=driver.findElement(By.name("industryEnumId"));
		Select b=new Select(ind);
		b.selectByValue("IND_SOFTWARE");
		
		WebElement owner=driver.findElement(By.name("ownershipEnumId"));
		Select c=new Select(owner);
		c.selectByVisibleText("S-Corporation");
		
		WebElement src=driver.findElement(By.name("dataSourceId"));
		Select d=new Select(src);
		d.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaign=driver.findElement(By.name("marketingCampaignId"));
		Select e=new Select(campaign);
		e.selectByIndex(6);
		
		WebElement province=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select f=new Select(province);
		f.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
		
	}

}
