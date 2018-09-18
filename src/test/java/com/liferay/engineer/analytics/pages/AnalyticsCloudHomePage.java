package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class AnalyticsCloudHomePage {

	private static final By pagesLinkLocator = xpath("//*[contains(@class,\'button-root\')]//*[text()=\'Pages\']");
	private final CommonMethods commonMethods = new CommonMethods();
	
	public void clickOnPagesLinkFromMenu() {

		commonMethods.clickOnLink(pagesLinkLocator);
	}
	
}
