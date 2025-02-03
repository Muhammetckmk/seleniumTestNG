package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ZeroPage {
    public ZeroPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "signin_button")
    public WebElement signin1;

    @FindBy(id = "user_login")
    public WebElement userName;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(css = "input[type='submit']")
    public WebElement singinButton;

   @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBanking;

   @FindBy(id = "pay_bills_link")
    public WebElement payBills;

  @FindBy(partialLinkText = "Purchase Foreign Currency")
    public WebElement PurchaseForeignCurrency;

  @FindBy(id = "pc_currency")
    public WebElement currency;



}
