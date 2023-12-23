package com.e2etest.automation.page_Objects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class AboutPage {
	
	//attribue de classe login page
	public ConfigFileReader configFileReader;
	public WebDriverWait wait;
	
	@FindBy(how=How.CSS,using="#menu_button_container")
	public static WebElement btnburger;
	
	@FindBy(how=How.ID,using="about_sidebar_link")
	public static WebElement btnAboutSidebar;
		
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Swag Labs')]")
	public static WebElement titlePage;
	
	//constructeur
	public AboutPage()
	{
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
	}

	public void clickbtnburger()
	{
		btnburger.click();
	}

	public void clickBtnAbout()
	{
		btnAboutSidebar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_sidebar_link")));
		btnAboutSidebar.click();
	}
	
	
	
	
}
	
