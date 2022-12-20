package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static utils.Driver.*;
import static actions.InputAction.*;
import static actions.ButtonAction.*;
import static actions.PropertyAction.*;

public class Stepdefs {
    @Given("user on homepage")
    public void userOnHomepage() {
        driver().get(getProperty("url"));
    }

    @When("user write {string} into {string}")
    public void userWriteInto(String text, String label) {
        sendKeys(label,text);
    }

    @And("user clicks {string} button")
    public void userClicksButton(String name) {
        click(name);
    }
}
