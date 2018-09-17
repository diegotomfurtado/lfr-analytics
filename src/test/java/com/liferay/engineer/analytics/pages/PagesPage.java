package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class PagesPage extends CommonMethods {

	private static final By dropdownPeriodTimeLocator = xpath(
			"//*[@class=\'analytics-dropdown dropdown btn-group border-0\']");
	private static final By elementFromDropdownItemActiveLocator = xpath(
			"//*[@class=\'dropdown-item active\']");
	private static final By anElementFromPageListLocator = xpath(
			"//*[@class=\'table-cell-expand table-first-column\']/child::*");
	private static final By last24HoursPeriodTimeLocator = xpath(
			"//*[@data-value=\'0\']");
	private static final By lastYesterdayPeriodTimeLocator = xpath(
			"//*[@data-value=\'1\']");
	private static final By last7DaysPeriodTimeLocator = xpath(
			"//*[@data-value=\'7\']");
	private static final By last28DaysPeriodTimeLocator = xpath(
			"//*[@data-value=\'28\']");
	private static final By last30DaysPeriodTimeLocator = xpath(
			"//*[@data-value=\"30\"]");
	private static final By last90DaysPeriodTimeLocator = xpath(
			"//*[@data-value=\'90\']");
	private static final By erroMessageNoDataMatching = xpath(
			"//*[contains(@class,\'m-auto pl-4 pr-4 position-relative\')]");
	private static final By orderDropdownListLocator = xpath(
			"//*[contains(@class,\'button-root\') and text()=\'Order\']");
	private static final By selectViewsOptionFromOrderDropdown = xpath(
			"//*[@class=\'custom-control-label-text\' and text()=\'Views\']");
	private static final By selectAnyRegionOnPagesLocator = xpath(
			"//*[@class=\'d-flex align-items-end\']");

	public String erroMessageNoDataMatching() {

		return returnElementFromPage(erroMessageNoDataMatching);
	}

	public void selectADropdownListFromPeriodTime() {

		clickOnButton(dropdownPeriodTimeLocator);
	}

	public void selectLast24HoursPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last24HoursPeriodTimeLocator);
	}

	public void selectYesterdayPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(lastYesterdayPeriodTimeLocator);
	}

	public void selectLast7DaysPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last7DaysPeriodTimeLocator);
	}

	public void selectLast28DaysPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last28DaysPeriodTimeLocator);
	}

	public void selectLast30DaysPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last30DaysPeriodTimeLocator);
	}

	public void selectLast90DayPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last90DaysPeriodTimeLocator);
	}

	public String checkDropdownItemActive() {

		return returnElementFromPage(elementFromDropdownItemActiveLocator);
	}

	public void selectLinkFromPagesList() {

		clickOnLink(anElementFromPageListLocator);
	}

	public void selectOrderDropdownList() {

		clickOnButton(orderDropdownListLocator);
	}

	public void orderByViewsFromOrderDropdown() {

		selectOrderDropdownList();
		clickOnButton(selectViewsOptionFromOrderDropdown);
	}

	public void changeAPerpectiveOfCursor() {

		clickOnButton(selectAnyRegionOnPagesLocator);
	}

}
