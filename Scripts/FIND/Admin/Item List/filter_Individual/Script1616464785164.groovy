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

WebUI.click(findTestObject('FIND/ADMIN/Items List/filter_Merchant'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Items List/search_Merchant'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Items List/search_Merchant'), '01Seller')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_Apply'))

WebUI.delay(1)

WebUI.verifyTextPresent('01Seller', false)

WebUI.refresh()

WebUI.comment('Filter Category')

WebUI.click(findTestObject('FIND/ADMIN/Items List/filter_Category'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Items List/search_Category'), 0)

WebUI.setText(findTestObject('FIND/ADMIN/Items List/search_Category'), 'Tuberculosis')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/checkbox_Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Stock')

WebUI.click(findTestObject('FIND/ADMIN/Items List/filter_Stock'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Items List/checkbox_Purchasable'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/checkbox_Purchasable'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Date Created')

WebUI.setText(findTestObject('FIND/ADMIN/Items List/filter_DateCreated'), '')

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_ApplyDateCreated'))

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

WebUI.comment('Filter Last Updated')

WebUI.setText(findTestObject('FIND/ADMIN/Items List/filter_LastUpdated'), '')

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_ApplyLastUpdated'))

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_Apply'))

WebUI.delay(1)

WebUI.refresh()

