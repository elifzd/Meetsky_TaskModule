package com.meetsky.pages;

import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//First scenario
    @FindBy(xpath = "(//div[@class='app-navigation-entry-icon'])[10]")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement newListInput;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]")
    public WebElement assertList;

//Second scenario
    @FindBy(xpath = "//input[@class='transparent reactive']")
    public WebElement addTaskButton;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div")
    public WebElement assertTask;

//Third scenario
    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[1]/ol/li[2]/div[1]/div[1]/label")
    public WebElement taskCompButton;

    @FindBy(id = "app-content-vue")
    public WebElement taskAssertAll;

//Fourth Task
    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[1]/ol/li/div[1]/div[3]/button/span[1]")
    public WebElement starButton;

//Fifth Task
    @FindBy(css = "/html/body/div[3]/div/ul/li[5]/div/div[1]/div")
    public WebElement currentTab;


}
