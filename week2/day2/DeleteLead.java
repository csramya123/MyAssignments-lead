package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Leaftaps"))
		{
			System.out.println("We are in Right Page");
		}
		else
		{
			System.out.println("We are in Wrong Page");
		}
		
		WebElement crmsfaac = driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']"));
		crmsfaac.click();
		
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		
		WebElement Findleadlink = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		Findleadlink.click();
		
		WebElement phnlink = driver.findElement(By.xpath("//span[text()='Phone']"));
		phnlink.click();
		
		WebElement phnAreacode = driver.findElement(By.name("phoneAreaCode"));
		phnAreacode.sendKeys("1");
		
		WebElement phnnum = driver.findElement(By.name("phoneNumber"));
		phnnum.sendKeys("9876542132");
		
		WebElement Findleadbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		Findleadbutton.click();
		
		
	}

}

