package com.liferay.engineer.analytics.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.liferay.engineer.analytics.execptions.NoDataMatchingException;
import com.liferay.engineer.analytics.pages.AnalyticsCloudProjectPage;
import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;
import com.liferay.engineer.analytics.pages.WebContentFromAssestsPage;
import com.liferay.engineer.analytics.utils.CommonMethods;
import com.liferay.engineer.analytics.utils.SetUp;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class Cerebro_1135Test {

	private WebDriver browser;
	PagesPage pagesPage = new PagesPage(browser);
	PagesOverviewPage pagesOverviewPage = new PagesOverviewPage(browser);
	AnalyticsCloudProjectPage analyticsCloudProjectPage = new AnalyticsCloudProjectPage(browser);
	WebContentFromAssestsPage webContentFromAssestsPage = new WebContentFromAssestsPage(browser);
	

	@Before
	public void setUpOpenBrowser() {

		browser = SetUp.setUp();
		new CommonMethods(browser).shouldBeAccessTheLocalDevelopment();
		
	}

	@After
	public void teardown() {
		browser.close();
		pagesPage.switchToNewWindowPage();
		browser.close();
	}
	
	/*
	 * 
	 * Scenarios: The list filter of date is propagated for all filters related to the parent list
	 * */
	@Test
	public void last24Hours_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast24HoursPeriodTimeFromPagesDropdownList()
			.selectLinkFromPagesList();
			
			assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));
			
		} catch (Exception e) {
			
			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());
			
		}
	}
	
	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectYesterdayPeriodTimeFromPagesDropdownList()
			.selectLinkFromPagesList();
			
			assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {
			
			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());
			
		}
	}
	
	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast7DaysPeriodTimeFromPagesDropdownList()
			.selectLinkFromPagesList();
			
			assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {
			
			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());
			
		}
	}
	
	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			new AnalyticsCloudProjectPage(browser)
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast28DaysPeriodTimeFromPagesDropdownList()
			.selectLinkFromPagesList();
			
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {
			
			System.out.println(new PagesPage(browser).erroMessageNoDataMatching());
			throw new NoDataMatchingException(new PagesPage(browser).erroMessageNoDataMatching());
		
		}
	}
	
	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			new AnalyticsCloudProjectPage(browser)
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast30DaysPeriodTimeFromPagesDropdownList()
			.selectLinkFromPagesList();
			
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {

			System.out.println(new PagesPage(browser).erroMessageNoDataMatching());
			throw new NoDataMatchingException(new PagesPage(browser).erroMessageNoDataMatching());

		}
	}
	
	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			new AnalyticsCloudProjectPage(browser)
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast90DayPeriodTimeFromPagesDropdownList()
			.selectLinkFromPagesList();
			
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {
			
			System.out.println(new PagesPage(browser).erroMessageNoDataMatching());
			throw new NoDataMatchingException(new PagesPage(browser).erroMessageNoDataMatching());
			
		}
	}
	
	/*
	 * Web Content Page are reflecting by Page Page
	 * Scenario: It is allowed changing the date filter from a child navigation
	 * */
	
	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast24HoursPeriodTimeFromPagesDropdownList()
			.orderByViewsFromOrderDropdown()
			.changeAPerpectiveOfCursor()
			.selectLinkFromPagesList()
			.selectLinkFromAssertCardList();
			
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
			
		} catch (Exception e) {
			
			System.out.println(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			
		}
	}
	
	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectYesterdayPeriodTimeFromPagesDropdownList()
			.orderByViewsFromOrderDropdown()
			.changeAPerpectiveOfCursor()
			.selectLinkFromPagesList()
			.selectLinkFromAssertCardList();
			
			assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());
			
		}
	}
	
	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast7DaysPeriodTimeFromPagesDropdownList()
			.orderByViewsFromOrderDropdown()
			.changeAPerpectiveOfCursor()
			.selectLinkFromPagesList()
			.selectLinkFromAssertCardList();
			
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			
		}
	}
	
	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			new AnalyticsCloudProjectPage(browser)
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast28DaysPeriodTimeFromPagesDropdownList()
			.orderByViewsFromOrderDropdown()
			.changeAPerpectiveOfCursor()
			.selectLinkFromPagesList()
			.selectLinkFromAssertCardList();
			
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
		
		}
	}
	
	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			new AnalyticsCloudProjectPage(browser)
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast30DaysPeriodTimeFromPagesDropdownList()
			.orderByViewsFromOrderDropdown()
			.changeAPerpectiveOfCursor()
			.selectLinkFromPagesList()
			.selectLinkFromAssertCardList();
			
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {

			System.out.println(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());

		}
	}
	
	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {
		
		try {
			
			new AnalyticsCloudProjectPage(browser)
			.selectCustomerLiferayComProject()
			.clickOnPagesLinkFromMenu()
			.selectLast90DayPeriodTimeFromPagesDropdownList()
			.orderByViewsFromOrderDropdown()
			.changeAPerpectiveOfCursor()
			.selectLinkFromPagesList()
			.selectLinkFromAssertCardList();
			
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(new PagesOverviewPage(browser).erroMessageNoDataMactchingFromAssestCard());
			
		}
	}
	
	/*
	 * Scenario: Date filter of children propagated from their parent won't be lost when using the list pagination
	 * */
	
	
}
