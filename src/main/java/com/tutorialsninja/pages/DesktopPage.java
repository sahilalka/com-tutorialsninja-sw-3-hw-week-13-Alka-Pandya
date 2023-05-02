package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {
    // 1.1 Mouse hover on Desktops Tab.and click
    By desktopsTab = (By.linkText("Desktops"));
    // 1.2 Click on “Show All Desktops”
    By showAllDesktops = (By.linkText("Show AllDesktops"));
    // 1.3 Select Sort By position "Name: Z to A"
    By allProductsName = By.id("input-sort");
    // 1.4 Verify the Product will arrange in Descending order.
    By positionByZToA = By.id("input-sort");
    // Select Sort By position "Name: A to Z"
    By positionByAToZ = By.id("input-sort");
    // Select product “HP LP3065”
    By productHPLp3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    //  Verify the Text "HP LP3065"
    By textHPLp3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    //  Select Delivery Date "2023-11-30"
    By calender = By.xpath("//div[@class = 'input-group date']//button");
    // month and year
    By monthYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    // Year and month
    By yearMonth = (By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
    // All Days
    By day = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    // 2.7.Enter Qty "1” using Select class
    By quantity = By.name("quantity");
    //  2.8 Click on “Add to Cart” button
    By addToCart = By.xpath("//button[@id='button-cart']");
    // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    //  2.10 Click on link “shopping cart” display into success message
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    // 2.11 Verify the text "Shopping Cart"
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    // 2.12 Verify the Product name "HP LP3065"
    By productHPLp3065Text = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    // 2.13 Verify the Delivery Date "2022-11-30"
    By deliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    // 2.14 Verify the Model "Product21"
    By product21 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    //  2.15 Verify the Total "£74.73"
    By totalPriceText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public void mouseHoverOnDesktopsTabAndClick(){
        mouseHoverToElementAndClick(desktopsTab);
    }
    public void clickOnShowAllDesktops(){
        clickOnElement(showAllDesktops);
    }
    public void selectPositionByZtoA(){
        selectByVisibleTextFromDropDown(positionByZToA,"Name : ( Z to A )");
    }

    public List<WebElement> returnListOfPriceElementsLocator(){
        List<WebElement> listOfElements = driver.findElements(allProductsName);
        return listOfElements;
    }
    public void selectPositionByAtoZ() {
        selectByVisibleTextFromDropDown(positionByAToZ, "Name : ( A to Z)");
    }
      public void clickOnProductHPLp3065(){
        clickOnElement(productHPLp3065);
      }
    public String getTextHPLp3065(){
        return getTextFromElement(textHPLp3065);
    }
    public void selectDateFromCalender() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(calender);
        while (true) {
            String monthAndYear = driver.findElement(monthYear).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(yearMonth);
            }
        }
        List<WebElement> allDates = driver.findElements(day);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    } public void enterQuantity(){
        sendTextToElement(quantity,"1");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    public String getSuccessText(){
        return getTextFromElement(successMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getProductNameHPLp3065(){
        return getTextFromElement(productHPLp3065Text);
    }
    public String verifyDeliveryDate(){
        return getTextFromElement(deliveryDate);
    }
    public String verifyModelProduct21(){
        return getTextFromElement(product21);
    }
   public String verifyTotalPrice() {
        return getTextFromElement(totalPriceText);
   }




}