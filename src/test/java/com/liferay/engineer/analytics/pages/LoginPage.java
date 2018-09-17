package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.liferay.engineer.analytics.utils.CommonMethods;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class LoginPage extends CommonMethods{

	private final static By emailAddressFieldLocator = xpath(".//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]");
	private final static By passwordFieldLocator = xpath(".//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]");
	private final static By signInButtonLocator = xpath(".//button[@class=\"btn btn-lg btn-primary btn-default\"]");
	
	
	private static final String liferayPortalUser = "test@liferay.com";
	private static final String liferayPortalPass = "test";
	
	public LoginPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage typeEmailAddressOnLoginForm() {
		switchToNewWindowPage();
		input(emailAddressFieldLocator, liferayPortalUser);
		return this;
	}
	
	public LoginPage typePasswordOnLoginForm() {
		
		input(passwordFieldLocator, liferayPortalPass);
		return this;
	}

	public AnalyticsCloudProjectPage clickOnSignInButton() {
		
		clickOnButton(signInButtonLocator);
		return new AnalyticsCloudProjectPage(browser);
	}
	
}
