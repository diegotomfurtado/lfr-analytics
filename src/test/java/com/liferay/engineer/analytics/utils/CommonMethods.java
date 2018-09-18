package com.liferay.engineer.analytics.utils;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static com.liferay.gs.testFramework.SeleniumWaitMethods.getWaitDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liferay.engineer.analytics.pages.AnalyticsCloudHomePage;
import com.liferay.engineer.analytics.pages.AnalyticsCloudProjectPage;
import com.liferay.engineer.analytics.pages.HomePage;
import com.liferay.engineer.analytics.pages.LoginPage;
import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;

/**
 * @author Diego Furtado
 */
public class CommonMethods {

	private static final PagesPage pagesPage = new PagesPage();
	private static final HomePage homePage = new HomePage();
	private static final LoginPage loginPage = new LoginPage();
	private static final PagesOverviewPage pagesOverviewPage = new PagesOverviewPage();
	private static final AnalyticsCloudProjectPage analyticsCloudProjectPage = new AnalyticsCloudProjectPage();
	private static final AnalyticsCloudHomePage analyticsCloudHomePage = new AnalyticsCloudHomePage();

	public void clickOnButton(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).click();
	}

	public void clickOnLink(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).click();
	}

	public String returnElementFromPage(By locator) {
		return DRIVER.findElement(locator).getText();
	}

	public void input(By locator, String input) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).clear();
		DRIVER.findElement(locator).sendKeys(input);
	}

	public void waitElementAppearOnScreen(By locator) {

		getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitElementVisibilityAndBeClickable(By locator) {
		waitElementAppearOnScreen(locator);
		getWaitDriver().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void switchToNewWindowPage() {
		for (String winHandle : DRIVER.getWindowHandles()) {
			DRIVER.switchTo().window(winHandle);
		}
	}

	public static void shouldBeAccessTheLocalDevelopment(boolean firstLogin) {

		if (firstLogin) {
			homePage.clickOnLocalDevelopmentLink();
			performLogin();
		} else {
			homePage.clickOnLocalDevelopmentLink();
		}
	}

	private static void performLogin() {

		loginPage.typeEmailAddressOnLoginForm();
		loginPage.typePasswordOnLoginForm();
		loginPage.clickOnSignInButton();
	}

	public void goToPagesPage() {

		analyticsCloudProjectPage.clickOnCustomerLiferayComProject();
		analyticsCloudHomePage.clickOnPagesLinkFromMenu();
	}

	public void goToWebContentPage() {

		pagesPage.clickOnOrderByViews_DropdownList();
		pagesPage.clickOutToChangeAPerpectiveOfCursor();
		pagesPage.clickOnLinkFromPagesList();
		pagesOverviewPage.clickOnLinkFromAssertCardList();
	}

}
