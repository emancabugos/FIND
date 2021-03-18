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

WebUI.comment('Profile')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/onboardingProfile/btn_change'), 0)

WebUI.click(findTestObject('FIND/SELLER/onboardingProfile/btn_change'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('FIND/SELLER/onboardingProfile/put_image'), 'C:/Katalon/Core/Images/SellerPhoto/1.png')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/onboardingProfile/btn_crop'), 0)

WebUI.click(findTestObject('FIND/SELLER/onboardingProfile/btn_crop'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/onboardingProfile/btn_Save Photo'), 0)

WebUI.click(findTestObject('FIND/SELLER/onboardingProfile/btn_Save Photo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/onboardingProfile/textbox_DisplayName'), 0)

WebUI.setText(findTestObject('FIND/SELLER/onboardingProfile/textbox_DisplayName'), '01Buyer')

WebUI.selectOptionByLabel(findTestObject('FIND/BUYER/Onboarding/dd_buyerType'), 'Private Sector', false)

WebUI.setText(findTestObject('FIND/SELLER/onboardingProfile/textbox_personInCharge'), 'Mark Twain')

WebUI.setText(findTestObject('FIND/SELLER/onboardingProfile/textbox_companyName'), 'Buyer Company')

WebUI.setText(findTestObject('FIND/SELLER/onboardingProfile/textbox_jobTitle'), 'Buyer')

WebUI.verifyElementAttributeValue(findTestObject('FIND/SELLER/onboardingProfile/textbox_email'), 'value', GlobalVariable.sellerNotifEmailFIND, 
    0)

WebUI.setText(findTestObject('FIND/SELLER/onboardingProfile/textbox_contacNo'), '+63000001')

WebUI.click(findTestObject('FIND/SELLER/onboardingProfile/btn_nextProfile'))

WebUI.comment('Address')

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/onboardingAddress/textbox_alternativeContactPerson'), 0)

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_alternativeContactPerson'), 'Adriana Ocampo')

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_alternativeContactNumber'), '+63000001')

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_alternativeEmail'), GlobalVariable.sellerNotifEmailFIND)

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_address'), 'Pagoda Rd, Bago')

WebUI.selectOptionByLabel(findTestObject('FIND/SELLER/onboardingAddress/dd_country'), 'Myanmar', false)

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_state'), 'Burma')

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_city'), 'Bago')

WebUI.setText(findTestObject('FIND/SELLER/onboardingAddress/textbox_postal code'), '11081')

WebUI.click(findTestObject('FIND/BUYER/Onboarding/btn_address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Onboarding/address_contain'), 0)

WebUI.click(findTestObject('FIND/BUYER/Onboarding/btn_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

