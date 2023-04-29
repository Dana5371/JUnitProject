package com.automation.test;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void setUp(){
        System.out.println("opening Browser");
    }
    @After
    public void cleanUp(){
        System.out.println("close browser");
    }
}
