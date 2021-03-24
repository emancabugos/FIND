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

WebUI.comment('welcome mail')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Welcome Mail'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

welcomeafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('start selling')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Start Selling'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

sellingafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('account suspended')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext__Account Suspended'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

suspendedafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Reset Password')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Reset Password'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

resetpassafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('New Order')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_New Order'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

neworderafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('received Order')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Received Order'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

receivedorderafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Order Pickup')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Order Pickup'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

orderpickupafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Order Shipped')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Order Shipped'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

ordershippedafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Acknowledged')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Acknowledged Order'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

acknowledgedafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Review Prompt')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Review Prompt'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

reviewpromptafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Offer from Seller')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Offer from Seller'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

offersellerafter = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('Offer Declined')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Offer Declined'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

offerdeclined = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('seller invite')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Seller Invite'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

sellerinvite = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('buyer invite')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Buyer Invite'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

buyerinvite = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('message from seller')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Msg from Seller'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

msgseller = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('message from buyer')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Msg from Buyer'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

msgbuyer = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('invitesub')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Invite Sub Account'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

invitesub = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('stocklow')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Stock Low'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

stocklow = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('buyerfund')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Buyer Fund'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

buyerfund = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

WebUI.comment('paymentrel')

WebUI.click(findTestObject('FIND/ADMIN/Email template/linktext_Payment Released'))

WebUI.waitForElementPresent(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 0)

before = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Email template/input_Email Subject'), 'edit')

paymentrel = WebUI.getText(findTestObject('FIND/ADMIN/Email template/input_Email Subject'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/a_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Email template/toaster message_Save'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Mail Logs/a_Email Notifications'))

WebUI.click(findTestObject('FIND/ADMIN/Email template/submenu_Email template'))

