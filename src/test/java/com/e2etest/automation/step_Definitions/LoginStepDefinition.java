package com.e2etest.automation.step_Definitions;

import org.junit.Assert;

import com.e2etest.automation.page_Objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	//attribut de la classe LoginPage
	public LoginPage loginPage;
	
	//constructeur
	public LoginStepDefinition()
	{
		loginPage=new LoginPage();
	}

	@Given("Je me connecte a l application Swag Labs")
	public void jeMeConnecteALApplicationSwagLabs() {
		loginPage.connectToApp();
	}
	@When("Je saisi le username")
	public void jeSaisiLeUsername() {
		loginPage.fillUsername();
	}
	@When("Je saisi le password")
	public void jeSaisiLePassword() {
		loginPage.fillPassword();
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickBtnLogin();
	}
	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String titlePageAcceuil) {
		String title=LoginPage.titlePage.getText();
		Assert.assertEquals(titlePageAcceuil, title);
		loginPage.verifURL();
	}

	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String username) {
		loginPage.fillUsername1(username);
	}
	@When("Je saisi le password {string}")
	public void jeSaisiLePassword(String password) {
		loginPage.fillPassword1(password);
	}
	@Then("Le message d erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String msgError) {
		String msg=LoginPage.msgError.getText();
		Assert.assertEquals(msgError, msg);
		
	}
}
