package com.e2etest.automation.page_Objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class LoginPage {
	
	//attribue de classe login page
	public ConfigFileReader configFileReader;
	
	@FindBy(how=How.ID,using="user-name")
	public static WebElement username;
	
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	
	@FindBy(how=How.ID,using="login-button")
	public static WebElement btnLogin;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Products')]")
	public static WebElement titlePage;
	
	@FindBy(how=How.XPATH,using="//div[@id='login_button_container']//form//h3")
	public static WebElement msgError;
	
	//constructeur
	public LoginPage()
	{
		PageFactory.initElements(Setup.getDriver(), this);
		//objet de la classe ConfigueFileReader
		configFileReader=new ConfigFileReader();
		String url=configFileReader.getProperties("home.url");
	}
	
	//methode
	public void connectToApp()
	{
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	
	public void fillUsername()
	{
		username.sendKeys(configFileReader.getProperties("home.login"));
	}
	public void fillUsername1(String usr)
	{
		username.sendKeys(usr);
	}
	
	public void fillPassword()
	{
		password.sendKeys(configFileReader.getProperties("home.password"));
	}
	public void fillPassword1(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickBtnLogin()
	{
		btnLogin.click();
	}
	
	public void verifURL()
	{
		String urlActual=Setup.getDriver().getCurrentUrl();
		Assert.assertNotEquals(urlActual,configFileReader.getProperties("home.url"));
	}
}
