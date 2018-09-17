package com.liferay.engineer.analytics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;

import com.liferay.engineer.analytics.pages.HomePage;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class CommonMethods {

	public static WebDriver browser;
	private WebDriverWait waitDriver = null;

	public CommonMethods(WebDriver browser) {
		CommonMethods.browser = browser;
		// TODO Auto-generated constructor stub
	}

	public void clickOnButton(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		DRIVER.findElement(locator).click();
	}

	public void clickOnLink(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		browser.findElement(locator).click();
	}

	public String returnElementFromPage(By locator) {
		return browser.findElement(locator).getText();
	}

	public CommonMethods input(By locator, String input) {
		waitElementVisibilityAndBeClickable(locator);
		browser.findElement(locator).clear();
		browser.findElement(locator).sendKeys(input);
		return this;
	}

	public void waitElementAppearOnScreen(By locator) {
		
		//Este elemento foi comentado devido a problemas para rodar multiplos testes
		//getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitElementVisibilityAndBeClickable(By locator) {
		waitElementAppearOnScreen(locator);
		getWaitDriver().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebDriverWait getWaitDriver() {
		if (waitDriver == null) {
			waitDriver = new WebDriverWait(browser, 10);
		}
		return waitDriver;
	}

	public void switchToNewWindowPage() {
		for (String winHandle : browser.getWindowHandles()) {
			browser.switchTo().window(winHandle);
		}
	}
	
	public void shouldBeAccessTheLocalDevelopment() {

		new HomePage(browser)
			.localDevelopmentLink()
			.typeEmailAddressOnLoginForm()
			.typePasswordOnLoginForm()
			.clickOnSignInButton();
	}

}
