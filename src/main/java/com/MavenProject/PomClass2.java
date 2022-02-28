package com.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass2 {
	//WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
private WebElement checkout;
	private WebDriver driver;

	public WebElement getCheckout() {
		return checkout;
	}
	public PomClass2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement Checkout2;

	public WebElement getCheckout2() {
		return Checkout2;
	}
//	WebElement checkout3 = driver.findElement(By.name("processAddress"));
	@FindBy(name="processAddress")
	private WebElement checkout3;

	public WebElement getCheckout3() {
		return checkout3;
	}
	//	WebElement checkout4 = driver.findElement(By.id("cgv"));
	@FindBy(id="cgv")
	private WebElement checkout4;

	public WebElement getCheckout4() {
		return checkout4;
	}
	//WebElement carrier = driver.findElement(By.name("processCarrier"));
	@FindBy(name="processCarrier")
	private WebElement carrier;

	public WebElement getCarrier() {
		return carrier;
	}
	
}
