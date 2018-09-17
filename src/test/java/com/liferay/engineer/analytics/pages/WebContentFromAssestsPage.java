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
public class WebContentFromAssestsPage extends CommonMethods {

	private static final By itemActiveByVisitorsBehaviorLocator = xpath(
			"//*[@class=\'card analytics-metrics-card\']/descendant::button[contains(@class,\'button-root\')]");
	private static final By itemActiveByViewsBySegmentsLocator = xpath(
			".//*[@class=\'card analytics-grouped-barchart-card\']/descendant::button[contains(@class,\'button-root\')]");
	private static final By itemActiveByLocationsLocator = xpath(
			".//*[@class=\'card analytics-locations-card\']/descendant::button");
	private static final By itemActiveByViewsByTechnologyLocator = xpath(
			"//div[text()=\"Views by Technology\"]/following::div[2]/button");
	private static final By itemActiveByAssetAppearsOnLocator = xpath(
			"//div[text()=\"Asset Appears On\"]/following::div[2]/button");

	public WebContentFromAssestsPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public String checkDropdownItemActiveByVisitorsBehavior() {
		
		return returnElementFromPage(itemActiveByVisitorsBehaviorLocator);
	}

	public String checkDropdownItemActiveByViewsBySegments() {
		
		return returnElementFromPage(itemActiveByViewsBySegmentsLocator);
	}

	public String checkDropdownItemActiveByLocations() {

		return returnElementFromPage(itemActiveByLocationsLocator);
	}

	public String checkDropdownItemActiveByViewsByTechnology() {
		
		return returnElementFromPage(itemActiveByViewsByTechnologyLocator);
	}

	public String checkDropdownItemActiveByAssetAppearsOn() {
		
		return returnElementFromPage(itemActiveByAssetAppearsOnLocator);
	}
	
}
