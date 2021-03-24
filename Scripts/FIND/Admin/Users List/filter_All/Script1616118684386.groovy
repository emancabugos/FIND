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

WebUI.comment('Filter User Type')

WebUI.click(findTestObject('FIND/ADMIN/Users List/filter_User'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Users List/search_UserType'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Users List/checkbox_Consumer'))

WebUI.delay(1)

WebUI.comment('Filter Date Joined')

WebUI.setText(findTestObject('FIND/ADMIN/Users List/textfield_DateJoined'), '17/03/2021 - 18/03/2021')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_ApplyDateCreated'))

WebUI.comment('Last Logged In')

WebUI.setText(findTestObject('FIND/ADMIN/Users List/textfield_DateJoined'), '17/03/2021 - 18/03/2021')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_ApplyLastLogin'))

WebUI.click(findTestObject('FIND/ADMIN/Users List/button_Apply'))

WebUI.waitForElementClickable(findTestObject('FIND/ADMIN/Users List/button_Delete'), 0)

WebUI.verifyElementPresent(findTestObject('FIND/ADMIN/Users List/button_Delete'), 0)

WebUI.verifyTextPresent('Consumer', false)

WebUI.verifyTextNotPresent('Merchant', false)

