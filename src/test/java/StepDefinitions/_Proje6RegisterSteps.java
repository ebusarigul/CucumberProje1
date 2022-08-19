package StepDefinitions;

import Pages.Proje6POM;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _Proje6RegisterSteps {

    Proje6POM p6 = new Proje6POM();

    @Given("Navigate to parabank")
    public void navigateToParabank() {

        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click Register Button")
    public void clickRegisterButton() {
        p6.findAndClick("register");
    }

    @And("fill in registration information and register click")
    public void fillInRegistrationInformationAndRegisterClick() {
        p6.findAndSend("firstName","Ebubekir");
        p6.findAndSend("lastName","Sarigul");
        p6.findAndSend("adress","Nilufer Bursa");
        p6.findAndSend("city","Bursa");
        p6.findAndSend("state","Marmara");
        p6.findAndSend("zipCode","16130");
        p6.findAndSend("phoneNumber","13654613232");
        p6.findAndSend("ssn","12713161117");
        p6.findAndSend("username","ebusarigul");
        p6.findAndSend("password","ebu123456");
        p6.findAndSend("confirmPasswprd","ebu123456");
        p6.findAndClick("registerButton");
    }

    @Then("User should be see succes")
    public void userShouldBeSeeSucces() {
        p6.findAndContainsText("registerSucces","created successfully");
    }
}
