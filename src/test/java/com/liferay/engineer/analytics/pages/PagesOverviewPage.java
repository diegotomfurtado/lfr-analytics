package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class PagesOverviewPage extends CommonMethods {

	private static final By itemActiveByVisitorsBehaviorLocator = xpath(
			"//*[@class=\'card analytics-metrics-card\']//*[contains(@class,\'button-root\')]");
	private static final By itemActiveByViewsBySegmentsLocator = xpath(
			"//*[@class=\'card analytics-grouped-barchart-card\']//*[contains(@class,\'button-root\')]");
	private static final By itemActiveByLocationsLocator = xpath(
			".//*[@class=\'card analytics-locations-card\']/descendant::button");
	private static final By itemActiveByViewsByTechnologyLocator = xpath(
			"//*[text()=\'Views by Technology\']/following::button[1]");
	private static final By itemActiveByAssetsLocator = xpath(
			"//*[text()=\'Assets\']/following::button[8]");
	private static final By firstAssertLinksToWebContentLocator = xpath(
			"//*[@class=\'font-weight-semibold text-truncate-inline\']");
	private static final By erroMessageNoDataMatchingFromAssetsCardLocator = xpath(
			"//*[@class=\'m-auto pl-4 pr-4 position-relative text-center\']");

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

	public String checkDropdownItemActiveByAssets() {

		return returnElementFromPage(itemActiveByAssetsLocator);
	}

	public void selectLinkFromAssertCardList() {

		clickOnLink(firstAssertLinksToWebContentLocator);
	}

	public String erroMessageNoDataMactchingFromAssestCard() {

		return returnElementFromPage(erroMessageNoDataMatchingFromAssetsCardLocator);
	}
}
