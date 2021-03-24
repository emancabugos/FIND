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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Users List/textfield_Search'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Users List/textfield_Search'), '01Seller')

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_Apply'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('01Seller', false)

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_Delete'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Users List/button_DeletePopUp'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_DeletePopUp'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Users List/textfield_Search'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Users List/textfield_Search'), '01Seller')

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_Apply'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextNotPresent('01Seller', false)

