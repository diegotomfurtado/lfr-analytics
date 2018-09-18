package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class LoginPage {

	CommonMethods commonMethods = new CommonMethods();

	private final static By emailAddressFieldLocator = xpath(".//*[contains(@id,\'LoginPortlet_login\')and @type]");
	private final static By passwordFieldLocator = xpath(".//*[contains(@id,\'LoginPortlet_password\') and @type]");
	private final static By signInButtonLocator = xpath(".//*[contains(@class,\'btn-primary\')]");

	private static final String liferayPortalUser = "test@liferay.com";
	private static final String liferayPortalPass = "test";

	public void typeEmailAddressOnLoginForm() {
		commonMethods.switchToNewWindowPage();
		commonMethods.input(emailAddressFieldLocator, liferayPortalUser);
	}

	public void typePasswordOnLoginForm() {

		commonMethods.input(passwordFieldLocator, liferayPortalPass);
	}

	public void clickOnSignInButton() {

		commonMethods.clickOnButton(signInButtonLocator);
	}

}
