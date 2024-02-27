package example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstSteps {

    @Given("Get ready prepare to drive")
    public void getReadyAndPrepareToDriver() {
        System.out.println("Steps For Preparing and Going to Driver");
    }

    @When("Drive to School")
    public void driveToSchool() {
        System.out.println("Step For Driving to School");
    }

    @Then("Arrive to school")
    public void arriveToSchool() {
        System.out.println("Step for Arriving to School");
    }

    @When("Driver to {string}")
    public void driveToSomeWhere(String somewhere) {
        System.out.println("Steps for Driving " + somewhere);
    }

    @Then("Arrive to {string}")
    public void arriveToSomewhere(String somewhere) {
        System.out.println("Step for Then Arriving " + somewhere);
    }

}
