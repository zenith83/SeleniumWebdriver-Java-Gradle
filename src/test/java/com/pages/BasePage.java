package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class BasePage {

    protected WebDriver webDriver;
    protected static HashMap<String, Object> hashMap = new HashMap<String, Object>();


    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

   public void click(By by){
       webDriver.findElement(by).click();
   }

}

