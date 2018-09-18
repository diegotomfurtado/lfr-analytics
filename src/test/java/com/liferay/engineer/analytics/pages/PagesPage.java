package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
 * @author Diego Furtado
 */
public class PagesPage {

	private final CommonMethods commonMethods = new CommonMethods();

	private static final By dropdownPeriodTimeLocator = xpath(
			"//*[@class=\'analytics-dropdown dropdown btn-group border-0\']");
	private static final By elementFromDropdownItemActiveLocator = xpath("//*[@class=\'dropdown-item active\']");
	private static final By anElementFromPageListLocator = xpath(
			"//*[@class=\'table-cell-expand table-first-column\']/child::*");
	private static final By last24HoursPeriodTimeLocator = xpath("//*[@data-value=\'0\']");
	private static final By lastYesterdayPeriodTimeLocator = xpath("//*[@data-value=\'1\']");
	private static final By last7DaysPeriodTimeLocator = xpath("//*[@data-value=\'7\']");
	private static final By last28DaysPeriodTimeLocator = xpath("//*[@data-value=\'28\']");
	private static final By last30DaysPeriodTimeLocator = xpath("//*[@data-value=\"30\"]");
	private static final By last90DaysPeriodTimeLocator = xpath("//*[@data-value=\'90\']");
	private static final By erroMessageNoDataMatching = xpath(
			"//*[contains(@class,\'m-auto pl-4 pr-4 position-relative\')]");
	private static final By orderDropdownListLocator = xpath(
			"//*[contains(@class,\'button-root\') and text()=\'Order\']");
	private static final By selectViewsOptionFromOrderDropdown = xpath(
			"//*[@class=\'custom-control-label-text\' and text()=\'Views\']");
	private static final By selectAnyRegionOnPagesLocator = xpath("//*[@class=\'d-flex align-items-end\']");

	public String returnElementErroMessageNoDataMatching() {

		return commonMethods.returnElementFromPage(erroMessageNoDataMatching);
	}

	public void clickOnDropdownListFromPeriodTime() {

		commonMethods.clickOnButton(dropdownPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last24Hours_PagesPage() {

		clickOnDropdownListFromPeriodTime();
		commonMethods.clickOnLink(last24HoursPeriodTimeLocator);
	}

	public void clickOnDropdownList_Yesterday_PagesPage() {

		clickOnDropdownListFromPeriodTime();
		commonMethods.clickOnLink(lastYesterdayPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last7Days_PagesPage() {

		clickOnDropdownListFromPeriodTime();
		commonMethods.clickOnLink(last7DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last28Days_PagesPage() {

		clickOnDropdownListFromPeriodTime();
		commonMethods.clickOnLink(last28DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last30Days_PagesPage() {

		clickOnDropdownListFromPeriodTime();
		commonMethods.clickOnLink(last30DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last90Days_PagesPage() {

		clickOnDropdownListFromPeriodTime();
		commonMethods.clickOnLink(last90DaysPeriodTimeLocator);
	}

	public String returnElementFromDropdownItemActive() {

		return commonMethods.returnElementFromPage(elementFromDropdownItemActiveLocator);
	}

	public void clickOnLinkFromPagesList() {

		commonMethods.clickOnLink(anElementFromPageListLocator);
	}

	public void clickOnOrder_DropdownList() {

		commonMethods.clickOnButton(orderDropdownListLocator);
	}

	public void clickOnOrderByViews_DropdownList() {

		clickOnOrder_DropdownList();
		commonMethods.clickOnButton(selectViewsOptionFromOrderDropdown);
	}

	public void clickOutToChangeAPerpectiveOfCursor() {

		commonMethods.clickOnButton(selectAnyRegionOnPagesLocator);
	}

}
