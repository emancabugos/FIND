import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Waiting List/Waiting List/linktext_Merchant'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/dd_AllInterestedInvited'))

WebUI.selectOptionByValue(findTestObject('FIND/ADMIN/Waiting List/Waiting List/dd_AllInterestedInvited'), 'All', false)

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/button_Search'))

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/dd_AllInterestedInvited'))

WebUI.selectOptionByValue(findTestObject('FIND/ADMIN/Waiting List/Waiting List/dd_AllInterestedInvited'), 'Interested', 
    false)

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/button_Search'))

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/dd_AllInterestedInvited'))

WebUI.selectOptionByValue(findTestObject('FIND/ADMIN/Waiting List/Waiting List/dd_AllInterestedInvited'), 'Invited', false)

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/button_Search'))

