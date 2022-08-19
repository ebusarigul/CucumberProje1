package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proje6POM extends Parent{
    public Proje6POM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement adress;

    @FindBy(id = "customer.address.city")
    private WebElement city;

    @FindBy(id = "customer.address.state")
    private WebElement state;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement username;

    @FindBy(id = "customer.password")
    private WebElement password;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPasswprd;

    @FindBy(css = "[value=\"Register\"]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    private WebElement registerSucces;

    //------------------------------------------------------

    @FindBy(name = "username")
    private WebElement loginusername;

    @FindBy(name = "password")
    private WebElement loginpasword;

    @FindBy(css = "[value=\"Log In\"]")
    private WebElement loginButton;

    @FindBy(css = "div>h1")
    private WebElement loginSuccesMessage;

    @FindBy(css = "#rightPanel>p")
    private WebElement loginErrorMessage;


    //------------------------------------------------------

    @FindBy(linkText = "Bill Pay")
    private WebElement billPay;

    @FindBy(name = "payee.name")
    private WebElement payeeName;

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(name = "payee.address.street")
    private WebElement payeeAddress;

    @FindBy(name = "payee.address.city")
    private WebElement payeeCity;

    @FindBy(name = "payee.address.state")
    private WebElement payeeState;

    @FindBy(name = "payee.address.zipCode")
    private WebElement payeeZip;

    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhone;

    @FindBy(name = "payee.accountNumber")   //14787
    private WebElement accountNumber;

    @FindBy(name = "verifyAccount")
    private WebElement verifyAccountNumb;

    @FindBy(css = "[value=\"Send Payment\"]")
    private WebElement sendPaymentButton;

    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    private WebElement billPaySucces;




    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "register" : myElement =register; break;
            case "registerButton" : myElement =registerButton; break;
            case "loginButton" : myElement =loginButton; break;
            case "billPay" : myElement =billPay; break;
            case "sendPaymentButton" : myElement =sendPaymentButton; break;
        }

        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "firstName" : myElement =firstName; break;
            case "lastName" : myElement =lastName; break;
            case "adress" : myElement =adress; break;
            case "city" : myElement =city; break;
            case "state" : myElement =state; break;
            case "zipCode" : myElement =zipCode; break;
            case "phoneNumber" : myElement =phoneNumber; break;
            case "ssn" : myElement =ssn; break;
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "confirmPasswprd" : myElement =confirmPasswprd; break;
            //-------------
            case "loginusername" : myElement =loginusername; break;
            case "loginpasword" : myElement =loginpasword; break;
            //-------------
            case "payeeName" : myElement =payeeName; break;
            case "amount" : myElement =amount; break;
            case "payeeAddress" : myElement =payeeAddress; break;
            case "payeeZip" : myElement =payeeZip; break;
            case "payeeCity" : myElement =payeeCity; break;
            case "payeeState" : myElement =payeeState; break;
            case "payeePhone" : myElement =payeePhone; break;
            case "accountNumber" : myElement =accountNumber; break;
            case "verifyAccountNumb" : myElement =verifyAccountNumb; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "registerSucces" : myElement =registerSucces; break;
            case "loginSuccesMessage" : myElement =loginSuccesMessage; break;
            case "loginErrorMessage" : myElement =loginErrorMessage; break;
            case "billPaySucces" : myElement =billPaySucces; break;

        }
        verifyContainsText(myElement,text);
    }

}
