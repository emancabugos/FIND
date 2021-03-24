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
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Login GDA'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Buyer Inbox/linktext_Inbox'), 0)

WebUI.click(findTestObject('FIND/BUYER/Buyer Inbox/linktext_Inbox'))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Buyer Inbox/textlabel_INBOX'), 0)

WebUI.comment('search user')

WebUI.setText(findTestObject('FIND/BUYER/Buyer Inbox/textbox_INBOX_search-buyer'), 'gdasellerapril01')

searchbuyer = WebUI.getAttribute(findTestObject('FIND/BUYER/Buyer Inbox/textbox_INBOX_search-buyer'), 'value')

WebUI.sendKeys(findTestObject('FIND/BUYER/Buyer Inbox/textbox_INBOX_search-buyer'), Keys.chord(Keys.ENTER))

sellernamesearchresult = WebUI.getText(findTestObject('FIND/BUYER/Buyer Inbox/searchresult_sellername'))

WebUI.verifyMatch(sellernamesearchresult, searchbuyer, false)

WebUI.comment('search message')

WebUI.setText(findTestObject('FIND/BUYER/Buyer Inbox/textbox_INBOX_search-buyer'), 'hello')

searchmsg = WebUI.getAttribute(findTestObject('FIND/BUYER/Buyer Inbox/textbox_INBOX_search-buyer'), 'value')

WebUI.sendKeys(findTestObject('FIND/BUYER/Buyer Inbox/textbox_INBOX_search-buyer'), Keys.chord(Keys.ENTER))

searchmsgresult = WebUI.getText(findTestObject('FIND/BUYER/Buyer Inbox/searchresult_message'))

WebUI.verifyMatch(searchmsgresult, searchmsg, false)

