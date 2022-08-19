package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "[aria-label=\"LOGIN\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[text()=' Dashboard ']")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement countryName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement countryCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement countrySucces;

    @FindBy(xpath = "//div[contains(text(),'already exists.')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "(//ms-dialog//button)[2]")
    private WebElement closeDialog;

    @FindBy(xpath = "//*[text()=' Total Revenue ']")
    private WebElement totalRevenue;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        //burda string isimden webelemente ulasıcam
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "countryName" : myElement = countryName;break;
            case "countryCode" : myElement = countryCode;break;
            case "shortName" : myElement = shortName;break;
        }

        sendKeysFunction(myElement, value);

    }
    public void findAndClick(String strElement) {
        //burda string isimden webelemente ulasıcam
        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "addButton" : myElement = addButton;break;
            case "saveButton" : myElement = saveButton;break;
            case "closeDialog" : myElement = closeDialog;break;
        }

        clickFunction(myElement);
    }


    public void findAndContainsText(String strElement,String text) {

        switch (strElement) {
            case "dashboard" : myElement = dashboard;break;
            case "countrySucces" : myElement = countrySucces;break;
            case "totalRevenue" : myElement = totalRevenue;break;
            case "alreadyExist" : myElement = alreadyExist;break;
        }

        verifyContainsText(myElement,text);
    }
}
