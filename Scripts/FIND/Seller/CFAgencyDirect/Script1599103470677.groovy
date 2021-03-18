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

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/weight'), '.25')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/textarea_independent'), 'Independent evaluation')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/sheldf'), 'Shelf life')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/packaging'), 'Packaging & labeling ')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/storage'), 'Storage condition')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/hs code'), '001')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/transportation'), 'Transportation')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/number of units'), 'Number of units/ Unit of measurement')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/volume'), 'Volume')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/name of manu'), 'Name of manufacturer')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/contactPerson'), 'Adriana Ocampo')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/email'), 'arcadierteam1@gmail.com')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/country of manu'), 'Country of manufacturer')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/cbAustralia TGA'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/cbSingapore HSA'))

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/textarea_country'), 'Country registration')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/cbAgency'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Find/cbDirect'))

