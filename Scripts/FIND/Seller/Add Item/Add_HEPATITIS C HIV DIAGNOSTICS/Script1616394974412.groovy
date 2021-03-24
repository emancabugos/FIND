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

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Seller Header/a_Add Item'), 0)

WebUI.click(findTestObject('FIND/SELLER/Seller Header/a_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/input_ITEM NAME'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/input_ITEM NAME'), 'HEPATITIS C & HIV DIAGNOSTICS')

WebUI.comment('Categories')

WebUI.click(findTestObject('FIND/SELLER/Add Item/Category/cat_HEPATITIS C HIV DIAGNOSTICS'))

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/input_PRICE'), 0)

WebUI.setText(findTestObject('FIND/SELLER/Add Item/input_PRICE'), '250.25')

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/input_ID'), 0)

WebUI.setText(findTestObject('FIND/SELLER/Add Item/input_ID'), 'GDA003')

WebUI.comment('Item Description')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/textarea_ITEM DESCRIPTION'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.click(findTestObject('FIND/SELLER/Add Item/button_BROWSE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('FIND/SELLER/Add Item/Image Upload/image_container'), 'C:\\\\Katalon\\\\FIND\\\\Images\\\\UN Items\\\\item3.jpg')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/Image Upload/btn_ok'), 0)

WebUI.click(findTestObject('FIND/SELLER/Add Item/Image Upload/btn_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Stocks')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/input_QUANTITY'), '5000')

WebUI.comment('Custom Fields')

WebUI.callTestCase(findTestCase('FIND/Seller/Add Item/Custom Fields Input'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('Save')

WebUI.click(findTestObject('FIND/SELLER/Add Item/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/btn_add item'), 0)

