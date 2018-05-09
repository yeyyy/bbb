package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import util.BrowserEngine;
import util.SeleniumUtil;
import util.LogConfiguration;

import java.io.IOException;

/**
 * Created by Administrator on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver = null;
    SeleniumUtil seleniumUtil = null;
    @BeforeMethod
    public void setUp() throws IOException {
        LogConfiguration.initLog();
        BrowserEngine.initConfigData();
        seleniumUtil = new SeleniumUtil();
        driver = seleniumUtil.getDriver(BrowserEngine.browserName);
        seleniumUtil.url(BrowserEngine.serverURL);

    }

}
