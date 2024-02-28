package example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentSteps {

    @Given("Student name {string}")
    public void studentName(String fullName){
        System.out.println("Student name "
                + fullName);
    }

    @Given("Student class name is {string}")
    public void studentClassName(String className){
        System.out.println("Student class name " + className);
    }

    @Given("In subject {string}")
    public void subjectId(String subject) {
        System.out.println("In Subject " + subject);
    }

    @When("Student has {int} scored")
    public void studentScore(int score) {
        System.out.println("Student Score is " + score);
    }

    @Then("Student result is {string}")
    public void studentResult(String result) {
        System.out.println("Student Result is " + result);
    }

}
