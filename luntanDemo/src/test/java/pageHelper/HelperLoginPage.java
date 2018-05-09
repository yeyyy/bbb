package pageHelper;

import page.PageLogin;
import util.SeleniumUtil;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger = Logger.getLogger("HelperLoginPage");
    //输入用户名
    public static void inputUsername(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_USERNAME).sendKeys("admin");
    }
    //输入密码
    public static void inputPwd(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_PWD).sendKeys("password");
    }
    //登录按钮
    public static void clickLoginBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageLogin.LOGIN_BUTTON_LOGIN).click();
    }


    //重新构造一个登陆
    public static void login(SeleniumUtil seleniumUtil,String name,String pwd) throws InterruptedException {
        inputUsername(seleniumUtil,name);
        inputPwd(seleniumUtil,pwd);
        clickLoginBtn(seleniumUtil);
        Thread.sleep(3000);

    }




}
