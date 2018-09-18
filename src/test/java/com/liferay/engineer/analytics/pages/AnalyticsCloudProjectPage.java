package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class AnalyticsCloudProjectPage {

	CommonMethods commonMethods = new CommonMethods();

	private static final By customerLiferayLocator = xpath(".//a[text() = \'customer.liferay.com\']");

	public void clickOnCustomerLiferayComProject() {

		commonMethods.clickOnLink(customerLiferayLocator);
	}

}
