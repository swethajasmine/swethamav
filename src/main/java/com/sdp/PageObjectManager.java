package com.sdp;

import org.openqa.selenium.WebDriver;

import com.MavenProject.PomClass;
import com.MavenProject.PomClass1;
import com.MavenProject.PomClass2;
import com.MavenProject.PomClass3;

public class PageObjectManager {
	private WebDriver driver;
	private PomClass pom;
	private PomClass1 pom1;
	private PomClass2 pom2;
    private PomClass3 pom3;
   


	public void setPom(PomClass pom) {
		this.pom = pom;
	}

	public PomClass2 getPom2() {
		return pom2;
	}

	public PomClass3 getPom3() {
		return pom3;
	}

	public PageObjectManager(WebDriver driver1 ) {
		this.driver=driver1;
	}

	public PomClass getPom() {
		return pom;
	}
	

}
