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

WebUI.comment('Filter Merchant')

WebUI.click(findTestObject('FIND/ADMIN/Txn List/filter_Merchants'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/search_Merchant'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Txn List/checkbox_searchMerchant'), '01Seller')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_Apply'))

WebUI.delay(1)

WebUI.verifyTextPresent('01Seller', false)

WebUI.refresh()

WebUI.comment('Filter Category')

WebUI.click(findTestObject('FIND/ADMIN/Txn List/filter_Category'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/search_Category'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Txn List/search_Category'), 'Tuberculosis')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/checkbox_searchCategory'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Order Status')

WebUI.click(findTestObject('FIND/ADMIN/Txn List/filter_OrderStatus'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/checkbox_SelectAll'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/checkbox_Shipped'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Payment Status')

WebUI.click(findTestObject('FIND/ADMIN/Txn List/filter_PaymentStatus'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/checkbox_SelectAll'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/checkbox_Paid'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Shipping Status')

WebUI.click(findTestObject('FIND/ADMIN/Txn List/filter_ShippingStatus'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/checkbox_SelectAll'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/checkbox_InProcess'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Timestamp')

WebUI.setText(findTestObject('FIND/ADMIN/Txn List/filter_Timestamp'), '')

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_ApplyTimestamp'))

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

