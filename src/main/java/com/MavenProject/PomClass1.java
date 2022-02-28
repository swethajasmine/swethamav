package com.MavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass1 {
//	WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirt;
private WebDriver driver;
public WebElement getTshirt() {
		return tshirt;
	}
	public PomClass1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements((WebDriver) driver, this);
	}
	//WebElement scrollagain = driver.findElement(By.xpath("(//i[@class='icon-phone'])[2]"));
	@FindBy(xpath="(//i[@class='icon-phone'])[2]")
	private WebElement scrollagain;
 public WebElement getScrollagain() {
		return scrollagain;
	}
//WebElement os = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
 @FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
 private WebElement os;
public WebElement getOs() {
	return os;
}
//WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
@FindBy(xpath="//iframe[@class='fancybox-iframe']")
private WebElement frame;
public WebElement getFrame() {
	return frame;
}
//WebElement addcart = driver.findElement(By.name("Submit"));
@FindBy(name = "Submit")
private WebElement addcart;
public WebElement getAddcart() {
	return addcart;
}


}
