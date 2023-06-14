package org.ndviet.keyword;

import org.ndviet.library.TakeScreenshot;
import org.ndviet.library.spring.SpringHelpers;
import org.openqa.selenium.WebElement;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywordOverload;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.ndviet.library.TestObject.ObjectRepository.findTestObject;

@RobotKeywords
public class WebUI extends AnnotationLibrary {
    public WebUI() {
        super(Arrays.asList("org/ndviet/keyword/WebUI.class"));
        SpringHelpers.getInstance().getBean("WebElementIdentifier");
    }

    @RobotKeyword
    @ArgumentNames({"fileName="})
    public void capturePageScreenshot(String fileName) throws Exception {
        TakeScreenshot.capturePageScreenshot(fileName);
    }

    @RobotKeywordOverload
    @ArgumentNames({})
    public void capturePageScreenshot() throws Exception {
        TakeScreenshot.capturePageScreenshot(null);
    }

    @RobotKeyword
    @ArgumentNames({"fileName="})
    public void captureFullPageScreenshot(String fileName) throws Exception {
        TakeScreenshot.captureFullPageScreenshot(fileName);
    }

    @RobotKeywordOverload
    @ArgumentNames({})
    public void captureFullPageScreenshot() throws Exception {
        TakeScreenshot.captureFullPageScreenshot(null);
    }

    @RobotKeyword
    public void openBrowser(String url) throws Exception {
        org.ndviet.library.WebUI.openBrowser(url);
    }


    @RobotKeyword
    public void closeBrowser() {
        org.ndviet.library.WebUI.closeBrowser();
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public WebElement findWebElement(String objectID, Map variables) throws Exception {
        return org.ndviet.library.WebUI.findWebElement(findTestObject(objectID));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public WebElement findWebElement(String objectID) throws Exception {
        return org.ndviet.library.WebUI.findWebElement(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public List<WebElement> findWebElements(String objectID, Map variables) throws Exception {
        return org.ndviet.library.WebUI.findWebElements(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public List<WebElement> findWebElements(String objectID) throws Exception {
        return org.ndviet.library.WebUI.findWebElements(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void click(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.click(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void click(String objectID) throws Exception {
        org.ndviet.library.WebUI.click(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "absolutePath", "variables="})
    public void uploadFile(String objectID, String absolutePath, Map variables) throws Exception {
        org.ndviet.library.WebUI.uploadFile(findTestObject(objectID, variables), absolutePath);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "absolutePath"})
    public void uploadFile(String objectID, String absolutePath) throws Exception {
        org.ndviet.library.WebUI.uploadFile(findTestObject(objectID), absolutePath);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "text", "variables="})
    public void setText(String objectID, String text, Map variables) throws Exception {
        org.ndviet.library.WebUI.setText(findTestObject(objectID, variables), text);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "text"})
    public void setText(String objectID, String text) throws Exception {
        org.ndviet.library.WebUI.setText(findTestObject(objectID), text);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public String getText(String objectID, Map variables) throws Exception {
        return org.ndviet.library.WebUI.getText(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public String getText(String objectID) throws Exception {
        return org.ndviet.library.WebUI.getText(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID"})
    public List<String> getTexts(String objectID) throws Exception {
        return org.ndviet.library.WebUI.getTexts(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void verifyElementPresent(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.verifyElementPresent(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void verifyElementPresent(String objectID) throws Exception {
        org.ndviet.library.WebUI.verifyElementPresent(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void verifyElementNotPresent(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.verifyElementNotPresent(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void verifyElementNotPresent(String objectID) throws Exception {
        org.ndviet.library.WebUI.verifyElementNotPresent(findTestObject(objectID));
    }

    @RobotKeyword
    public void verifyElementHasAttribute() {

    }

    @RobotKeyword
    public void verifyElementNotHasAttribute() {

    }

    @RobotKeyword
    public void verifyElementAttributeValue() {

    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables", "expectValue="})
    public void verifyElementTextEquals(String objectID, Map variables, String expectText) throws Exception {
        org.ndviet.library.WebUI.verifyElementTextEquals(findTestObject(objectID, variables), expectText);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "expectValue="})
    public void verifyElementTextEquals(String objectID, String expectText) throws Exception {
        org.ndviet.library.WebUI.verifyElementTextEquals(findTestObject(objectID), expectText);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables", "expectValue="})
    public void verifyElementTextContains(String objectID, Map variables, String expectText) throws Exception {
        org.ndviet.library.WebUI.verifyElementTextContains(findTestObject(objectID, variables), expectText);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "expectValue="})
    public void verifyElementTextContains(String objectID, String expectText) throws Exception {
        org.ndviet.library.WebUI.verifyElementTextContains(findTestObject(objectID), expectText);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void verifyElementVisible(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.verifyElementVisible(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void verifyElementVisible(String objectID) throws Exception {
        org.ndviet.library.WebUI.verifyElementVisible(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void verifyElementNotVisible(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.verifyElementNotVisible(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void verifyElementNotVisible(String objectID) throws Exception {
        org.ndviet.library.WebUI.verifyElementNotVisible(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void moveToElement(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.moveToElement(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void moveToElement(String objectID) throws Exception {
        org.ndviet.library.WebUI.moveToElement(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void scrollToElement(String objectID, Map variables) throws Exception {
        org.ndviet.library.WebUI.scrollToElement(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void scrollToElement(String objectID) throws Exception {
        org.ndviet.library.WebUI.scrollToElement(findTestObject(objectID));
    }

}
