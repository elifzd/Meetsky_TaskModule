package com.meetsky.step_definitions;

import com.github.dockerjava.api.model.Task;
import com.meetsky.pages.LoginPage;
import com.meetsky.pages.TasksPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Tasks_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    TasksPage tasksPage = new TasksPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.login();
    }
    @Given("the user enter the tasks section")
    public void the_user_enter_the_tasks_section() {
        loginPage.tasksButton.click();
    }
    @When("user click create new list button")
    public void user_click_create_new_list_button() {
        tasksPage.addListButton.click();
    }
    @When("user enter a list name and click enter")
    public void user_enter_a_list_name_and_click_enter() {
        tasksPage.newListInput.sendKeys("Cookies");
        tasksPage.sendKeysList.click();
    }
    @Then("user can see all the created lists")
    public void user_can_see_all_the_created_lists() {
        WebElement listViewCheck = tasksPage.assertList;
        Assert.assertTrue(listViewCheck.isDisplayed());

    }

    @When("user enter a task name on task box")
    public void user_enter_a_task_name_on_task_box() {
        tasksPage.tikIcon.click();
        tasksPage.addTaskButton.click();
    }
    @When("user click enter after name")
    public void user_click_enter_after_name() {
        tasksPage.addTaskButton.sendKeys("From Intellij"+Keys.ENTER);
    }
    @Then("user can able to create new task and it should appear on the page")
    public void user_can_able_to_create_new_task_and_it_should_appear_on_the_page() {
        WebElement taskCheck = tasksPage.assertTask;
        Assert.assertTrue(taskCheck.isDisplayed());
    }
    @When("user click to the box near the name")
    public void user_click_to_the_box_near_the_name() {
        tasksPage.taskCompButton.click();
    }
    @Then("user should be able to add the task to the completed tasks")
    public void user_should_be_able_to_add_the_task_to_the_completed_tasks() {
        WebElement compTask = tasksPage.assertTask;
        Assert.assertTrue(compTask.isDisplayed());
    }



    @When("user created the tasks")
    public void user_created_the_tasks() {
        tasksPage.clickAll.click();
        WebElement taskAll = tasksPage.taskAssertAll;
        Assert.assertTrue(taskAll.isDisplayed());
    }
    @When("user click to the star near the task name")
    public void user_click_to_the_star_near_the_task_name() {
        tasksPage.starButton.click();
    }
    @Then("user should be able to add the task to the important tasks")
    public void user_should_be_able_to_add_the_task_to_the_important_tasks() {
        WebElement starBtn = tasksPage.starButton;
        Assert.assertTrue(starBtn.isDisplayed());
    }
//this one check again
    @When("user check left column {string} section")
    public void user_check_left_column_section(String string) {
        BrowserUtils.sleep(10);
        tasksPage.currentTab.click();
        tasksPage.currentTab.isDisplayed();
    }
    @Then("user should see the number of uncompleted tasks next to current tab")
    public void user_should_see_the_number_of_uncompleted_tasks_next_to_current_tab() {
        WebElement current = tasksPage.currentTab;
        Assert.assertTrue(current.isDisplayed());
    }
    //new one
    @When("user will click create new list button")
    public void user_will_click_create_new_list_button() {
        tasksPage.addListButton.click();
    }
    @When("user enter a existing list name and click enter")
    public void user_enter_a_existing_list_name_and_click_enter() {
        tasksPage.newListInput.sendKeys("Cookies"+Keys.ENTER);
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        WebElement list = tasksPage.assertList;

    }


}
