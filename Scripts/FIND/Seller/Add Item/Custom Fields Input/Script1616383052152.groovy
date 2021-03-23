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

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/weight'), '.25')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Shelf life _txt-field'), 'Shelf life')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/p'), 'Independent evaluation')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Storage condition _txt-field'), 'Storage condition')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Transportation _txt-field'), 'Transportation')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Number of units Unit of measurement _txt-field'), 
    'Number of units/ Unit of measurement')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Volume _txt-field'), 'Volume')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Name of manufacturer _txt-field'), 'Name of manufacturer')

WebUI.click(findTestObject('FIND/SELLER/Add Item/Custom Fields/label_Procure directly from seller'))

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Intended User_txt-field'), 'Intended User')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Technology Principle_txt-field'), 'Technology Principle')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Antigen Target_txt-field'), 'Antigen Target')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Test Format_txt-field'), 'Test Format')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Performance_txt-field'), 'Performance')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Sample Type_txt-field'), 'Sample Type')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Number of Tests Per unit_txt-field'), 'Number of Tests Per unit')

WebUI.setText(findTestObject('FIND/SELLER/Add Item/Custom Fields/input_Packaging and Labelling_txt-field'), 'Packaging and Labelling')

