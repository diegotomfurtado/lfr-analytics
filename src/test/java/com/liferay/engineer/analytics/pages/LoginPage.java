package com.liferay.engineer.analytics.pages;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getDefaultPassword;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getDefaultUsername;
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

	public void typeEmailAddressOnLoginForm() {
		commonMethods.switchToNewWindowPage();
		commonMethods.input(emailAddressFieldLocator, getDefaultUsername());
	}

	public void typePasswordOnLoginForm() {

		commonMethods.input(passwordFieldLocator, getDefaultPassword());
	}

	public void clickOnSignInButton() {

		commonMethods.clickOnButton(signInButtonLocator);
	}

}
