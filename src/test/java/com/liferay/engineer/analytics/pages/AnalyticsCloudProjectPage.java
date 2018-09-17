package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
public class AnalyticsCloudProjectPage extends CommonMethods {

	private static final By customerLiferayLocator = xpath(".//a[text() = \'customer.liferay.com\']");

	public void selectCustomerLiferayComProject() {

		clickOnLink(customerLiferayLocator);
	}

}
