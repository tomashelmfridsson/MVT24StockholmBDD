package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import todo.TodoList;
import static org.junit.jupiter.api.Assertions.*;


public class ToDoStepdefs {
    private TodoList todoList;

    @Before
    public void setup(){
        todoList = new TodoList();
    }

    @Given("I have a Todolist")
    public void iHaveATodolist() {

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
        assertEquals(tasklist,todoList.getList());
    }


    @Then("The task list size is {int}")
    public void theTaskListSizeIs(int size) {
        assertEquals(size,todoList.getNbrOfTasks());
    }

    @And("Number of completed tasks is {int}")
    public void numberOfCompletedTasksIs(int nbrCompletedtasks) {
    assertEquals(nbrCompletedtasks,todoList.getFinishedTasks());
    }
}
