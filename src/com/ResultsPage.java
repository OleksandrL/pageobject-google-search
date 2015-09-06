package com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class ResultsPage extends Page{
 
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
 
    @FindBy (className = "sbdd_b")
    private WebElement resultDiv;
    @FindBy (css =".sbsb_b")
    List<WebElement> allSuggestions;
 
    public void print() throws Exception{
    	new WebDriverWait(_driver, 10).until(ExpectedConditions.visibilityOf(resultDiv));
    	for (WebElement suggestion : allSuggestions) {
    		System.out.println(suggestion.getText());
    		}
    }
}