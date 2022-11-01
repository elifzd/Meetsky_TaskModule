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

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/form/input[3]")
    public WebElement sendKeysList;

    @FindBy(xpath = "//*[@id=\"list_cookies-8\"]")
    public WebElement listArea;

//Second scenario
    @FindBy(xpath = "//input[@class='transparent reactive']")
    public WebElement addTaskButton;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div")
    public WebElement assertTask;

//Third scenario

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[11]/a")
    public WebElement tikIcon;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[1]/ol/li[2]/div[1]/div[1]/label")
    public WebElement taskCompButton;

    @FindBy(id = "app-content-vue")
    public WebElement taskAssertAll;

//Fourth Task
    @FindBy(xpath = "//*[@id=\"collection_all\"]/a")
    public WebElement clickAll;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[1]/ol/li/div[1]/div[3]/button/span[1]")
    public WebElement starButton;

//Fifth Task
    @FindBy(xpath = "//*[@id=\"collection_current\"]/div/div[1]")
    public WebElement currentTab;


}
