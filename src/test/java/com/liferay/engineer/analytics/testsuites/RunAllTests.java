package com.liferay.engineer.analytics.testsuites;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static com.liferay.gs.testFramework.SeleniumWaitMethods.waitMediumTime;

import org.junit.AfterClass;
import org.junit.BeforeClass;
/*
*
*@Author: Diego Furtado
*QA Consultant - Liferay Inc.
*/
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.liferay.engineer.analytics.tests.Cerebro_1135Test;

@RunWith(Suite.class)
@SuiteClasses({

		Cerebro_1135Test.class

})

public class RunAllTests {
	public static Boolean _runnedFromAllTestsSuite = false;

	@AfterClass
	public static void afterClass() throws Exception {
		_runnedFromAllTestsSuite = false;
		closeDriver();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		_runnedFromAllTestsSuite = true;
	}

	public static void closeDriver() {
		if (_runnedFromAllTestsSuite == false) {
			if (DRIVER.toString().contains("chrome")) {
				DRIVER.close();
				waitMediumTime();
				waitMediumTime();
				waitMediumTime();
				DRIVER.quit();
			} else {
				DRIVER.quit();
			}
		}
	}

}
