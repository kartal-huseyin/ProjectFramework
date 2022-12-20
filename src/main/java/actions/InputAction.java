package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.text.MessageFormat;
import static utils.Driver.*;

public class InputAction {

    static final String formInput="//label[contains(.,\"{0}\")]/ancestor::div[2]//input";

    public static void sendKeys(String str,String ch){

       By locator= By.xpath(MessageFormat.format(formInput,str));

       driverWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(ch);

    }

}
