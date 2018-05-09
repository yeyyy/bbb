package pageHelper;

import page.PageUserLogin;
import util.SeleniumUtil;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperShanChuPage {
    public static Logger logger = Logger.getLogger("HelperLoginPage");
    public static void clickMoRBK(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageUserLogin.LOGIN_LINK_MORENBK).click();
    }
    public static void clickTiezi(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageUserLogin.LOGIN_LINK_JINTIE).click();
    }
    public static void clickShanChu(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageUserLogin.LOGIN_LINK_SHANCHU).click();
    }
    public static void clickQueD(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageUserLogin.LOGIN_LINK_QUEDING).click();
    }
    //重新构造一个删除帖子
    public static void shanchu(SeleniumUtil seleniumUtil) throws InterruptedException {
        clickMoRBK(seleniumUtil);
        Thread.sleep(3000);
        clickTiezi(seleniumUtil);
        clickShanChu(seleniumUtil);
        clickQueD(seleniumUtil);
    }
}
