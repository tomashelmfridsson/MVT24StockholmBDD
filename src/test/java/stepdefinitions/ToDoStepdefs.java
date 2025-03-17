package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import todo.TodoList;
import static org.junit.jupiter.api.Assertions.*;


public class ToDoStepdefs {
    private TodoList todoList;

    @Given("I have a Todolist")
    public void iHaveATodolist() {
        todoList = new TodoList();
    }

    @When("I add a task with description {string}")
    public void iAddATaskWithDescriptionBuyMilk(String task) {
        todoList.addTask(task);
    }

    @When("I complete task {int}")
    public void iCompleteTask(int taskNumber) {
        todoList.completeTask(taskNumber-1);
    }

    @Then("The task list is {string}")
    public void theTaskIsMarkedCompleted(String tasklist) {
        assertEquals(tasklist,todoList.getList().trim());
    }
}
