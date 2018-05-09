package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageUserLogin {
    //管理员用户登录----填写用户名
    public static final By LOGIN_LINK_USER = By.id("ls_username");
    //填写密码
    public static final By LOGIN_LINK_PASSWORD = By.id("ls_password");
    //点击登陆
     public static final By LOGIN_BUTTON_USERLOGIN = By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    //点击默认板块
    public static final By LOGIN_LINK_MORENBK = By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[1]");
    // 点进帖子
    public static final By LOGIN_LINK_JINTIE = By.xpath("//*[@id=\"normalthread_14\"]/tr/th/a[2]");
    //点击删除主题
    public static final By LOGIN_LINK_SHANCHU = By.xpath("//*[@id=\"modmenu\"]/a[1]");
    //点击确定
    public static final By LOGIN_LINK_QUEDING = By.id("modsubmit");
}
