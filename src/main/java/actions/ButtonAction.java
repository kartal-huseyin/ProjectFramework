package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.text.MessageFormat;
import static utils.Driver.*;

public class ButtonAction {

   static final String button = "//button[contains(.,\"{0}\")]";
   static final String menuLink = "//li/a[contains(.,\"{0}\")]";
   static final String tabMenu = "//li/span[contains(.,\"{0}\")]";

    public static void click(String str){

        String locator="("+button+") | ("+menuLink+") | ("+tabMenu+")";

        By xpath=By.xpath(MessageFormat.format(locator, str));

        driverWait(5).until(ExpectedConditions.elementToBeClickable(xpath)).click();

    }

}
