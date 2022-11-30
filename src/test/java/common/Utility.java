package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.WildcardType;
import java.time.Duration;

public class Utility extends BasePage{
//    public static WebDriverWait wait = new WebDriverWait(driver, 20);
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void waitForElementVisible(WebElement webElem){
        try{
            wait.until(ExpectedConditions.visibilityOf(webElem));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void clickElement(WebElement element){
        try{
            element.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }

//    public static void scrollUsingJavaScriptExecutor(WebElement element){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
//    }

    public static void scrollUpTo(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public static void pressTab(WebElement element){
        element.sendKeys(Keys.TAB);
    }

    public static void pressEnterKay(WebElement element){
        element.sendKeys(Keys.ENTER);
    }

    public static void pressEscape(WebElement element){
        element.sendKeys(Keys.ESCAPE);
    }

    public static void refreshWebPage(){
        ((JavascriptExecutor)driver).executeScript("history.go(0)");
    }

//    public static void openNewTab(){
//        driver.switchTo().newWindow(WildcardType.TAB);
//    }

    public static void pressEnter() throws AWTException {
        Robot enter = new Robot();
        enter.keyPress(KeyEvent.VK_ENTER);
        enter.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void selectAllText() throws AWTException {
        Robot all = new Robot();
        all.keyPress(KeyEvent.VK_CONTROL);
        all.keyPress(KeyEvent.VK_A);
        all.keyRelease(KeyEvent.VK_CONTROL);
        all.keyRelease(KeyEvent.VK_A);
    }

    public static void copyText() throws AWTException {
        Robot copy = new Robot();
        copy.keyPress(KeyEvent.VK_CONTROL);
        copy.keyPress(KeyEvent.VK_C);
        copy.keyRelease(KeyEvent.VK_CONTROL);
        copy.keyRelease(KeyEvent.VK_C);
    }

    public static void pasteText() throws AWTException{
        Robot paste = new Robot();
        paste.keyPress(KeyEvent.VK_CONTROL);
        paste.keyPress(KeyEvent.VK_V);
        paste.keyRelease(KeyEvent.VK_CONTROL);
        paste.keyRelease(KeyEvent.VK_V);
    }

    public static void cutText() throws AWTException {
        Robot cut = new Robot();
        cut.keyPress(KeyEvent.VK_CONTROL);
        cut.keyPress(KeyEvent.VK_X);
        cut.keyRelease(KeyEvent.VK_CONTROL);
        cut.keyRelease(KeyEvent.VK_X);
    }

    public static void deleteText() throws AWTException{
        Robot delete = new Robot();
        delete.keyPress(KeyEvent.VK_DELETE);
        delete.keyRelease(KeyEvent.VK_DELETE);
    }

    public static void pressTAB() throws AWTException {
        Robot tab = new Robot();
        tab.keyPress(KeyEvent.VK_TAB);
        tab.keyRelease(KeyEvent.VK_TAB);
    }

    public static void waitForElementClickable(WebElement webElem){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(webElem));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void moveTOElement(WebElement webElem){
        try{
            Actions actions = new Actions(driver);
            actions.moveToElement(webElem, 0, -1 ).build().perform();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
