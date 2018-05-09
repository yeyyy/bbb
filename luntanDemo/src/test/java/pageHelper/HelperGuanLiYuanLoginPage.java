package pageHelper;

import page.PageUserLogin;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperGuanLiYuanLoginPage {
    public static void inputUser(SeleniumUtil seleniumUtil, String name){
        seleniumUtil.findElement(PageUserLogin.LOGIN_LINK_USER).sendKeys("admin");
    }
    //输入密码
    public static void inputPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.findElement(PageUserLogin.LOGIN_LINK_PASSWORD).sendKeys("password");
    }
    //登录按钮
    public static void clickLoginButton(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageUserLogin.LOGIN_BUTTON_USERLOGIN).click();
    }


    //重新构造一个登陆
    public static void userlogin(SeleniumUtil seleniumUtil,String name,String password) throws InterruptedException {
        inputUser(seleniumUtil, name);
        inputPassword(seleniumUtil, password);
        clickLoginButton(seleniumUtil);
        Thread.sleep(3000);
    }

}
