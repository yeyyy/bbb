package pageHelper;

import page.PageWrite;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperTuiChuPage {
    //点击退出
    public static void clickTuiChu(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_TUICHU).click();
    }
    //构造一个退出
    public static void tuichu(SeleniumUtil seleniumUtil) throws InterruptedException {
        clickTuiChu(seleniumUtil);
        Thread.sleep(3000);
    }

}
