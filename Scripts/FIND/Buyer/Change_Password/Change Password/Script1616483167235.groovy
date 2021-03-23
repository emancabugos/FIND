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

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Login GDA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Change Password/icon_user image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Change Password/icon_user image'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Change Password/linktext_Change Password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Change Password/linktext_Change Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Change Password/input_Old Password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FIND/BUYER/Change Password/input_Old Password'), GlobalVariable.buyerPasswordFind, FailureHandling.CONTINUE_ON_FAILURE)

String newpass = 'welcome10'
WebUI.setText(findTestObject('FIND/BUYER/Change Password/input_New Password'), newPass, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FIND/BUYER/Change Password/input_Confirm New Password'), newpass, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Change Password/button_SAVE'))

//CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('FIND', 'buyerPasswordFind', 'welcome10')
GlobalVariable.buyerPasswordFind = newpass

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Login GDA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Change Password/icon_user image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

