package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCenter {
    public TestCenter(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "button")
    public WebElement baslık;


    @FindBy(id = "exampleInputEmail1")
    public WebElement userName;

    @FindBy(id = "exampleInputPassword1")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement text;

    @FindBy(xpath = "//a[@class='btn btn-dark']")
    public WebElement logout;


}
