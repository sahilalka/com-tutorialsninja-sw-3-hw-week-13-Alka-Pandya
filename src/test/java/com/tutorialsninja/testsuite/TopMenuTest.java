package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();
  @Test
  public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

      topMenuPage.mouseHoverOnDesktopsLinkAndClick();
//      topMenuPage.selectMenu(Show AllDesktops);
      // 1.3 Verify the text ‘Desktops’
      String expectedText = "Desktops";
      String actualText = topMenuPage.getDesktopText();
      Assert.assertEquals(expectedText, actualText, "Error message");
  }
@Test
  public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
      topMenuPage.mouseHoverOnLaptopsAndBooksLinkAndClick();
//      topMenuPage.selectMenu();
      //2.3 Verify the text ‘Laptops & Notebooks’
      String expectedText1 = "Laptops & Notebooks";
      String actualText1 = topMenuPage.getLaptopsAndNotebooksText();
      Assert.assertEquals(expectedText1, actualText1, "Error message");
  }
  @Test
     public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
      topMenuPage.mouseHoverOnComponentsAndClick();
//      topMenuPage.selectMenu();
      // 3.3 Verify the text ‘Components’
      String expectedText2= "Components";
      String actualText2 = topMenuPage.getComponentsText();
      Assert.assertEquals(expectedText2,actualText2,"Error message");


  }
}
