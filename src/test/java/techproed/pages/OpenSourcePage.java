package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    public OpenSourcePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement loginButton;

    @FindBy(tagName = "h6")
    public WebElement dashboard;
}
