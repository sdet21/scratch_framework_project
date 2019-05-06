package stepDefinitions;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;

public class CapitaloneStep {

    WebDriver driver;

    @Given("^the user lands in landing page$")
    public void the_user_lands_in_landing_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:/Users/punee/IdeaProjects/scratch_project/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.capitalone.com/cars/login");
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        String title = driver.getTitle();
        System.out.println("The original title is ========"+title);
        Assert.assertEquals("Login | View Your Auto Navigator Dashboard",title);
    }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
        driver.findElement(By.id("lastName")).sendKeys("Rao");
        driver.findElement(By.id("zipcode")).sendKeys("75024");
        driver.findElement(By.id("ssn")).sendKeys("3651");
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
        driver.findElement(By.id("sign-in")).click();
        String landingTitle = driver.getTitle();
        System.out.println(landingTitle);
        Assert.assertEquals("Login | View Your Auto Navigator Dashboard",landingTitle);
        driver.quit();
    }

}
