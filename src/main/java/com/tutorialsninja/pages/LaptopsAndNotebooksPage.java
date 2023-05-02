package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {
    // 1.1 Mouse hover on Laptops & Notebooks Tab.and click
    By LaptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");
    //1.2 Click on “Show AllLaptops & Notebooks”
    By showAllLaptopsAndNotebooks = By.linkText("Show AllLaptops & Notebooks");
     // 1.3 Select Sort By "Price (High > Low)"
    By priceHighToLow = By.id("input-sort");
     // 1.4 Verify the Product price will arrange in High to Low order.
    By productPrice = By.xpath("//p[@class ='price']");
    // 2.4 Select Product “MacBook”
    By productMacbook = By.linkText("MacBook");
    // 2.5 Verify the text “MacBook”
    By textMacBook = By.xpath("//h1[contains(text(),'MacBook')]");
    // 2.6 Click on ‘Add To Cart’ button
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    // 2.8 Click on link “shopping cart” display into success message
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    // 2.9 Verify the text "Shopping Cart"
    By textShoppingCart = By.xpath("//div[@id='content']//h1");
    // 2.10 Verify the Product name "MacBook"
    By nameMacbook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    // 2.11 Change Quantity "2"
    By quantity2 = By.xpath("//input[contains(@name, 'quantity')]");
    // 2.12 Click on “Update” Tab
    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    // 2.13 Verify the message “Success: You have modified your shopping cart!”
    By textMessage = By.xpath("//div[@id='checkout-cart']/div[1]");
    // 2.14 Verify the Total £737.45
    By totalPrice = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    // 2.15 Click on “Checkout” button
    By checkoutButton = By.xpath("//h1[normalize-space()='Checkout']");
    // 2.16 Verify the text “Checkout”
    By textCheckout = By.xpath("//h1[normalize-space()='Checkout']");
    // 2.17 Verify the Text “New Customer”
    By textNewCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    // 2.18 Click on “Guest Checkout” radio button
    By guestCheckout = By.xpath("//input[@value='guest']");
    // 2.19 Click on “Continue” tab
    By continueTab = By.xpath("//input[@id='button-account']");
    // 2.20 Fill the mandatory fields
    By firstNameField  = By.name("firstname");
    By lastNameField = By.name("lastname");
    By emailField = By.id("input-payment-email");
    By telephoneField = By.name("telephone");
    By addressField = By.name("address_1");
    By cityField = By.id("input-payment-city");
    By postcodeField = By.name("postcode");
    By countryField = By.id("input-payment-country");
    By regionField = By.name("zone_id");
    // 2.21 Click on “Continue” Button
    By continueButton = By.xpath("//input[@id='button-payment-method']");
    // 2.22 Add Comments About your order into text area
    By addComments = By.xpath("//textarea[@name='comment']");
    // 2.23 Check the Terms & Conditions check box
    By termsAndConditions = By.xpath("//input[@name='agree']");
    // 2.24 Click on “Continue” button
    By clickButton = By.xpath("//input[@id='button-payment-method']");
    // 2.25 Verify the message “Warning: Payment method required!”
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void mouseHoverOnLaptopsAndNotebooksTabAndClick(){
        mouseHoverToElementAndClick(LaptopsAndNotebooksTab);
    }
     public void clickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNotebooks);
     }
    public void selectSortByHighToLow(){
        selectByVisibleTextFromDropDown(priceHighToLow,"(High > Low)");
    }
   public void verifyTheProductPrice(){
        clickOnElement(productPrice);
    }
   public void clickOnMacbook(){
        clickOnElement(productMacbook);
   }
   public String getText(){
        return getTextFromElement(textMacBook);
   }
   public void  addToCartButton(){
        clickOnElement(addToCartButton);
   }
  public String getSuccessText(){
        return getTextFromElement(successMessage);
}
   public void clickOnLink(){
        clickOnElement(shoppingCartLink);
 }
  public String verifyTextShoppingCart(){
        return getTextFromElement(textShoppingCart);
  }
   public String VerifyProductNameMacBook(){
        return getTextFromElement(nameMacbook);
   }
   public void changeQuantity(){
        clearValueFromTextBox(quantity2);
        sendTextToElement(quantity2,"2");
   }
   public void clickOnUpdateTab(){
        clickOnElement(updateTab);
   }
   public String verifyModifiedYourShoppingCart() {
       return getTextFromElement(textMessage);
   }
   public String verifyTotalPrice(){
        return getTextFromElement(totalPrice);
   }
   public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
   }
   public String verifyTheTextCheckout(){
        return getTextFromElement(textCheckout);
   }
   public String verifyTheTextNewCustomer(){
        return getTextFromElement(textNewCustomer);
   }
  public void clickOnGuestCheckoutRadioButton(){
        clickOnElement(guestCheckout);
  }
   public void clickOnContinueTab(){
        clickOnElement(continueTab);
   }
   public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
   }
   public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
   }
   public void enterEmail(String email){
        sendTextToElement(emailField,email);
   }
   public void enterTelephone(String telephone){
        sendTextToElement(telephoneField,telephone);
   }
   public void enterAddress(String address){
        sendTextToElement(addressField,address);
   }
   public void enterCity(String city){
        sendTextToElement(cityField,city);
   }
   public void enterPostcode(String postcode){
        sendTextToElement(postcodeField,postcode);
   }
   public void enterCountry(String country){
        sendTextToElement(countryField,country);
   }
   public void enterRegion(String region){
        sendTextToElement(regionField,region);
   }
   public void clickOnContinueButton(){
        clickOnElement(continueButton);
   }
   public void addCommentsAboutYourOrder(String comment){
         sendTextToElement(addComments,comment);
   }
   public void clickOnTermsAndConditionsCheckBox(){
        clickOnElement(termsAndConditions);
   }
   public void clickOnContinueButton1(){
        clickOnElement(clickButton);
   }
   public String verifyTheWarningMessage(){
        return getTextFromElement(warningMessage);
   }


}











