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

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File reqIDTmp = tmpDir.resolve('requestID.txt').toFile()

String reqID = reqIDTmp.text.trim()

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Login/seller_menu'), 0)

WebUI.mouseOver(findTestObject('FIND/SELLER/Login/seller_menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Login/textlink_orders'), 0)

WebUI.click(findTestObject('FIND/SELLER/Login/textlink_orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/search_invoice'), 0)

WebUI.setText(findTestObject('FIND/SELLER/Order Details/search_invoice'), reqID)

WebUI.click(findTestObject('FIND/SELLER/Order Details/icon_search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/textvalue_invoice'), 0)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/textvalue_invoice'), reqID)

WebUI.selectOptionByLabel(findTestObject('FIND/SELLER/Order Details/dd_orderStatus'), 'Quotation rejected', false)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/popup_btnOkay'), 0)

WebUI.click(findTestObject('FIND/SELLER/Order Details/popup_btnOkay'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyOptionSelectedByLabel(findTestObject('FIND/SELLER/Order Details/dd_orderStatus'), 'Quotation rejected', false, 
    0)

