package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.lang.reflect.WildcardType;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static Properties prop;

    public BasePage() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties");
            prop.load(fis);
        } catch (Exception e) {
        }
    }

    public static void initialize() {
        String browser = prop.getProperty("browser");
        System.out.println("Browser is: " + browser);
        if (browser.equals("chrome")) {
//            ChromeOptions option = new ChromeOptions();
//            option.addArguments("--disable-notifications");
            System.setProperty("webdriver.chrome.whitelistedIps", "");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();

        }
//        else if (browser.equals("firefox")) {
////                System.setProperty("webdriver.gecko.driver","D:\\Prasad-SWQA\\SWQA_Wellbeing\\src\\test\\resources\\driver\\geckodriver.exe");
////                driver = new FirefoxDriver();
//        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        pageLoadWait();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get(prop.getProperty("URL"));
    }

    public void loadUrl(String url) {
        driver.get(url);
//        log.info("Loading URL " + url);
    }

    public static void pageLoadWait(){
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public void openNewTab(){
//        driver.get("http://test.wellbeingapp.in/#");
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public void openNewWindow(){
//        driver.get("http://test.wellbeingapp.in/#");
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public Set<String> getWindows() {
        return driver.getWindowHandles();
    }

    public String getCurrentWindow() {
        return driver.getWindowHandle();
    }

    public void switchToWindow(String windowId) {
        driver.switchTo().window(windowId);
    }

    public void closeCurrentWindow(String windowId) {
        driver.switchTo().window(windowId);
        driver.close();
        for (String w : getWindows()) {
            if (!w.equals(windowId)) {
                switchToWindow(w);
//                log.info("Switched to Base Page");
                break;
            }
        }
    }

    protected void closeDriver(){
        if(driver!= null) {
            assert driver != null;
            driver.quit();
        }
    }
}


