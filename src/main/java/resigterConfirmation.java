import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class resigterConfirmation {
    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")
    private WebElement preLoginButton;

    public void confirmation() {
        preLoginButton.click();
    }
}
