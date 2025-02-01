package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class CarRentalPage {
    public CarRentalPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/auth']")
    public WebElement loginRegisterButton;
    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailTextBox;
    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[.=' Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@class='nav-item dropdown']")
    public WebElement loginVerify;

    @FindBy(xpath = "//a[.='Profile']")
    public WebElement profile;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//*[contains(text(),'User with email fake@rentalcars.com not found')]")
    public WebElement negativeLoginVeryfy;
    @FindBy(tagName = "em")
    public WebElement profileEmail;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yesButton;




}
