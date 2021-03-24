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

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Your Items/header_yourItems'), 0)

WebUI.click(findTestObject('FIND/SELLER/Your Items/header_yourItems'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FIND/SELLER/Your Items/item_searchbox'), 'NTD DIAGNOSTICS')

WebUI.sendKeys(findTestObject('FIND/SELLER/Your Items/item_searchbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Your Items/item_name'), 0)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Your Items/item_name'), 'NTD DIAGNOSTICS')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Your Items/item_editIcon'), 0)

WebUI.click(findTestObject('FIND/SELLER/Your Items/item_editIcon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/btn_productBundling'), 0)

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/btn_productBundling'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/item_searchbox'), 0)

WebUI.setText(findTestObject('FIND/SELLER/Product Bundling/item_searchbox'), 'MALARIA DIAGNOSTICS')

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/icon_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), 0)

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FIND/SELLER/Product Bundling/item_searchbox'), 'DIABETES DIAGNOSTICS')

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/icon_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), 0)

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FIND/SELLER/Product Bundling/item_searchbox'), 'TUBERCULOSIS DIAGNOSTICS')

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/icon_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), 0)

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FIND/SELLER/Product Bundling/item_searchbox'), 'HEPATITIS C & HIV DIAGNOSTICS')

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/icon_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), 0)

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/cb_1st item'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Product Bundling/btn_save'), 0)

WebUI.click(findTestObject('FIND/SELLER/Product Bundling/btn_save'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Save')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/button_SAVE'), 0)

WebUI.click(findTestObject('FIND/SELLER/Add Item/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/btn_add item'), 0)

