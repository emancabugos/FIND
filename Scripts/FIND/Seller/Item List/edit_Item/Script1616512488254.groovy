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

WebUI.click(findTestObject('FIND/ADMIN/Items List/button_Edit'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Edit Item/textfield_ItemName'), 0)

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_ItemName'), '_EDIT')

itemname = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_ItemName'), 'value')

WebUI.setText(findTestObject('FIND/ADMIN/Edit Item/textfield_ItemPrice'), '1050')

itemprice = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_ItemPrice'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_SKU'), '_EDIT')

itemsku = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_SKU'), 'value')

WebUI.setText(findTestObject('FIND/ADMIN/Edit Item/textfield_Quantity'), '500')

itemqty = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_Quantity'), 'value')

WebUI.setText(findTestObject('FIND/ADMIN/Edit Item/textfield_Weight'), '1.50')

weight = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_Weight'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_ShelfLife'), '_EDIT')

shelflife = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_ShelfLife'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_PackagingLabel'), '_EDIT')

packaginglabel = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_PackagingLabel'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_StorageCondition'), '_EDIT')

storagecondition = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_StorageCondition'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_HSCode'), '_EDIT')

hscode = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_HSCode'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_Transportation'), '_EDIT')

transportation = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_Transportation'), 'value')

WebUI.setText(findTestObject('FIND/ADMIN/Edit Item/textfield_NumberofUnit'), '50')

numberofunit = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_NumberofUnit'), 'value')

WebUI.setText(findTestObject('FIND/ADMIN/Edit Item/textfield_Volume'), '50')

volume = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_Volume'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_Manufacturer'), '_EDIT')

manufucturer = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_Manufacturer'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_ContactPerson'), '_EDIT')

contactperson = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_ContactPerson'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_Email'), '_EDIT')

email = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_Email'), 'value')

WebUI.sendKeys(findTestObject('FIND/ADMIN/Edit Item/textfield_CountryManufacturer'), '_EDIT')

countrymanufucturer = WebUI.getAttribute(findTestObject('FIND/ADMIN/Edit Item/textfield_CountryManufacturer'), 'value')

WebUI.delay(1)

WebUI.click(findTestObject('FIND/ADMIN/Edit Item/button_Save'))

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Items List/button_Edit'), 0)

