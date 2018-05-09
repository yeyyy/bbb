package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageWrite {
    //点击默认板块
    public static final By LOGIN_LINK_MRBK= By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[1]");
    //填写标题
    public static final By LOGIN_LINK_TITLE = By.id("subject");
    //填写内容
    public static final By LOGIN_LINK_NEIRONG = By.id("fastpostmessage");
    //点击发帖
    public static final By LOGIN_LINK_FATIE = By.id("fastpostsubmit");
    //点击回帖
    public static final By LOGIN_LINK_HUITIE = By.id("fastpostmessage");
    //点击发表回复
    public static final By LOGIN_LINK_FBHUIFU = By.id("fastpostsubmit");
    //点击退出
    public static final By LOGIN_LINK_TUICHU = By.xpath("//*[@id=\"um\"]/p[1]/a[7]");
}
