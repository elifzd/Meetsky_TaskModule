@ETSKY-863
Feature: Tasks Module Functionality
  Agile story: As a user, I should be able to create a new task list or
  a single task and add any task to completed and important tasks list.

  Background:
    Given the user is on the login page
    And the user enter the tasks section
@ETSKY-858
  Scenario: Creating new list of tasks verification
    When user click create new list button
    And user enter a list name and click enter
    Then user can see all the created lists
@ETSKY-859
  Scenario: Creating new task verification
    When user enter a task name on task box
    And user click enter after name
    Then user can able to create new task and it should appear on the page
@ETSKY-860
  Scenario: Adding task to completed tasks
    When user created the tasks
    And user click to the box near the name
    Then user should be able to add the task to the completed tasks
@ETSKY-861
  Scenario: Adding task to important tasks
    When user created the tasks
    And user click to the star near the task name
    Then user should be able to add the task to the important tasks
@ETSKY-862
  Scenario: Checking the number of all uncompleted tasks
    When user check left column "Current Tab" section
    Then user should see the number of uncompleted tasks next to current tab