package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import com.liferay.engineer.analytics.utils.CommonMethods;

import org.openqa.selenium.By;

/**
* @author Diego Furtado
*/
public class AnalyticsCloudHomePage {

	public static void clickOnPagesLinkFromMenu() {
		_commonMethods.clickOnLink(_pagesLinkLocator);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _pagesLinkLocator = xpath(
		"//*[contains(@class,\'button-root\')]//*[text()=\'Pages\']");

}