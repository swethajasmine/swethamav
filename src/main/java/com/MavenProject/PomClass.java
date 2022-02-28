package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	//WebElement element = driver.findElement(By.xpath("//a[@class='login']"));-->signin
	@FindBy(xpath="//a[@class='login']")
	private WebElement element;
	private WebDriver driver;

	public WebElement getElement() {
		return element;
	}
	
	
	public PomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement scroll = driver.findElement(By.xpath("//a[text()='support@seleniumframework.com']"));---> scroll
	@FindBy(xpath="//a[text()='support@seleniumframework.com")
	private WebElement scroll;

	public WebElement getScroll() {
		return scroll;
	}
	//	WebElement email = driver.findElement(By.id("email"));-->email
	@FindBy(id="email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
//	WebElement pass = driver.findElement(By.id("passwd"));
	@FindBy(id="passwd")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	//WebElement id = driver.findElement(By.id("SubmitLogin"));
	@FindBy(id="SubmitLogin")
	private WebElement id;

	public WebElement getId() {
		return id;
	}
	

}
