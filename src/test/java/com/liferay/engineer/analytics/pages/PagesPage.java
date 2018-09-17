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
public class PagesPage extends CommonMethods {
	
	private static final By dropdownPeriodTimeLocator = xpath("//*[@class=\"analytics-dropdown dropdown btn-group border-0\"]");
	private static final By elementFromDropdownItemActiveLocator = xpath("//*[@class=\"dropdown-item active\"]");
	private static final By anElementFromPageListLocator = xpath("//*[@class=\"table-cell-expand table-first-column\"]/child::*");
	private static final By last24HoursPeriodTimeLocator = xpath("//*[@data-value=\"0\"]");
	private static final By lastYesterdayPeriodTimeLocator = xpath("//*[@data-value=\"1\"]");
	private static final By last7DaysPeriodTimeLocator = xpath("//*[@data-value=\"7\"]");
	private static final By last28DaysPeriodTimeLocator = xpath("//*[@data-value=\"28\"]");
	private static final By last30DaysPeriodTimeLocator = xpath("//*[@data-value=\"30\"]");
	private static final By last90DaysPeriodTimeLocator = xpath("//*[@data-value=\"90\"]");
	private static final By erroMessageNoDataMatching = xpath("//*[@class=\"m-auto pl-4 pr-4 position-relative text-center table-double-list table-hover\"]");
	private static final By orderDropdownListLocator = xpath("//*[@class=\"button-root btn btn-unstyled btn-sm dropdown-toggle\" and text()=\"Order\"]");
	private static final By selectViewsOptionFromOrderDropdown = xpath("//span[@class=\"custom-control-label-text\" and text()=\"Views\"]");
	private static final  By selectAnyRegionOnPagesLocator = xpath("//*[@class=\"d-flex align-items-end\"]");
	
	public PagesPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public String erroMessageNoDataMatching() {
		
		return returnElementFromPage(erroMessageNoDataMatching);
	}
	
	public PagesPage selectADropdownListFromPeriodTime() {

		clickOnButton(dropdownPeriodTimeLocator);
		return this;
	}

	public PagesPage selectLast24HoursPeriodTimeFromPagesDropdownList() {
		
		selectADropdownListFromPeriodTime();
		clickOnLink(last24HoursPeriodTimeLocator);
		return this;
	}
	
	public PagesPage selectYesterdayPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(lastYesterdayPeriodTimeLocator);
		return this;
	}
	
	public PagesPage selectLast7DaysPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last7DaysPeriodTimeLocator);
		return this;
	}
	
	public PagesPage selectLast28DaysPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last28DaysPeriodTimeLocator);
		return this;
	}
	
	public PagesPage selectLast30DaysPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last30DaysPeriodTimeLocator);
		return this;
	}

	public PagesPage selectLast90DayPeriodTimeFromPagesDropdownList() {

		selectADropdownListFromPeriodTime();
		clickOnLink(last90DaysPeriodTimeLocator);
		return this;
	}

	public String checkDropdownItemActive() {

		return returnElementFromPage(elementFromDropdownItemActiveLocator);
	}

	public PagesOverviewPage selectLinkFromPagesList() {

		clickOnLink(anElementFromPageListLocator);
		return new PagesOverviewPage(browser);
	}
	
	public PagesPage selectOrderDropdownList() {
		
		clickOnButton(orderDropdownListLocator);
		return this;
	}
	
	public PagesPage orderByViewsFromOrderDropdown() {
		
		selectOrderDropdownList();
		clickOnButton(selectViewsOptionFromOrderDropdown);
		
		return this;
	}
	
	public PagesPage changeAPerpectiveOfCursor() {
		
		clickOnButton(selectAnyRegionOnPagesLocator);
		return this;
	}

}
