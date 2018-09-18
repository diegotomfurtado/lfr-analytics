package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class WebContentFromAssestsPage {
	
	private final CommonMethods commonMethods = new CommonMethods();

	private static final By itemActiveByVisitorsBehaviorLocator = xpath(
			"//*[@class=\'card analytics-metrics-card\']//*[contains(@class,\'button-root\')]");
	private static final By itemActiveByViewsBySegmentsLocator = xpath(
			".//*[@class=\'card analytics-grouped-barchart-card\']//*[contains(@class,\'button-root\')]");
	private static final By itemActiveByLocationsLocator = xpath(
			".//*[@class=\'card analytics-locations-card\']/descendant::button");
	private static final By itemActiveByViewsByTechnologyLocator = xpath(
			"//div[text()=\"Views by Technology\"]/following::div[2]/button");
	private static final By itemActiveByAssetAppearsOnLocator = xpath(
			"//div[text()=\"Asset Appears On\"]/following::div[2]/button");

	public String returnElement_ActiveByVisitorsBehavior() {
		
		return commonMethods.returnElementFromPage(itemActiveByVisitorsBehaviorLocator);
	}

	public String returnElement_ActiveByViewsBySegments() {
		
		return commonMethods.returnElementFromPage(itemActiveByViewsBySegmentsLocator);
	}

	public String returnElement_ActiveByLocations() {

		return commonMethods.returnElementFromPage(itemActiveByLocationsLocator);
	}

	public String returnElement_ActiveByViewsByTechnology() {
		
		return commonMethods.returnElementFromPage(itemActiveByViewsByTechnologyLocator);
	}

	public String returnElement_ActiveByAssetAppearsOn() {
		
		return commonMethods.returnElementFromPage(itemActiveByAssetAppearsOnLocator);
	}
	
}
