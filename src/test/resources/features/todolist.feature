Feature: Todolist to handle my tasks
  Scenario: Add task
    Given I have a Todolist
    When I add a task with description Buy milk
    Then The task is addes with description 1. [ ] Buy milk