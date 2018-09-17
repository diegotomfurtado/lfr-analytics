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
public class HomePage extends CommonMethods {

	private static final By localDevelopementLinkLocator = xpath("//*[text()=\"Local Development\"]");

	public HomePage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public LoginPage localDevelopmentLink() {

		clickOnLink(localDevelopementLinkLocator);
		return new LoginPage(browser);
	}

}
