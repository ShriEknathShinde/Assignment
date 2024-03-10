package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.hdfclife.com/term-insurance-plans/term-insurance-calculator");
	Thread.sleep(500);
	
	driver.findElement(By.name("input_3")).sendKeys("Ayesha vikram Takia");
	Thread.sleep(500);
	driver.findElement(By.id("yes_nriBannerForm")).click();
	Thread.sleep(500);
	driver.findElement(By.className("selectFemale")).click();
	Thread.sleep(500);
	driver.findElement(By.id("yesBannerForm")).click();
	Thread.sleep(500);
	
	driver.findElement(By.name("dateBirth")).click();
	
	WebElement date = driver.findElement(By.xpath("(//select[@class='monthselect'])[1]"));
	Select s = new Select(date);
	s.selectByIndex(7);
	driver.findElement(By.xpath("//td[.='21']")).click();
	WebElement year = driver.findElement(By.xpath("(//select[@class='yearselect'])[1]"));
	Select y = new Select(year);
	y.selectByVisibleText("1985");
	Thread.sleep(1000);
	
	WebElement abc = driver.findElement(By.xpath("//button[.='Apply']"));
	Actions ao = new Actions(driver);
	ao.doubleClick(abc).perform();
	Thread.sleep(500);
	
	driver.findElement(By.xpath("(//input[@class='form-control input-field'])[2]")).sendKeys("abc54@gmail.com");
	Thread.sleep(500);
	driver.findElement(By.id("code")).sendKeys("91");
	driver.findElement(By.xpath("(//input[@placeholder='Enter Mobile'])[2]")).sendKeys("4455789812");
	Thread.sleep(500);
	
	WebElement xyz = driver.findElement(By.xpath("//button[.='Check Premium']"));
	Actions ac= new Actions(driver);
	ac.doubleClick(xyz).perform();
	Thread.sleep(1000);
	driver.findElement(By.id("submitResult")).click();
	Thread.sleep(5000);
	
	String text = driver.findElement(By.xpath("//h4[.='Thank you for your interest in this plan']")).getText();
        driver.switchTo().alert();
	System.out.println(text);
	
	driver.findElement(By.xpath("//h4[.='Thank you for your interest in this plan']")).click();

	Thread.sleep(1000);
	driver.close();	
	}
}
