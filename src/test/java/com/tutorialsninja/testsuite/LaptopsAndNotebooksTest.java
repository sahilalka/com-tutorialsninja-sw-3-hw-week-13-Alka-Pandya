package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
  @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
      // 2.1 Mouse hover on Laptops & Notebooks Tab and click
     laptopsAndNotebooksPage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
     // 2.2 Click on “Show All Laptops & Notebooks”
      laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();
      // 2.3 Select Sort By "Price (High > Low)"
      laptopsAndNotebooksPage.selectSortByHighToLow();
      // 2.4 Select Product “MacBook”
      laptopsAndNotebooksPage.clickOnMacbook();
      // 2.5 Verify the text “MacBook”
      String expectedText = "MacBook";
      String actualText = laptopsAndNotebooksPage.getText();
      Assert.assertEquals(expectedText,actualText,"Error message displayed");
      // 2.6 Click on ‘Add To Cart’ button
      laptopsAndNotebooksPage.addToCartButton();
      // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
      String expectedMessage = "Success: You have added MacBook to your shopping cart!";
      String actualMessage = laptopsAndNotebooksPage.getSuccessText();
      boolean message = actualMessage.contains(expectedMessage);
      // 2.8 Click on link “shopping cart” display into success message
      laptopsAndNotebooksPage.clickOnLink();
      // 2.9 Verify the text "Shopping Cart"
      String expectedText1 = "Shopping Cart";
      String actualText1 = laptopsAndNotebooksPage.verifyTextShoppingCart();
      Assert.assertEquals(expectedText1,actualText1,"Error message displayed");
      // 2.10 Verify the Product name "MacBook"
      String expectedProduct = "MacBook";
      String actualProduct = laptopsAndNotebooksPage.VerifyProductNameMacBook();
      Assert.assertEquals(expectedProduct,actualProduct,"Error message displayed");
      // 2.11 Change Quantity "2"
      laptopsAndNotebooksPage.changeQuantity();
      // 2.12 Click on “Update” Tab
      laptopsAndNotebooksPage.clickOnUpdateTab();
      // 2.13 Verify the message “Success: You have modified your shopping cart!”
      String expectedMessage1 = "Success: You have modified your shopping cart!";
      String actualMessage1 = laptopsAndNotebooksPage.verifyModifiedYourShoppingCart();
      boolean message1 = actualMessage1.contains(expectedMessage1);
      // 2.14 Verify the Total £737.45
      String expectedTotal = "$1,204.00";
      String actualTotal = laptopsAndNotebooksPage.verifyTotalPrice();
      Assert.assertEquals(expectedTotal,actualTotal,"Price not match");
      // 2.15 Click on “Checkout” button
      laptopsAndNotebooksPage.clickOnCheckoutButton();
      // 2.16 Verify the text “Checkout”
      String expectedText2 = "Checkout";
      String actualText2 = laptopsAndNotebooksPage.verifyTheTextCheckout();
      Assert.assertEquals(expectedText2,actualText2, "Error message displayed");
      // 2.17 Verify the Text “New Customer”
      String expectedText3 = "New Customer";
      String actualText3 = laptopsAndNotebooksPage.verifyTheTextNewCustomer();
      Assert.assertEquals(expectedText3,actualText3,"Error message is displayed");
      // 2.18 Click on “Guest Checkout” radio button
      laptopsAndNotebooksPage.clickOnGuestCheckoutRadioButton();
      // 2.19 Click on “Continue” tab
       laptopsAndNotebooksPage.clickOnContinueTab();
      // 2.20 Fill the mandatory fields
       laptopsAndNotebooksPage.enterFirstName("Sofia");
       laptopsAndNotebooksPage.enterLastName("Smith");
       laptopsAndNotebooksPage.enterEmail("sofia123@gmail.com");
       laptopsAndNotebooksPage.enterTelephone("07896541237");
       laptopsAndNotebooksPage.enterAddress("102, Sandy Lane");
       laptopsAndNotebooksPage.enterCity("London");
       laptopsAndNotebooksPage.enterPostcode("sg2 9py");
       laptopsAndNotebooksPage.enterCountry("United Kingdom");
       laptopsAndNotebooksPage.enterRegion("Devon");
       // 2.21 Click on “Continue” Button
       laptopsAndNotebooksPage.clickOnContinueButton();
       // 2.22 Add Comments About your order into text area
       laptopsAndNotebooksPage.addCommentsAboutYourOrder("All is Well");
       // 2.23 Check the Terms & Conditions check box
       laptopsAndNotebooksPage.clickOnTermsAndConditionsCheckBox();
       // 2.24 Click on “Continue” button
       laptopsAndNotebooksPage.clickOnContinueButton1();
       // 2.25 Verify the message “Warning: Payment method required!”
       String expectedMessage2 = "Warning: Payment method required!";
       String actualMessage2 = laptopsAndNotebooksPage.verifyTheWarningMessage();
       boolean message2 = actualMessage2.contains(expectedMessage2);
       Assert.assertTrue(message2);


  }


















}
