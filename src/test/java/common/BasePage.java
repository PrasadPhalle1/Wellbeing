package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;
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
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(prop.getProperty("URL"));
    }

    protected void closeDriver(){
        if(driver!= null) {
            assert driver != null;
            driver.quit();
        }
    }
}


