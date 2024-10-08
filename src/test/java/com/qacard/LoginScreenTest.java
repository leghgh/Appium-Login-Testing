package com.qacard;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginScreenTest {
	
	@Test(priority=5, groups = "tasksMod")
	public void ClickSignuponLogin() {
		System.out.println("************Cliquer sur le bouton signup");
	}
	
	@Test(priority=2,groups = "tasksModok")
	public void LoginWithValidCredentials() {
		System.out.println("************login et mot de passe correct");
	}
	
	
	
	@Test(groups = "tasksModok")
	public void LoginWithValidEmail() {
		System.out.println("************login valide mot de passe invalid");
	}
	@Test(priority=1,groups = "tasksModok")
	public void LoginWithValidPassword() {
		System.out.println("************login invalid et mot de passe valid");
	}
	
	
	@AfterSuite
	public void sellMobileAfterClass() {
		System.out.println("***Sell the mobile After suite");
	}
	
	@Parameters({"utilisateurConnecté", "connectedUser"})
	@Test
	public void boyMobileBeforeClass(String utilisateurConnecté, String connectedUser) {
		System.out.println("***Buy the mobile Before suite");
		
		if(utilisateurConnecté.equalsIgnoreCase("zeid")) {
			System.out.println("zeid" +"_______"+ connectedUser);
		}
		else {
			System.out.println("vérifier user" +"_______"+ connectedUser);
		}
	}
	

}
