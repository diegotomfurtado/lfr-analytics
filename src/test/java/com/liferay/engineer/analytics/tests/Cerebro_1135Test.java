package com.liferay.engineer.analytics.tests;

import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;
import com.liferay.engineer.analytics.pages.WebContentFromAssestsPage;
import com.liferay.engineer.analytics.utils.CommonMethods;
import com.liferay.engineer.analytics.utils.FunctionalTest;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
* @author Diego Furtado
*/
public class Cerebro_1135Test extends FunctionalTest {

	@BeforeClass
	public static void setUpAll() {
		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(), TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(
			SeleniumReadPropertyKeys.getUrlToHome());

		CommonMethods.shouldBeAccessTheLocalDevelopment(true);
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void last7Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_BySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last7Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 7 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByAssets() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	/**
	 *
	 * Scenarios: The list filter of date is propagated for all filters related to
	 * the parent list
	 */
	@Test
	public void last24Hours_isValidPeriodTimeOnPagesToReflectOnChildrenPages_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_BySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	/**
	 * Web Content Page are reflecting by Page Page Scenario: It is allowed changing
	 * the date filter from a child navigation
	 */
	@Test
	public void last24Hours_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last24Hours_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 24 hours".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last28Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last28Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last28Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 28 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void last30Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last30Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last30Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 30 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_BySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void last90Days_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void last90Days_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Last90Days_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Last 90 days".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	@Before
	public void setUp() {
		_commonMethods.switchToNewWindowPage();
	}

	@After
	public void teardown() {
		SeleniumReadPropertyKeys.DRIVER.close();
		_commonMethods.switchToNewWindowPage();
		CommonMethods.shouldBeAccessTheLocalDevelopment(false);
	}

	@Test
	public void yesterday_isValidPeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Yesterday".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByAssets() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Yesterday".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Yesterday".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Yesterday".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Test
	public void yesterday_PeriodTimeOnPagesMustToReflectAtTheChildrenPages_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_pagesPage.clickOnLinkFromPagesList();

		Assert.assertTrue(
			"Yesterday".contentEquals(_pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByAssetAppearsOn() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Yesterday".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByAssetAppearsOn()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByLocations() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Yesterday".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByLocations()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsBySegments() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Yesterday".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsBySegments()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByViewsByTechnology() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Yesterday".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByViewsByTechnology()));
	}

	@Test
	public void yesterday_periodTimeOnWebContentPageMustToReflectFromPageParent_ByVisitorsBehavior() {
		_commonMethods.goToPagesPage();
		_pagesPage.clickOnDropdownList_Yesterday_PagesPage();
		_commonMethods.goToWebContentPage();

		Assert.assertTrue(
			"Yesterday".contentEquals(_webContentFromAssestsPage.returnElement_ActiveByVisitorsBehavior()));
	}

	private static final PagesPage _pagesPage = new PagesPage();

	private final CommonMethods _commonMethods = new CommonMethods();
	private final PagesOverviewPage _pagesOverviewPage =
		new PagesOverviewPage();
	private final WebContentFromAssestsPage _webContentFromAssestsPage =
		new WebContentFromAssestsPage();

}