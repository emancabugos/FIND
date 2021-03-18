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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 'COVID(AgencyDirect)')

WebUI.comment('Categories')

WebUI.click(findTestObject('FIND/SELLER/Add Item/Category/cb_covid19'))

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), '1500.20')

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 'COVID001')

WebUI.comment('Item Description')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_item-description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Utilities/Image Cropper/image_container'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item1.jpg')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Stocks')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), '5000')

WebUI.comment('Custom Fields')

WebUI.callTestCase(findTestCase('FIND/Seller/CFAgencyDirect'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('Save')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Add Item/btn_add item'), 0)

