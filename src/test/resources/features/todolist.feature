Feature: Todolist to handle my tasks
  Scenario: Add task
    Given I have a Todolist
    When I add a task with description "Buy milk"
    Then The task list is "1. [ ] Buy milk"

    Scenario: Mark task as completed
      Given I have a Todolist
      * I add a task with description "Buy milk"
      When I complete task 1
      Then The task list is "1. [X] Buy milk"