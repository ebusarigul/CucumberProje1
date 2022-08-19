package StepDefinitions;

import Pages.Proje6POM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _Proje6LoginSteps {

    Proje6POM p6 = new Proje6POM();

    @When("User a username name as {string} password as {string}")
    public void userAUsernameNameAsPasswordAs(String username, String password) {
        p6.findAndSend("loginusername",username);
        p6.findAndSend("loginpasword",password);
        p6.findAndClick("loginButton");
    }

    @Then("User should login successfuliy")
    public void userShouldLoginSuccessfuliy() {
        p6.findAndContainsText("loginSuccesMessage","Accounts Overview");
    }

    @Then("User Sould be able see incorrect usernamepassword")
    public void userSouldBeAbleSeeIncorrectUsernamepassword() {
        p6.findAndContainsText("loginErrorMessage","error");
    }
}
