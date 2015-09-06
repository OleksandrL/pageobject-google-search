package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
 
public class GoogleSuggest {
 
    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.google.com/webhp?complete=1&hl=en");
        SearchPage googleHome = PageFactory.initElements(driver, SearchPage.class);
        ResultsPage searchResults = googleHome.search("Cheese");
        searchResults.print();
        driver.quit();
    }
}