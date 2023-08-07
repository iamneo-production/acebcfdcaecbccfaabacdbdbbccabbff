import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class M {
    @Given("user on the user registration page")
    public void userOnRegistrationPage() {
        // Code to navigate to the user registration page
    }

    @When("user enters a valid user name")
    public void enterValidUserName() {
        // Code to enter a valid user name
    }

    @When("valid e-mail address")
    public void enterValidEmailAddress() {
        // Code to enter a valid email address
    }

    @When("valid password")
    public void enterValidPassword() {
        // Code to enter a valid password
    }

    @When("valid confirmation password")
    public void enterValidConfirmationPassword() {
        // Code to enter a valid confirmation password
    }

    @When("valid Birth-date")
    public void enterValidBirthDate() {
        // Code to enter a valid birth date
    }

    @When("valid Gender")
    public void selectValidGender() {
        // Code to select a valid gender
    }

    @When("valid phone number")
    public void enterValidPhoneNumber() {
        // Code to enter a valid phone number
    }

    @Then("user registration should be successful")
    public void verifyRegistrationSuccess() {
        // Code to verify that user registration is successful
    }
}