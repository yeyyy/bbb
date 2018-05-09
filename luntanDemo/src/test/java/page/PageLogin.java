package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/7.
 */
public class PageLogin {
    //填写用户名
    public static final By LOGIN_LINK_USERNAME = By.id("ls_username");
    //填写密码
    public static final By LOGIN_LINK_PWD = By.id("ls_password");
    //点击登陆
    public static final By LOGIN_BUTTON_LOGIN = By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    //注册
    public static final By LOGIN_LINK_ZHUCE = By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[4]/a");








}
