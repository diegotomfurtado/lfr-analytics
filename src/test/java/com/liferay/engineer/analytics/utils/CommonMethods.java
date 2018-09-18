package com.liferay.engineer.analytics.utils;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.liferay.engineer.analytics.pages.AnalyticsCloudHomePage;
import com.liferay.engineer.analytics.pages.AnalyticsCloudProjectPage;
import com.liferay.engineer.analytics.pages.HomePage;
import com.liferay.engineer.analytics.pages.LoginPage;
import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class CommonMethods {

	private static WebDriverWait waitDriver = null;

	private static final PagesPage pagesPage = new PagesPage();
	private static final PagesOverviewPage pagesOverviewPage = new PagesOverviewPage();
	private static final AnalyticsCloudProjectPage analyticsCloudProjectPage = new AnalyticsCloudProjectPage();
	private static final AnalyticsCloudHomePage analyticsCloudHomePage = new AnalyticsCloudHomePage();

	public static void clickOnButton(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).click();
	}

	public static void clickOnLink(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).click();
	}

	public static String returnElementFromPage(By locator) {
		return DRIVER.findElement(locator).getText();
	}

	public static void input(By locator, String input) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).clear();
		DRIVER.findElement(locator).sendKeys(input);
	}

	public static void waitElementAppearOnScreen(By locator) {

		// Este elemento foi comentado devido a problemas para rodar multiplos testes
		getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitElementVisibilityAndBeClickable(By locator) {
		waitElementAppearOnScreen(locator);
		getWaitDriver().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static WebDriverWait getWaitDriver() {
		if (waitDriver == null) {
			waitDriver = new WebDriverWait(DRIVER, 10);
		}
		return waitDriver;
	}

	public static void switchToNewWindowPage() {
		for (String winHandle : DRIVER.getWindowHandles()) {
			DRIVER.switchTo().window(winHandle);
		}
	}

	public void shouldBeAccessTheLocalDevelopment(boolean firstLogin) {

		if (firstLogin) {
			new HomePage().localDevelopmentLink();
			performLogin();
		} else {
			new HomePage().localDevelopmentLink();
		}
	}

	private void performLogin() {

		new LoginPage().typeEmailAddressOnLoginForm();
		new LoginPage().typePasswordOnLoginForm();
		new LoginPage().clickOnSignInButton();
	}

	public static void goToPagesPage() {

		analyticsCloudProjectPage.selectCustomerLiferayComProject();
		analyticsCloudHomePage.clickOnPagesLinkFromMenu();
	}

	public static void goToWebContentPage() {

		pagesPage.orderByViewsFromOrderDropdown();
		pagesPage.changeAPerpectiveOfCursor();
		pagesPage.selectLinkFromPagesList();
		pagesOverviewPage.selectLinkFromAssertCardList();
	}

}
