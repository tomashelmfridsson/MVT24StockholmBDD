package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToDoStepdefs {
    @Given("I have a Todolist")
    public void iHaveATodolist() {
    }

    @When("I add a task with description Buy milk")
    public void iAddATaskWithDescriptionBuyMilk() {
    }

    @Then("The task is addes with description 1. [ ] Buy milk")
    public void theTaskIsAddesWithDescriptionBuyMilk() {
    }
}
