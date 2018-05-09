package util;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/5/8.
 */
public class BrowserEngine {

    public static String browserName;
    public static String serverURL;
    public WebDriver driver;

    public static void initConfigData() throws IOException {
        Properties p = new Properties();
        InputStream ips = new FileInputStream(".\\Config.properties");
        p.load(ips);

        browserName = p.getProperty("browserName");
        serverURL = p.getProperty("URL");

        ips.close();


    }
    static {
        try {
            BrowserEngine.initConfigData();

            }catch (IOException e){
                e.printStackTrace();
            }


        }



    private void callWait(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }


    public static void main(String[]args){
        System.out.println(BrowserEngine.browserName);
    }


}
