package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopTest extends BaseTest {

    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        desktopPage.mouseHoverOnDesktopsTabAndClick();
        desktopPage.clickOnShowAllDesktops();
        desktopPage.selectPositionByZtoA();
        // 1.4 Verify the Product will arrange in Descending order.
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(desktopPage.returnListOfPriceElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(desktopPage.returnListOfPriceElementsLocator());
        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message : Products are not displayed in descending order");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        desktopPage.selectPositionByAtoZ();
        desktopPage.clickOnProductHPLp3065();

        //2.5 Verify the Text "HP LP3065"
        String expectedText1 = "HP LP3065";
        String actualText1 = desktopPage.getTextHPLp3065();
        Assert.assertEquals(actualText1,expectedText1,"Error message");
        desktopPage.selectDateFromCalender();
        desktopPage.enterQuantity();
        desktopPage.clickOnAddToCartButton();

        // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String actualMessage = desktopPage.getSuccessText();
        Assert.assertEquals(expectedMessage,actualMessage,"Error message");
        desktopPage.clickOnShoppingCart();

        // 2.11 Verify the text "Shopping Cart"
        String expectedText = "Shopping Cart";
        String actualText = desktopPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage,actualMessage,"Error message");

        //  2.12 Verify the Product name "HP LP3065"
        String expectedProduct = "HP LP3065";
        String actualProduct = desktopPage.getProductNameHPLp3065();
        Assert.assertEquals(expectedProduct,actualProduct,"Error message");

        // 2.13 Verify the Delivery Date "2022-11-30"
        String expectedDate = "2022-11-30";
        String actualDate = desktopPage.verifyDeliveryDate();
        Assert.assertEquals(expectedDate,actualDate,"error message");

        //2.14 Verify the Model "Product21"
        String expectedProduct1 = "Product21";
        String actualProduct1 = desktopPage.verifyModelProduct21();
        Assert.assertEquals(expectedProduct1,actualProduct1,"Error message");

        //2.15 Verify the Total "£74.73"
        String expectedPrice = "£74.73";
        String actualPrice = desktopPage.verifyTotalPrice();
        Assert.assertEquals(expectedPrice,actualPrice,"Error message");

    }






}
