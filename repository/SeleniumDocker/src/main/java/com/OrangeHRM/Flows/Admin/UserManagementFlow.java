package com.OrangeHRM.Flows.Admin;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class UserManagementFlow extends AbstractAdminFlow {

    public UserManagementFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validateAdminFlow(String url) {
            validateAdminTab(url);
    }

    @Override
    public void validateAdminFlowOnly() {
        validateAdminTabOnly();
    }

    public void validateToggleBar(String url) {
        validateAdminFlow(url);
        UserManagementP().verifyToggleBar();
        UserManagementP().verifyToggleBar();
    }

    public void validateUserSearchFlow() {
        validateAdminFlowOnly();
        UserManagementP().verifySearchEmployeeButton();
    }

    public void validateUserResetFlow() {
        try {
            validateAdminFlowOnly();
            UserManagementP().verifyResetEmployeeButton();
        }catch (StaleElementReferenceException e) {
            validateAdminFlowOnly();
            UserManagementP().verifyResetEmployeeButton();
        }
    }

    public void validateAddButtonFlow() {
        validateAdminFlowOnly();
        UserManagementP().verifyAddUser();
    }

    public void validateDeleteButtonFlow(String url) {
        validateAdminFlow(url);
        UserManagementP().verifyDeleteUser();
    }
}
