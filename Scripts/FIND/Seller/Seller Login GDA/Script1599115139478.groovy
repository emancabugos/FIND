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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.GDAhomepageURL)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Login/textlink_SIGN IN'), 0)

if (WebUI.verifyElementPresent(findTestObject('FIND/SELLER/Login/btn_acceptCookies'), 2, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('FIND/SELLER/Login/btn_acceptCookies'))
} else {
    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.click(findTestObject('FIND/SELLER/Login/textlink_SIGN IN'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Login/btn_sign as seller'), 0)

WebUI.click(findTestObject('FIND/SELLER/Login/btn_sign as seller'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FIND/SELLER/Login/textbox_username'), GlobalVariable.sellerUsernameFIND)

WebUI.setText(findTestObject('FIND/SELLER/Login/textbox_password'), 'welcome8')

WebUI.click(findTestObject('FIND/SELLER/Login/btn_submit'), FailureHandling.CONTINUE_ON_FAILURE)

