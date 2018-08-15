import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
    private WebElement loginUsername;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
    private WebElement loginPassword;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")
    private WebElement home;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
    static public WebElement checkSuccessful;


    public void loggingIn(){
        loginUsername.sendKeys(importData.UserName);
        loginPassword.sendKeys(importData.Password);
        loginButton.submit();
        home.click();
    }
}
