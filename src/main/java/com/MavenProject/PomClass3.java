package com.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass3 {
//	WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement cheque;
	private WebDriver driver;

	public WebElement getCheque() {
		return cheque;
	}
	public PomClass3(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	////WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	//WebElement scroll2 = driver.findElement(By.xpath("//a[text()='My account']"));
	@FindBy(xpath="//a[text()='My account']")
	private WebElement scroll2;

	public WebElement getScroll2() {
		return scroll2;
	}
	

}
