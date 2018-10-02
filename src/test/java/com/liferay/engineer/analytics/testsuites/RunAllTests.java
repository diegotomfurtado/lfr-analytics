package com.liferay.engineer.analytics.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.liferay.engineer.analytics.tests.Cerebro_1135Test;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;
import com.liferay.gs.testFramework.SeleniumWaitMethods;

/**
* @author Diego Furtado
*/

@RunWith(Suite.class)

@SuiteClasses(
	{
		Cerebro_1135Test.class
	})
public class RunAllTests {

	public static Boolean runnedFromAllTestsSuite = false;

	@AfterClass
	public static void afterClass() throws Exception {
		runnedFromAllTestsSuite = false;
		closeDriver();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		runnedFromAllTestsSuite = true;
	}

	public static void closeDriver() {
		if (!runnedFromAllTestsSuite) {
			if (SeleniumReadPropertyKeys.DRIVER.toString().contains("chrome")) {
				SeleniumReadPropertyKeys.DRIVER.close();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumReadPropertyKeys.DRIVER.quit();
			}
			else {
				SeleniumReadPropertyKeys.DRIVER.quit();
			}
		}
	}

}