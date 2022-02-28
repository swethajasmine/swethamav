package com.MavenProject;




import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	//browser launch
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Prog\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	//click
public static void webclick(WebElement ele) {
	ele.click();

}
//sendkeys
public static void websend(WebElement ele,String text) {
ele.sendKeys(text);
}
//url
public static void urlpro(String text) {
driver.get(text);
}
//close
public static void webclose() {
driver.close();
}
//quit
public static void webquit() {
	driver.quit();

}
//gettitle
public static void webtitle() {
String title = driver.getTitle();
System.out.println(title);
	
}
//navigate to
public static void navito(String url) {
driver.navigate().to(url);
}
//navigate forward
public static  void naviforword() {
driver.navigate().forward();
}
//navigate back
public static void naviback() {
driver.navigate().back();
}
//navigate refresh
public static void webrefres() {
driver.navigate().refresh();  
}
//NAVIMEThods
public static  void navigatemethods(String method) {
if (method.equalsIgnoreCase("back")) {
	driver.navigate().back();
}
else if (method.equalsIgnoreCase("forward")) {
	driver.navigate().forward();
	
}
else if (method.equalsIgnoreCase("refresh")) {
	driver.navigate().refresh();
	
}

}
//is enabled, isselected,isdisplayed--->webelement methods
//webelement method-->gettext,getattributs,clear
public static  void webelemethod(String is,WebElement webe ) {
if (is.equalsIgnoreCase("isdisplayed")) {
	boolean displayed = webe.isDisplayed();
	System.out.println(displayed);
}
else if (is.equalsIgnoreCase("is enabled")) {
	boolean enabled = webe.isEnabled();
	System.out.println(enabled);
	
}
else if (is.equalsIgnoreCase("is selected")) {
	boolean selected = webe.isSelected();
	System.out.println(selected);
	
}
else if (is.equalsIgnoreCase("gettext")) {
	String tt = webe.getText();
	System.out.println(tt);
	
}
else if (is.equalsIgnoreCase("getattribute")) {
	String att = webe.getAttribute("value");
	System.out.println(att);
	
}

}
//alert for one method

public static void Alertmetho(String option,String input,String okorcancel) {
	  //simple alert
	  if (option.equalsIgnoreCase("simple alert")) {
		
		 Alert alert = driver.switchTo().alert();
		 if (okorcancel.equalsIgnoreCase("ok")) {
			alert.accept();
		} else {
			alert.dismiss();

		}
	}
else if (option.equalsIgnoreCase("confirm alert")) {
		   
		   Alert alert2 = driver.switchTo().alert();
		   
		   if (okorcancel.equalsIgnoreCase("cancel")) {
			   alert2.dismiss();
			
		} else {
			alert2.accept();
		}
		}
	   else if (option.equalsIgnoreCase("prompt alert")) {
		   Alert alert3 = driver.switchTo().alert();
		   alert3.sendKeys(input);
		  if (option.equalsIgnoreCase("ok")) {
			  alert3.accept();
			
		} else {
alert3.dismiss();
		}
		 }

	  
	  
	}
//frame
public static void framemeth(WebElement elem,String option,String id,int index) {
	if (option.equalsIgnoreCase("webelement id")) {
	 driver.switchTo().frame(id);
		}
	else if (option.equalsIgnoreCase("index")) {
		driver.switchTo().frame(index);
	}
	else if (option.equalsIgnoreCase("webelement")) {
		driver.switchTo().frame(elem);
	}
	else if (option.equalsIgnoreCase("default")) {
		driver.switchTo().defaultContent();
		
	}
	else if (option.equalsIgnoreCase("parent")) {
		driver.switchTo().parentFrame();
		
	}
}
//check box
public static void checkboxpro(WebElement ele,WebElement kl) {
	ele.click();

}
//radiobutton
public static void radiobutme(WebElement element) {
	element.click();

}
//scroll up scroll down
public static void scrollme( WebElement scrollp,String option,int zero,int scroll) {
	  
	JavascriptExecutor j=(JavascriptExecutor) driver;
	if (option.equalsIgnoreCase("scroll down")) {
		
	
	j.executeScript("arguments[0].scrollIntoView();",scrollp);
	}
	else if (option.equalsIgnoreCase("scroll up")) {
		j.executeScript("windows.scrollBy(zero,-scroll)");
	}
	else if (option.equalsIgnoreCase("scroll down2")) {
		j.executeScript("windows.scrollBy(zero,scroll)");
	}
}
//action--->mousebased action
public static void mousebasedact(String option,WebElement ele,WebElement element) {
Actions df=new Actions(driver);
if (option.equalsIgnoreCase("move to element")) {
	df.moveToElement(ele).build().perform();
}
else if (option.equalsIgnoreCase("click")) {
	df.click(ele).build().perform();
}
else if (option.equalsIgnoreCase("drag and drop")) {
	df.dragAndDrop(ele, element).build().perform();
}
else if (option.equalsIgnoreCase("right click")) {
	df.contextClick(ele).build().perform();
}
else if (option.equalsIgnoreCase(" double click")) {
	df.doubleClick(ele).build().perform();
	}
}
//keyboard action--->robot
public static void boardaction(String option) throws AWTException {
Robot ac=new Robot();
if (option.equalsIgnoreCase("down")){
ac.keyPress(KeyEvent.VK_DOWN);
ac.keyRelease(KeyEvent.VK_DOWN);
}
else if (option.equalsIgnoreCase("enter")) {
	ac.keyPress(KeyEvent.VK_ENTER);
	ac.keyRelease(KeyEvent.VK_ENTER);
}
}
//screensort
public static void screensort(String pathname) throws IOException  {
	TakesScreenshot df=(TakesScreenshot) driver;
	File source = df.getScreenshotAs(OutputType.FILE);
	File destination = new File(pathname);
	FileUtils.copyFile(source, destination);
}
//DROP DOWN
public static void singledropdown(String option,int index,String selectby,WebElement elem) {
	  	Select s=new Select(elem);
	if (option.equalsIgnoreCase("selectbyvalue")) {
	
		s.selectByValue(selectby);
	}
	else if (option.equalsIgnoreCase("selectbyvisibletext")) {
		
		s.selectByVisibleText(selectby);
		
	}
	else if (option.equalsIgnoreCase("selectbyindex")) {
	
		s.selectByIndex(index);
		
	}
	else if (option.equalsIgnoreCase("is multiple")) {
	
		s.isMultiple();
	}
	else if (option.equalsIgnoreCase("get option")) {
		
		  List<WebElement> getopt = s.getOptions();
		for (WebElement webElem : getopt) {
			String text = webElem.getText();
			System.out.println(text);
		}
	}
	else if (option.equalsIgnoreCase("getallselectedoptions")) {

		WebElement firstSelop = s.getFirstSelectedOption();
		System.out.println(firstSelop.getText());
	}
	else if (option.equalsIgnoreCase("deselectbyvalue")) {
		s.deselectByValue(selectby);
	}
	else if (option.equalsIgnoreCase("deselectbyvisibletext")) {
		s.deselectByVisibleText(selectby);
	}
	else if (option.equalsIgnoreCase("deselectbyindex")) {
		s.deselectByIndex(index);
	}
	else if (option.equalsIgnoreCase("deselectall")) {
		s.deselectAll();
	}
	else if (option.equalsIgnoreCase("getfirstselectoption")) {
		WebElement firstseleopt = s.getFirstSelectedOption();
		System.out.println(firstseleopt.getText());
	}
	}
}




