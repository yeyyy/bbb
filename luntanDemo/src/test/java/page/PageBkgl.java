package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/9.
 */
public class PageBkgl {
    // 进入管理
    public static final By LOGIN_LINK_BKGL = By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    //进入论坛
    public static final By LOGIN_LINK_LUNTAN = By.id("header_forum");
    //新模块
    public static final By LOGIN_LINK_XINMOK = By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    //提交
    public static final By LOGIN_LINK_TIJIAO = By.id("submit_editsubmit");
    //退出
    public static final By LOGIN_LINK_TUICHU = By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");


}
