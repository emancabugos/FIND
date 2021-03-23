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

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Waiting List/Waiting List/linktext_Consumer'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Waiting List/linktext_Consumer'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Waiting List/Btn_Invite Consumer/btn_Invite Consumer'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Btn_Invite Consumer/btn_Invite Consumer'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Waiting List/Invite_merchant modal/textfield_invite'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Waiting List/Invite_merchant modal/textfield_invite'), 'qadianne@gmail.com')

WebUI.click(findTestObject('FIND/ADMIN/Waiting List/Invite_merchant modal/btn_Save'))

WebUI.verifyElementVisible(findTestObject('FIND/ADMIN/Waiting List/Invite_merchant modal/toaster_SuccessInvites have been successfully sent'), 
    FailureHandling.STOP_ON_FAILURE)

