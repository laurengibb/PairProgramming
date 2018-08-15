import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class test {
    public static ExtentReports report;
    public ExtentTest test;

    WebDriver driver;
    Actions action;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\LocalInstall\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        action = new Actions(driver);
    }

    @BeforeClass
    static public void reportSetup(){
        report = new ExtentReports("C:\\Users\\Admin\\IdeaProjects\\PairProgramming\\report.html", true);
    }

    public void Register() {
        //Test Name
        test = report.startTest("Can register");

        //Maximise window
        driver.manage().window().maximize();
        //test note
        test.log(LogStatus.INFO, "Browser maximised");

        //Load Create User Page
        driver.get(constant.register);
        //test note
        test.log(LogStatus.INFO, "Register Page loaded");

        //getData
        importData page = PageFactory.initElements(driver, importData.class);
        page.data();
        //test note
        test.log(LogStatus.INFO, "Data from spreadsheet got");

        //Register User
        register page2 = PageFactory.initElements(driver, register.class);
        page2.creating();
        //test note
        test.log(LogStatus.INFO, "Register Form filled out");

        String URL = driver.getCurrentUrl();

        if (URL.contains("create_account_success")) {
            // report the test as a pass
            test.log(LogStatus.PASS, "User Registered");
        } else {
            test.log(LogStatus.FAIL, "User Registered");
        }

        Assert.assertTrue(URL.contains("create_account_success"));
    }

    @Test
    public void login() {

        Register();

        //Test Name
        test = report.startTest("Can login");

        resigterConfirmation page3 = PageFactory.initElements(driver, resigterConfirmation.class);
        page3.confirmation();

        //test note
        test.log(LogStatus.INFO, "Login Page loaded");

        //Log-in
        login page4 = PageFactory.initElements(driver, login.class);
        page4.loggingIn();
        //test note
        test.log(LogStatus.INFO, "Login form filled out");


        if (login.checkSuccessful.getText().equals("SIGN-OFF")) {
            // report the test as a pass
            test.log(LogStatus.PASS, "Logged In");
        } else {
            test.log(LogStatus.FAIL, "Logged In");
        }

        Assert.assertEquals("SIGN-OFF", login.checkSuccessful.getText());
    }

    @After
    public void teardown() {
        report.endTest(test);
        driver.quit();
    }

    @AfterClass
    static public void endReport(){
        report.flush();
    }
}
