package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateUserSteps {
    WebDriver driver;

    @Given("I am on the account creation page")
    public void i_am_on_the_account_creation_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
    }

    @When("I fill in all required fields correctly")
    public void i_fill_in_all_required_fields_correctly() throws InterruptedException {
        driver.findElement(By.id("member_firstname")).sendKeys("Max");
        driver.findElement(By.id("member_lastname")).sendKeys("Muster");
        driver.findElement(By.id("member_emailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("signupunlicenced_password")).sendKeys("password123");
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("password123");

        WebElement dateOfBirthField = driver.findElement(By.id("dp"));
        dateOfBirthField.sendKeys("01/01/2000");

        WebElement body = driver.findElement(By.tagName("body"));
        body.click();

        WebElement role = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[10]/div/div/div[8]/div/label"));
        Thread.sleep(2000);
        role.click();

        WebElement terms = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[1]/label"));
        Thread.sleep(2000);
        terms.click();

        WebElement age = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[2]/label"));
        Thread.sleep(2000);
        age.click();

        WebElement comm = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[4]/label"));
        Thread.sleep(2000);
        comm.click();

        WebElement ethics = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[7]/label"));
        Thread.sleep(2000);
        ethics.click();
    }

    @And("I submit the form")
    public void i_submit_the_form() {
        WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[12]/input"));
        submitBtn.click();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("/html/body/div/div[2]/div/h2")
        ));
        Assert.assertTrue(confirmationMessage.isDisplayed());
        driver.quit();

    }

    @When("I fill in all required fields except the last name")
    public void i_fill_in_all_required_fields_except_the_last_name() throws InterruptedException {
        driver.findElement(By.id("member_firstname")).sendKeys("Max");
        driver.findElement(By.id("member_emailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("signupunlicenced_password")).sendKeys("password123");
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("password123");

        WebElement dateOfBirthField = driver.findElement(By.id("dp"));
        dateOfBirthField.sendKeys("01/01/2000");

        WebElement body = driver.findElement(By.tagName("body"));
        body.click();

        WebElement role = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[10]/div/div/div[8]/div/label"));
        Thread.sleep(2000);
        role.click();

        WebElement terms = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[1]/label"));
        Thread.sleep(2000);
        terms.click();

        WebElement age = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[2]/label"));
        Thread.sleep(2000);
        age.click();

        WebElement comm = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[4]/label"));
        Thread.sleep(2000);
        comm.click();

        WebElement ethics = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[7]/label"));
        Thread.sleep(2000);
        ethics.click();

    }

    @When("I fill in all required fields with mismatched passwords")
    public void i_fill_in_all_required_fields_with_mismatched_passwords() throws InterruptedException {
        WebElement dateOfBirthField = driver.findElement(By.id("dp"));
        dateOfBirthField.sendKeys("01/01/2000");

        WebElement body = driver.findElement(By.tagName("body"));
        body.click();

        driver.findElement(By.id("member_firstname")).sendKeys("Max");
        driver.findElement(By.id("member_lastname")).sendKeys("Muster");
        driver.findElement(By.id("member_emailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("signupunlicenced_password")).sendKeys("password123");
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("password321");

        WebElement role = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[10]/div/div/div[8]/div/label"));
        Thread.sleep(2000);
        role.click();

        WebElement terms = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[1]/label"));
        Thread.sleep(2000);
        terms.click();

        WebElement age = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[2]/label"));
        Thread.sleep(2000);
        age.click();

        WebElement comm = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[4]/label"));
        Thread.sleep(2000);
        comm.click();

        WebElement ethics = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[7]/label"));
        Thread.sleep(2000);
        ethics.click();
    }

    @When("I fill in all required fields except accepting terms and conditions")
    public void i_fill_in_all_required_fields_except_accepting_terms_and_conditions() throws InterruptedException {
        WebElement dateOfBirthField = driver.findElement(By.id("dp"));
        dateOfBirthField.sendKeys("01/01/2000");

        WebElement body = driver.findElement(By.tagName("body"));
        body.click();

        driver.findElement(By.id("member_firstname")).sendKeys("Max");
        driver.findElement(By.id("member_lastname")).sendKeys("Muster");
        driver.findElement(By.id("member_emailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("max.muster@test.com");
        driver.findElement(By.id("signupunlicenced_password")).sendKeys("password123");
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("password123");

        WebElement role = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[10]/div/div/div[8]/div/label"));
        Thread.sleep(2000);
        role.click();

        WebElement age = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[2]/label"));
        Thread.sleep(2000);
        age.click();

        WebElement comm = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[4]/label"));
        Thread.sleep(2000);
        comm.click();

        WebElement ethics = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[7]/label"));
        Thread.sleep(2000);
        ethics.click();
    }

    @Then("I should see an error message for the last name")
    public void i_should_see_an_error_message_for_the_last_name() {
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[5]/div[2]/div/span/span"));
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.quit();
    }

    @Then("I should see an error message for password mismatch")
    public void i_should_see_an_error_message_for_password_mismatch() {
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[8]/div/div[2]/div[2]/div/span"));
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.quit();
    }

    @Then("I should see an error message for terms and conditions")
    public void i_should_see_an_error_message_for_terms_and_conditions() {
           WebElement errorMessage = driver.findElement(By.xpath("//*[@data-valmsg-for='TermsAccept' and contains(@class, 'field-validation-error')]"));
           Assert.assertTrue(errorMessage.isDisplayed());
           driver.quit();
        }
}

