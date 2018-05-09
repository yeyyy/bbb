package pageHelper;

import page.PageWrite;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperFatiePage {
    //点击默认板块
    public static void mrbk(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_MRBK).click();
    }
    //填写标题
    public static void title(SeleniumUtil seleniumUtil, String title){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_TITLE).sendKeys("123");
    }
    //填写内容
    public static void neiRong(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_NEIRONG).sendKeys("345678789");
    }
    //点击发表帖子
    public static void clickFaBiao(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_FATIE).click();
    }
    //重新构造一个发报表帖子
    public static void fatie(SeleniumUtil seleniumUtil,String title,String neirong) throws InterruptedException {
        mrbk(seleniumUtil);
        title(seleniumUtil, title);
        neiRong(seleniumUtil, neirong);
        clickFaBiao(seleniumUtil);
    }
}
