package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
     //1.1 Mouse hover on “Desktops” Tab and click
    By topMenu =  By.linkText("Desktops");
    //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
    By desktopLink = By.xpath("//h2[contains(text(),'Desktops')]");
    // 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    By laptopsAndNotebooksLink = By.linkText("Laptops & Notebooks");
    // 3.1 Mouse hover on “Components” Tab and click
    By componentsLinks = By.linkText("Components");
    //1.3 Verify the text ‘Desktops’
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')])");
    // 2.3 Verify the text ‘Laptops & Notebooks’
    By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]))");
    //3.3 Verify the text ‘Components’
    By componentsText = By.xpath("//h2[contains(text(),'Components')]))");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenu);
        }
    }
 public void mouseHoverOnDesktopsLinkAndClick(){
        mouseHoverToElementAndClick(desktopLink);
 }
 public void mouseHoverOnLaptopsAndBooksLinkAndClick(){
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
 }
 public void mouseHoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(componentsLinks);
 }
  public String getDesktopText(){
        return getTextFromElement(desktopText);
  }
  public String getLaptopsAndNotebooksText(){
        return getTextFromElement(laptopsAndNotebooksText);
  }
 public String getComponentsText(){
        return getTextFromElement(componentsText);

 }


}
