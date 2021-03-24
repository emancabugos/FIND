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

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 0)

WebUI.setText(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 'DIABETES DIAGNOSTICS')

WebUI.sendKeys(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 0)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 'DIABETES DIAGNOSTICS')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 0)

WebUI.setText(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 'HEPATITIS C & HIV DIAGNOSTICS')

WebUI.sendKeys(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 0)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 'HEPATITIS C & HIV DIAGNOSTICS')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 0)

WebUI.setText(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 'MALARIA DIAGNOSTICS')

WebUI.sendKeys(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 0)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 'MALARIA DIAGNOSTICS')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 0)

WebUI.setText(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 'NTD DIAGNOSTICS')

WebUI.sendKeys(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 0)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 'NTD DIAGNOSTICS')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 0)

WebUI.setText(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), 'TUBERCOLOSIS DIAGNOSTICS')

WebUI.sendKeys(findTestObject('FIND/BUYER/Merchant Storefront/item_searchbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 0)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Merchant Storefront/item_name'), 'TUBERCOLOSIS DIAGNOSTICS')

