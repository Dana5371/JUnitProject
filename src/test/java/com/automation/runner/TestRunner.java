package com.automation.runner;

import com.automation.test.LoginTest;
import com.automation.test.SearchFunctionalityTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({LoginTest.class, SearchFunctionalityTest.class})
public class TestRunner {

}
