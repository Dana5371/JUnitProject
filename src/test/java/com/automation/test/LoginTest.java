package com.automation.test;

import com.automation.categories.RegressionTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest extends  BaseTest{
    @Category(RegressionTest.class)
    @Test
    public  void verifyUserCanLogin(){
        System.out.println("verify login successful");
    }
    @Test
    public  void verifyUserCanNotWithInvalidCredetionalsLogin(){
        System.out.println("verify login unsuccessful");
    }
    @Test
    public  void verifyUserCanResetLogin(){
        System.out.println("verify login can reset successful");
    }

}
