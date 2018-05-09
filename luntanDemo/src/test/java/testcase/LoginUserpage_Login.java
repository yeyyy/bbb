package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperGuanLiYuanLoginPage;
import pageHelper.HelperShanChuPage;
import pageHelper.HelperXinBKPage;

/**
 * Created by Administrator on 2018/5/8.
 */
public class LoginUserpage_Login extends BasicTestCase{
    @Test
    public void login() throws InterruptedException {
        HelperGuanLiYuanLoginPage.userlogin(seleniumUtil, "admin", "password");
        HelperShanChuPage.shanchu(seleniumUtil);
        HelperXinBKPage.bankuan(seleniumUtil);
    }


//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}
