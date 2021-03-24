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
import org.openqa.selenium.Keys as Keys

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 'NTD DIAGNOSTICS')

itemName = WebUI.getAttribute(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 'value')

WebUI.sendKeys(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/search_resulItem'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/search_resulItem'))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/textlink_Do you have product'), 0)

WebUI.click(findTestObject('FIND/BUYER/Merchant Storefront/textlink_Do you have product'))

