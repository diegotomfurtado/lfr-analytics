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
public class AnalyticsCloudHomePage extends CommonMethods {

	private static final By pagesLinkLocator = xpath("//*[contains(@class,\"button-root btn btn-link\")]//following-sibling::span[text()=\"Pages\"]");

	public AnalyticsCloudHomePage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public PagesPage clickOnPagesLinkFromMenu() {

		clickOnLink(pagesLinkLocator);
		return new PagesPage(browser);
	}
	
}
