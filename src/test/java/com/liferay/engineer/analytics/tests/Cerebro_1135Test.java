package com.liferay.engineer.analytics.tests;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getTimeOut;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getUrlToHome;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;
import com.liferay.engineer.analytics.pages.WebContentFromAssestsPage;
import com.liferay.engineer.analytics.utils.CommonMethods;
import com.liferay.engineer.analytics.utils.FunctionalTest;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class Cerebro_1135Test extends FunctionalTest {

	private final PagesOverviewPage pagesOverviewPage = new PagesOverviewPage();
	private final WebContentFromAssestsPage webContentFromAssestsPage = new WebContentFromAssestsPage();
	private static final PagesPage pagesPage = new PagesPage();

	@BeforeClass
	public static void setUpAll() {

		DRIVER.manage().timeouts().implicitlyWait(getTimeOut(), TimeUnit.SECONDS);
		DRIVER.get(getUrlToHome());

		new CommonMethods().shouldBeAccessTheLocalDevelopment(true);
	}

	@Before
	public void setUp() {

		CommonMethods.switchToNewWindowPage();
	}

	@After
	public void teardown() {
		DRIVER.close();
		CommonMethods.switchToNewWindowPage();
		new CommonMethods().shouldBeAccessTheLocalDevelopment(false);
	}

	/*
	 * 
	 * Scenarios: The list filter of date is propagated for all filters related to
	 * the parent list
	 */
	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByAssets() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));
	}

	@Test
	public void yesterday_isValidPeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));

	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_BySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		pagesPage.selectLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.checkDropdownItemActiveByAssets()));
	}

	/*
	 * Web Content Page are reflecting by Page Page Scenario: It is allowed changing
	 * the date filter from a child navigation
	 */

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue(
				"Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_BySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue(
				"Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast24HoursPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		
		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		CommonMethods.goToPagesPage();
		pagesPage.selectYesterdayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_BySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast7DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue(
				"Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast28DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue(
				"Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast30DaysPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByVisitorsBehavior()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsBySegments()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByLocations()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByTechnology() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue(
				"Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByViewsByTechnology()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		CommonMethods.goToPagesPage();
		pagesPage.selectLast90DayPeriodTimeFromPagesDropdownList();
		CommonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.checkDropdownItemActiveByAssetAppearsOn()));
	}

}
