package pageHelper;

import page.PageWrite;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperHuiTiePage {
    //输入回复内容
    public static void inputHuifuneirong(SeleniumUtil seleniumUtil,String huitieneirong){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_HUITIE).sendKeys("哈哈哈");
    }
    //点击发表回复
    public static void clickFaBiaoHuiFu(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageWrite.LOGIN_LINK_FBHUIFU).click();
    }
    //重新构造一个回复帖子
    public static void huitie(SeleniumUtil seleniumUtil,String huitieneirong) throws InterruptedException {
        inputHuifuneirong(seleniumUtil,huitieneirong);
        clickFaBiaoHuiFu(seleniumUtil);
        Thread.sleep(3000);
    }
}
