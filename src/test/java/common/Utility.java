package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends BasePage{
    public static WebDriverWait wait = new WebDriverWait(driver, 20);

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

    public static void pressEscape(WebElement element){
        element.sendKeys(Keys.ESCAPE);
    }

    public static void refreshWebPage(){
        ((JavascriptExecutor)driver).executeScript("history.go(0)");
    }
}
