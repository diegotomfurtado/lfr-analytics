package com.liferay.engineer.analytics.tests;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getTimeOut;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getUrlToHome;

import static org.junit.Assert.assertTrue;

import static com.liferay.engineer.analytics.utils.CommonMethods.shouldBeAccessTheLocalDevelopment;

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

/**
* @author Diego Furtado
*/
public class Cerebro_1135Test extends FunctionalTest {

	private final PagesOverviewPage pagesOverviewPage = new PagesOverviewPage();
	private final CommonMethods commonMethods = new CommonMethods();
	private final WebContentFromAssestsPage webContentFromAssestsPage = new WebContentFromAssestsPage();
	private static final PagesPage pagesPage = new PagesPage();

	@BeforeClass
	public static void setUpAll() {

		DRIVER.manage().timeouts().implicitlyWait(getTimeOut(), TimeUnit.SECONDS);
		DRIVER.get(getUrlToHome());

		shouldBeAccessTheLocalDevelopment(true);
	}

	@Before
	public void setUp() {

		commonMethods.switchToNewWindowPage();
	}

	@After
	public void teardown() {
		DRIVER.close();
		commonMethods.switchToNewWindowPage();
		shouldBeAccessTheLocalDevelopment(false);
	}

	/*
	 * 
	 * Scenarios: The list filter of date is propagated for all filters related to
	 * the parent list
	 */
	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByAssets() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 24 hours".contentEquals(pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void yesterday_isValidPeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Yesterday".contentEquals(pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.returnElement_ByVisitorsBehavior()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.returnElement_ByViewsBySegments()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.returnElement_ByLocations()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.returnElement_ByViewsByTechnology()));

	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 7 days".contentEquals(pagesOverviewPage.returnElement_ByAssets()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.returnElement_ByVisitorsBehavior()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.returnElement_ByLocations()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.returnElement_ByViewsByTechnology()));

	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 28 days".contentEquals(pagesOverviewPage.returnElement_ByAssets()));

	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 30 days".contentEquals(pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_BySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		pagesPage.clickOnLinkFromPagesList();

		assertTrue("Last 90 days".contentEquals(pagesOverviewPage.returnElement_ByAssets()));
	}

	/*
	 * Web Content Page are reflecting by Page Page Scenario: It is allowed changing
	 * the date filter from a child navigation
	 */

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue(
				"Last 24 hours".contentEquals(webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_BySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue(
				"Last 24 hours".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 24 hours".contentEquals(webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Yesterday".contentEquals(webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_BySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 7 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue(
				"Last 28 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 28 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue(
				"Last 30 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 30 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByTechnology() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue(
				"Last 90 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {

		commonMethods.goToPagesPage();
		pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		commonMethods.goToWebContentPage();

		assertTrue("Last 90 days".contentEquals(webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

}
