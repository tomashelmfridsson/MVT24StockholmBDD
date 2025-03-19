Feature: Todolist to handle my tasks
  Scenario: Add task
    Given I have a Todolist
    When I add a task with description "Buy milk"
    Then The task list is "1. [ ] Buy milk"

    Scenario: Mark task as completed
      Given I have a Todolist
      * I add a task with description "Buy milk"
      When I complete task 1
      * I complete task 1
      Then The task list is "1. [X] Buy milk"
      And Number of completed tasks is 1

  Scenario: Add multiple tasks
    Given I have a Todolist
    When I add a task with description "Buy milk"
    When I add a task with description "Go for a run"
    When I add a task with description "Swim in the lake"
    Then The task list size is 3