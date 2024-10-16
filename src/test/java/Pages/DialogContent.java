package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveClose;

    @FindBy(xpath = "(//mat-select/div/div/span)[3]")
    public WebElement countrySelect;

    @FindBy(xpath = "//mat-option/span[text()=' Nepal ']")
    public WebElement countryOption;

    @FindBy(xpath = "//*[@class='mdc-evolution-chip-set__chips']")
    public WebElement UserType;

    @FindBy(xpath = "//*[text()=' Teacher ']")
    public WebElement teacher;

    @FindBy(xpath = "//*[text()=' Administrator ']")
    public WebElement Administrator;

    @FindBy(xpath = "//*[text()=' Student ']")
    public WebElement Student;

    @FindBy(xpath = "//*[text()=' Everyone ']")
    public WebElement Everyone;

    @FindBy(xpath = "//*[text()=' Employee Role ']")
    public WebElement EmployeeRole;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement Save;

    @FindBy(xpath = "(//*[text()='Academic Period'])[1]")
    public WebElement academicperiod;

    @FindBy(xpath = "//*[text()=' Internship  ']")
    public WebElement internship;

    @FindBy(xpath = "(//*[text()='Grade Level'])[1]")
    public WebElement gradelevel;

    @FindBy(xpath = "//*[text()=' Luciano ']")
    public WebElement luciano;

    @FindBy(xpath = "//*[text()=' gold _ f ']")
    public WebElement golff;

    @FindBy(xpath = "//*[text()=' Valentine ']")
    public WebElement valentine;

    @FindBy(xpath = "//*[text()=' Alvin ']")
    public WebElement alvin;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement SearchInput;

    @FindBy(xpath = "(//*[contains (span,'Exam')])[4]")
    public WebElement backbutton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement accandDelButton;



    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void deleteItem(String deleteName)
    {
        mySendKeys(searchInput,deleteName);
        myClick(searchButton);

        //sayfa yenilenen kadar bekle, arama sonuçlanana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "addButton" : return this.addButton;
            case "nameInput" : return this.nameInput;
            case "codeInput" : return this.codeInput;
            case "saveButton" : return this.saveButton;
            case "shortName" : return this.shortName;
            case "integrationCode" : return this.integrationCode;
            case "priorityCode" : return this.priorityCode;
            case "toggleBar" : return this.toggleBar;
            case "saveClose" : return this.saveClose;
            case "countrySelect": return this.countrySelect;
            case "countryOption": return this.countryOption;
            case "UserType": return this.UserType;
            case "teacher": return this.teacher;
            case "Administrator": return this.Administrator;
            case "Student": return this.Student;
            case "Everyone": return this.Everyone;
            case "EmployeeRole": return this.EmployeeRole;
            case "Save": return this.Save;
            case "academicperiod": return this.academicperiod;
            case "internship": return this.internship;
            case "gradelevel": return this.gradelevel;
            case "luciano": return this.luciano;
            case "golff": return this.golff;
            case "valentine": return this.valentine;
            case "alvin": return this.alvin;
            case "SearchInput": return this.SearchInput;
            case "backbutton": return this.backbutton;
            case "searchButton": return this.searchButton;
            case "deleteButton": return this.deleteButton;
            case "accandDelButton": return this.accandDelButton;
        }
        return null;
    }


}


//ms-add-button[@tooltip='COUNTRY.TITLE.ADD']//button
//ms-add-button[@tooltip='STATE.TITLE.ADD']//button

//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button