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
public class PagesOverviewPage extends CommonMethods {

	private static final By itemActiveByVisitorsBehaviorLocator = xpath(
			"//*[@class=\'card analytics-metrics-card\']/descendant::button[contains(@class,\'button-root\')]");
	private static final By itemActiveByViewsBySegmentsLocator = xpath(
			".//*[@class=\'card analytics-grouped-barchart-card\']/descendant::button[contains(@class,\'button-root\')]");
	private static final By itemActiveByLocationsLocator = xpath(
			".//*[@class=\'card analytics-locations-card\']/descendant::button");
	private static final By itemActiveByViewsByTechnologyLocator = xpath(
			"//div[text()=\"Views by Technology\"]/following::button[@class=\"button-root btn btn-sm btn-secondary dropdown-toggle border-0\"]");
	private static final By itemActiveByAssetsLocator = xpath("//div[text()=\"Assets\"]/following::button");
	private static final By firstAssertLinksToWebContentLocator = xpath(
			"//*[@class=\"font-weight-semibold text-truncate-inline\"]");
	private static final By erroMessageNoDataMatchingFromAssetsCardLocator = xpath(
			"//div[@class=\"m-auto pl-4 pr-4 position-relative text-center\"]");

	public PagesOverviewPage(WebDriver browser) {
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

	public String checkDropdownItemActiveByAssets() {

		return returnElementFromPage(itemActiveByAssetsLocator);
	}

	public WebContentFromAssestsPage selectLinkFromAssertCardList() {

		clickOnLink(firstAssertLinksToWebContentLocator);
		return new WebContentFromAssestsPage(browser);
	}

	public String erroMessageNoDataMactchingFromAssestCard() {

		return returnElementFromPage(erroMessageNoDataMatchingFromAssetsCardLocator);
	}
}
