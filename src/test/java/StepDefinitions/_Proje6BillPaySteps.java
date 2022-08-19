package StepDefinitions;

import Pages.Proje6POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _Proje6BillPaySteps {

    Proje6POM p6 = new Proje6POM();

    @When("enter username password")
    public void enterUsernamePassword() {
        p6.findAndSend("loginusername","ebusarigul");
        p6.findAndSend("loginpasword","ebu123456");
        p6.findAndClick("loginButton");
    }

    @And("BillPay Click")
    public void billpayClick() {
        p6.findAndClick("billPay");
    }

    @When("user send payeename as {string} amount as {string} payeeAddress as {string} payeeZip as {string}")
    public void userSendPayeenameAsAmountAsPayeeAddressAsPayeeZipAs(String arg0, String arg1, String arg2, String arg3) {
        p6.findAndSend("payeeName",arg0);
        p6.findAndSend("amount",arg1);
        p6.findAndSend("payeeAddress",arg2);
        p6.findAndSend("payeeZip",arg3);

    }

    @And("fill in other billing information")
    public void fillInOtherBillingInformation() {
        p6.findAndSend("payeeCity","Bursa");
        p6.findAndSend("payeeState","Marmara");
        p6.findAndSend("payeePhone","5123456484");
        p6.findAndSend("accountNumber","14787");
        p6.findAndSend("verifyAccountNumb","14787");

    }

    @And("Send Payöemt Button")
    public void sendPayöemtButton() {
        p6.findAndClick("sendPaymentButton");
    }

    @Then("verify invoice has been paid")
    public void verifyInvoiceHasBeenPaid() {
        p6.findAndContainsText("billPaySucces","complete");
    }
}
