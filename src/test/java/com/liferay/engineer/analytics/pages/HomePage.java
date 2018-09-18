package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class HomePage {

	CommonMethods commonMethods = new CommonMethods();

	private static final By localDevelopementLinkLocator = xpath("//*[text()=\'Local Development\']");

	public void clickOnLocalDevelopmentLink() {

		commonMethods.clickOnLink(localDevelopementLinkLocator);
	}

}
