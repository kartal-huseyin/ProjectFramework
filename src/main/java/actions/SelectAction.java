package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.MessageFormat;

import static utils.Driver.driverWait;

public class SelectAction {

    static final String buttonSelect = "//label[contains(.,\"{0}\")]/ancestor::div[2]//div[contains(@class,\"active\")]";

    public static void clickSelect(String str){

        By xpath=By.xpath(MessageFormat.format(buttonSelect, str));

        driverWait(5).until(ExpectedConditions.elementToBeClickable(xpath)).click();

    }


}
