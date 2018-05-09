package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageHelper.*;

/**
 * Created by Administrator on 2018/5/7.
 */
public class LoginPage_Login extends BasicTestCase{
    @Test
    public void login() throws InterruptedException {

        HelperLoginPage.login(seleniumUtil,"admin","password");
        HelperFatiePage.fatie(seleniumUtil,"123","345678789");
        HelperHuiTiePage.huitie(seleniumUtil,"哈哈哈");
        HelperTuiChuPage.tuichu(seleniumUtil);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
