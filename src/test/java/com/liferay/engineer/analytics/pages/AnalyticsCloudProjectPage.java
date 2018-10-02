package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import com.liferay.engineer.analytics.utils.CommonMethods;

import org.openqa.selenium.By;

/**
* @author Diego Furtado
*/
public class AnalyticsCloudProjectPage {

	public void clickOnCustomerLiferayComProject() {
		_commonMethods.clickOnLink(_customerLiferayLocator);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _customerLiferayLocator = xpath(
		".//a[text() = \'customer.liferay.com\']");

}