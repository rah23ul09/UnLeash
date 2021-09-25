package com.OrangeHRM.Pages;

import com.OrangeHRM.Elements.UserManagementElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserManagementPage extends AbstractAdminPage {
    UserManagementElement userManagementElement;

    public UserManagementPage(WebDriver driver) {
        super(driver);
        userManagementElement = new UserManagementElement(this.driver);
    }

    @Override
    public void verifyTabAdminList() {
        try {
            waitAll("visible", adminElement.tabAdminList);
            for (WebElement user : adminElement.tabAdminList) {
                String userManagement = user.getText().trim();
                if (userManagement.equals("User Management")) {
                    waitAction("click", user);
                    user.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            waitAll("visible", adminElement.tabAdminList);
            for (WebElement user : adminElement.tabAdminList) {
                String userManagement = user.getText().trim();
                if (userManagement.equals("User Management")) {
                    waitAction("click", user);
                    user.click();
                }
            }
        }
    }

    public void verifyToggleBar() {
        verifyTabAdminList();
        waitAction("click" , userManagementElement.toggleBar);
        userManagementElement.toggleBar.click();
    }

    public void verifySearchEmployeeButton() {
        //Enter username in the textbox of username
        waitAction("click" , userManagementElement.textUsername);
        userManagementElement.textUsername.sendKeys("Admin");

        //Select role of the user
        waitAll("visible" , userManagementElement.dropDownUserRole);
        for (WebElement selectRole : userManagementElement.dropDownUserRole) {
            String userRole = selectRole.getText().trim();
            if(userRole.equals("Admin")) {
                waitAction("click" , selectRole);
                selectRole.click();
            }
        }

        //Enter Employee name
        waitAction("click" , userManagementElement.textEmployeeName);
        userManagementElement.textEmployeeName.sendKeys("Paul Collings");

        //Select Status
        waitAll("visible" , userManagementElement.dropDownStatus);
        for (WebElement status : userManagementElement.dropDownStatus) {
            String userStatus = status.getText().trim();
            if(userStatus.equals("Activated")) {
                waitAction("click" , status);
                status.click();
            }
        }

        //click on search button
        waitAction("click" , userManagementElement.buttonSearch);
        userManagementElement.buttonSearch.click();
    }

    public void verifyResetEmployeeButton() {
        verifySearchEmployeeButton();
        waitAction("click", userManagementElement.buttonReset);
        userManagementElement.buttonReset.click();
    }

    //Adding user in the table
    public void verifyAddButton() {
        waitAction("click", userManagementElement.buttonAdd);
        userManagementElement.buttonAdd.click();

        //Select role for the new user
        waitAll("visible" , userManagementElement.dropDownAddUserRole);
        for (WebElement addRole : userManagementElement.dropDownAddUserRole) {
            String addUserRole = addRole.getText().trim();
            if(addUserRole.equals("Admin")) {
                waitAction("click" , addRole);
                addRole.click();
            }
        }

        //Enter employee name to be added
        waitAction("click" , userManagementElement.textAddUserEmployeeName);
        userManagementElement.textAddUserEmployeeName.sendKeys("Garry White");

        //Enter username
        waitAction("click" , userManagementElement.textAddUserUsername);
        userManagementElement.textAddUserUsername.sendKeys("Jagga Daku");

        //Select status of the employee
        waitAll("visible" , userManagementElement.dropDownAddUserStatus);
        for (WebElement userStatus : userManagementElement.dropDownAddUserStatus) {
            String status = userStatus.getText().trim();
            if(status.equals("Enabled")) {
                waitAction("visible" , userStatus);
                userStatus.click();
            }
        }

        //Set password
        waitAction("click" , userManagementElement.textPassword);
        userManagementElement.textPassword.sendKeys("Miracle2309");

        //confirm password
        waitAction("click" , userManagementElement.textConfirmPassword);
        userManagementElement.textConfirmPassword.sendKeys("Miracle2309");

        //save the new user/employee details
        waitAction("click" , userManagementElement.buttonSave);
        userManagementElement.buttonSave.click();
    }

    //Handling staleElementException for adding user method
    public void verifyAddUser() {
        try {
            verifyAddButton();
        }catch (StaleElementReferenceException e) {
            verifyAddButton();
        }
    }

    //Deleting user from the table
    public void verifyDeleteButton() {
        waitAll("visible" , userManagementElement.optionsName);
        for (WebElement optName : userManagementElement.optionsName) {
            String Name = optName.getText().trim();
            while(Name.equals("Charu")) {
                for (WebElement option: userManagementElement.options) {
                    waitAction("click" , option);
                    option.click();
                }
                break;
            }
        }
    }

    public void verifyDeleteUser() {
        try {
            verifyDeleteButton();
        }catch (StaleElementReferenceException e) {
            verifyDeleteButton();
        }
    }
}