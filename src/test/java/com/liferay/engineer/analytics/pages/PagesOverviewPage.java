package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
 * @author Diego Furtado
 */
public class PagesOverviewPage {

	CommonMethods commonMethods = new CommonMethods();

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

	public String returnElement_ByVisitorsBehavior() {

		return commonMethods.returnElementFromPage(itemActiveByVisitorsBehaviorLocator);
	}

	public String returnElement_ByViewsBySegments() {

		return commonMethods.returnElementFromPage(itemActiveByViewsBySegmentsLocator);
	}

	public String returnElement_ByLocations() {

		return commonMethods.returnElementFromPage(itemActiveByLocationsLocator);
	}

	public String returnElement_ByViewsByTechnology() {

		return commonMethods.returnElementFromPage(itemActiveByViewsByTechnologyLocator);
	}

	public String returnElement_ByAssets() {

		return commonMethods.returnElementFromPage(itemActiveByAssetsLocator);
	}

	public void clickOnLinkFromAssertCardList() {

		commonMethods.clickOnLink(firstAssertLinksToWebContentLocator);
	}

	public String returnElement_ErroMessage_NoDataMactchingFromAssestCard() {

		return commonMethods.returnElementFromPage(erroMessageNoDataMatchingFromAssetsCardLocator);
	}
}
