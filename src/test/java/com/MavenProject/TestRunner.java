package com.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Prog\\Driver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	//driver.get("http://automationpractice.com/index.php");
	//driver.manage().window().maximize();
	browserLaunch();
	urlpro("http://automationpractice.com/index.php");
	//WebElement element = driver.findElement(By.xpath("//a[@class='login']"));
	PomClass gf=new PomClass(driver);
	
	//.click();
	webclick(gf.getElement());
	Thread.sleep(3000);
	//WebElement scroll = driver.findElement(By.xpath("//a[text()='support@seleniumframework.com']"));
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView();", gf.getScroll());
	Thread.sleep(3000);
//	js.executeScript("window.scrollBy(0,-500);");
//	WebElement email = driver.findElement(By.id("email"));
	//email.sendKeys("swethajasmine1999@gmail.com");
	websend(gf.getEmail(), "swethajasmine1999@gmail.com");
//	WebElement pass = driver.findElement(By.id("passwd"));
	//.sendKeys("swetha123");
	websend(gf.getPass(), "swetha123");
	//WebElement id = driver.findElement(By.id("SubmitLogin"));
	//.click();
	webclick(gf.getId());
	
//	WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	//.click();
	PomClass1 pc=new PomClass1(driver);
	webclick(pc.getTshirt());
	//WebElement scrollagain = driver.findElement(By.xpath("(//i[@class='icon-phone'])[2]"));
	JavascriptExecutor je=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	je.executeScript("arguments[0].scrollIntoView();",pc.getScrollagain());
	Thread.sleep(3000);
	je.executeScript("window.scrollBy(0,-500);");
	//WebElement os = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	//orangeshirt.click();
	webclick(pc.getOs());
//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(pc.getFrame());
//	WebElement addcart = driver.findElement(By.name("Submit"));
	webclick(pc.getAddcart());
	//.click();
	Thread.sleep(12000);
	driver.switchTo().defaultContent();
	PomClass2 pc2=new PomClass2(driver);
	//WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	//checkout.click();
	webclick(pc2.getCheckout());
//	WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	//.click();
	webclick(pc2.getCheckout2());
//	WebElement checkout3 = driver.findElement(By.name("processAddress"));
	//.click()
	webclick(pc2.getCheckout3());
//	WebElement checkout4 = driver.findElement(By.id("cgv"));
	//.click();
	webclick(pc2.getCheckout4());
	//WebElement carrier = driver.findElement(By.name("processCarrier"));
	//.click();
	webclick(pc2.getCarrier());
	PomClass3 pc3=new PomClass3(driver);
//	WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
	//.click();
	webclick(pc3.getCheque());
	//WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//.click();
	webclick(pc3.getSubmit());
	//WebElement scroll2 = driver.findElement(By.xpath("//a[text()='My account']"));
	JavascriptExecutor jd=(JavascriptExecutor) driver;
	jd.executeScript("arguments[0].scrollIntoView();",pc3.getScroll2());
	Thread.sleep(3000);
	jd.executeScript("window.scrollBy(0,-500);");
	Thread.sleep(3000);
	screensort("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Selenium_Prog\\\\screensort\\\\swe.png");
	//TakesScreenshot ts=(TakesScreenshot) driver;
	//File sou = ts.getScreenshotAs(OutputType.FILE);
//	File des = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Prog\\screensort\\swe.png");
//	FileUtils.copyFile(sou, des);
	}
}