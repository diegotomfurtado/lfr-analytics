package com.liferay.engineer.analytics.tests;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liferay.engineer.analytics.execptions.NoDataMatchingException;
import com.liferay.engineer.analytics.pages.AnalyticsCloudHomePage;
import com.liferay.engineer.analytics.pages.AnalyticsCloudProjectPage;
import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;
import com.liferay.engineer.analytics.pages.WebContentFromAssestsPage;
import com.liferay.engineer.analytics.utils.CommonMethods;
import com.liferay.engineer.analytics.utils.SeleniumReadProperties;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class Cerebro_1135Test {

	private final PagesPage pagesPage = new PagesPage();
	private final PagesOverviewPage pagesOverviewPage = new PagesOverviewPage();
	private final AnalyticsCloudProjectPage analyticsCloudProjectPage = new AnalyticsCloudProjectPage();
	private final WebContentFromAssestsPage webContentFromAssestsPage = new WebContentFromAssestsPage();
	private final AnalyticsCloudHomePage analyticsCloudHomePage = new AnalyticsCloudHomePage();

	@Before
	public void setUpOpenBrowser() {

		SeleniumReadProperties.ConfigFileReader();
		
		DRIVER.manage().timeouts().implicitlyWait(SeleniumReadProperties.getImplicitlyWait(), TimeUnit.SECONDS);
		DRIVER.get(SeleniumReadProperties.getApplicationUrl());
		
		new CommonMethods().shouldBeAccessTheLocalDevelopment();
	}

	@After
	public void teardown() {
		DRIVER.close();
		CommonMethods.switchToNewWindowPage();
		DRIVER.close();
	}
	
	/*
	 * 
	 * Scenarios: The list filter of date is propagated for all filters related to the parent list
	 * */
	@Test
	public void last24Hours_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
			pagesPage.selectLinkFromPagesList();
			
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
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
			pagesPage.selectLinkFromPagesList();
			
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
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
			pagesPage.selectLinkFromPagesList();
			
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
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
			pagesPage.selectLinkFromPagesList();
			
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {
			
			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());
		
		}
	}
	
	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
			pagesPage.selectLinkFromPagesList();
			
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {

			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());

		}
	}
	
	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
			pagesPage.selectLinkFromPagesList();
			
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

		} catch (Exception e) {
			
			System.out.println(pagesPage.erroMessageNoDataMatching());
			throw new NoDataMatchingException(pagesPage.erroMessageNoDataMatching());
			
		}
	}
	
	/*
	 * Web Content Page are reflecting by Page Page
	 * Scenario: It is allowed changing the date filter from a child navigation
	 * */
	
	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
			pagesPage.orderByViewsFromOrderDropdown();
			pagesPage.changeAPerpectiveOfCursor();
			pagesPage.selectLinkFromPagesList();
			pagesOverviewPage.selectLinkFromAssertCardList();
			
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
			
		} catch (Exception e) {
			
			System.out.println(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			
		}
	}
	
	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
			pagesPage.orderByViewsFromOrderDropdown();
			pagesPage.changeAPerpectiveOfCursor();
			pagesPage.selectLinkFromPagesList();
			pagesOverviewPage.selectLinkFromAssertCardList();
			
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
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
			pagesPage.orderByViewsFromOrderDropdown();
			pagesPage.changeAPerpectiveOfCursor();
			pagesPage.selectLinkFromPagesList();
			pagesOverviewPage.selectLinkFromAssertCardList();
			
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			
		}
	}
	
	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
			pagesPage.orderByViewsFromOrderDropdown();
			pagesPage.changeAPerpectiveOfCursor();
			pagesPage.selectLinkFromPagesList();
			pagesOverviewPage.selectLinkFromAssertCardList();
			
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
		
		}
	}
	
	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {

		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
			pagesPage.orderByViewsFromOrderDropdown();
			pagesPage.changeAPerpectiveOfCursor();
			pagesPage.selectLinkFromPagesList();
			pagesOverviewPage.selectLinkFromAssertCardList();
			
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {

			System.out.println(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());

		}
	}
	
	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent() throws NoDataMatchingException {
		
		try {
			
			analyticsCloudProjectPage.selectCustomerLiferayComProject();
			analyticsCloudHomePage.clickOnPagesLinkFromMenu();
			pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
			pagesPage.orderByViewsFromOrderDropdown();
			pagesPage.changeAPerpectiveOfCursor();
			pagesPage.selectLinkFromPagesList();
			pagesOverviewPage.selectLinkFromAssertCardList();
			
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
			assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));

		} catch (Exception e) {
			
			System.out.println(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			throw new NoDataMatchingException(pagesOverviewPage.erroMessageNoDataMactchingFromAssestCard());
			
		}
	}
	
}
