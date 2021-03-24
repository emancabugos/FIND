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
WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 'NTD', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), Keys.chord(Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/search_resulItem'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/search_resulItem'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Buyer Chat Details/a_ASK THE SELLER'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Buyer Chat Details/a_ASK THE SELLER'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(7)

WebUI.delay(10)

WebUI.setText(findTestObject('FIND/BUYER/Buyer Chat Details/textarea_type a message'), 'hi seller', FailureHandling.CONTINUE_ON_FAILURE)

msg = WebUI.getAttribute(findTestObject('FIND/BUYER/Buyer Chat Details/textarea_type a message'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('FIND/BUYER/Buyer Chat Details/textarea_type a message'), Keys.chord(Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

chatbub = WebUI.getText(findTestObject('FIND/BUYER/Buyer Chat Details/bubble_sentmessage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(chatbub, msg, false, FailureHandling.CONTINUE_ON_FAILURE)

