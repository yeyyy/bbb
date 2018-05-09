package pageHelper;

import page.PageBkgl;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/9.
 */
public class HelperXinBKPage {
    public static void clickGlzx(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageBkgl.LOGIN_LINK_BKGL).click();
    }
    public static void clickLunT(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageBkgl.LOGIN_LINK_LUNTAN).click();
    }
    public static void clickTianjia(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageBkgl.LOGIN_LINK_XINMOK).click();
    }
    public static void clickTijiao(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageBkgl.LOGIN_LINK_TIJIAO).click();
    }
    public static void clickTuichu(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageBkgl.LOGIN_LINK_TUICHU).click();
    }
    //重新构造一个新的板块
    public static void bankuan(SeleniumUtil seleniumUtil){
        clickGlzx(seleniumUtil);
        clickLunT(seleniumUtil);
        clickTianjia(seleniumUtil);
        clickTijiao(seleniumUtil);
        clickTuichu(seleniumUtil);

    }
}
