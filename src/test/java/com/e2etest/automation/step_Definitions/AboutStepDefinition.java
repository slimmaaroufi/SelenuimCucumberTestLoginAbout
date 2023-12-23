package com.e2etest.automation.step_Definitions;
import org.junit.Assert;

import com.e2etest.automation.page_Objects.AboutPage;
import com.e2etest.automation.page_Objects.LoginPage;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AboutStepDefinition {
//declaration constructeur
public AboutPage aboutPage;
public ConfigFileReader configFileReader;

	public AboutStepDefinition() 
	{
		aboutPage=new AboutPage();
		configFileReader=new ConfigFileReader();
	
	}

	@When("Je clique sur le burguer menu button")
	public void jeCliqueSurLeBurguerMenuButton() 
	{
	aboutPage.clickbtnburger();
	}

	@And("Je clique sur le bouton About")
	public void jeCliqueSurLeBoutonAbout() 
	{
		aboutPage.clickBtnAbout();
	}
	
	@Then("Je me redirige vers la page About")
	public void jeMeRedirigeVersLaPageAbout(String titlePageAbout) 
	{
		String Title=AboutPage.titlePage.getText();
		Assert.assertEquals(titlePageAbout,Title);

		String currentUrl = Setup.getDriver().getCurrentUrl();
		assert currentUrl.contains("saucelabs.com");

	}

}
