package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.hdfclife.com/term-insurance-plans/term-insurance-calculator");
		driver.findElement(By.id("fnameBannerForm")).sendKeys("Shrikant");
	driver.findElement(By.id("yes_nriBannerForm")).click();
	driver.findElement(By.id("femaleBannerForm")).click();
	driver.findElement(By.id("yesBannerForm")).click();
	driver.findElement(By.id("email")).sendKeys("shrikantchincholkar4455@gmail.com");
	Thread.sleep(5000);
	
	driver.findElement(By.id("code")).sendKeys("91");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@placeholder='Enter Mobile'])[2]")).sendKeys("8888607660");

	
	driver.findElement(By.name("dateBirth")).click();
	
	
	WebElement date = driver.findElement(By.xpath("(//select[@class='monthselect'])[1]"));	
	Select s=new Select(date);
	s.selectByIndex(7);
	WebElement year = driver.findElement(By.xpath("(//select[@class='yearselect'])[1]"));
	Select s1=new Select(year);
	s1.selectByVisibleText("2001");
	driver.findElement(By.xpath("//td[.='21']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='applyBtn btn btn-sm btn-primary']")).click();
	//driver.findElement(By.xpath("//button[.='Cancel']")).click();
	Thread.sleep(5000);
	
	
	
	driver.findElement(By.id("submitResult")).click();
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("//h4[.='Thank you for your interest in this plan']")).getText();
	System.out.println(text);
	
	driver.findElement(By.xpath("//button[.='I understand']")).click();
	Thread.sleep(3000);
	driver.close();
	
	}

}
