package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class AnalyticsCloudHomePage extends CommonMethods {

	private static final By pagesLinkLocator = xpath("//*[contains(@class,\'button-root\')]//*[text()=\'Pages\']");
	
	public void clickOnPagesLinkFromMenu() {

		clickOnLink(pagesLinkLocator);
	}
	
}
