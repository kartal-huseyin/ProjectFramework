package tests;

import org.testng.annotations.Test;
import static utils.Driver.*;
import static actions.InputAction.*;
import static actions.ButtonAction.*;
import static actions.SelectAction.*;

import static actions.PropertyAction.*;

public class Test1 {

    @Test
    public void test1(){

        driver().get(getProperty("url"));
        sendKeys("Username",getProperty("username"));
        sendKeys("Password",getProperty("password"));
        click("Login");
        click("Admin");
        clickSelect("User Role");
        click("Job");


    }

}
