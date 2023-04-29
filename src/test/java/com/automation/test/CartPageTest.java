package com.automation.test;

import com.automation.categories.SmokeTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CartPageTest extends BaseTest {
    @Category(SmokeTest.class)
    @Test
    public void verifyUserCanAddProductToCart() {
        System.out.println("verify user can add item");
    }

    @Test
    public void verifyUserCanRemoveItemFromCart() {
        System.out.println("verify user can remove item from cart");
    }

    @Test
    public void verifyUserCanChangeQuantityOfItem() {
        System.out.println("verify user can change quantity of item");
    }
}
