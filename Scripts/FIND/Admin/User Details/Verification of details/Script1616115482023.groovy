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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://diagnostics.sandbox.arcadier.io/admin/')
WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_USer type'), 0)

String usertype = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_USer type'))

if (usertype == 'Merchant') {
    WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/User Details Page/icon_users'), 0)

    String displayname = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/VALUE textlabel_displayname'), FailureHandling.STOP_ON_FAILURE)

    String fname = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Fname'), FailureHandling.STOP_ON_FAILURE)

    String lname = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Lname'), FailureHandling.STOP_ON_FAILURE)

    String cnum = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Contact No'), FailureHandling.STOP_ON_FAILURE)

    def address = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value text_Address1'))
	
	def partName = address.split(/\s/)[1]
	println(partName);
	def partName = address.split(/\s/)[1]
	def partName = address.split(/\s/)[0]

    String sellerLoc = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Seller Location'), FailureHandling.STOP_ON_FAILURE)

    String notifemail = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Notifemail'), FailureHandling.STOP_ON_FAILURE)

    String customlogin = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value Textlabel_Custom Login'), FailureHandling.STOP_ON_FAILURE)

    String datejoined = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Date Joined'), FailureHandling.STOP_ON_FAILURE)

    String lastloggedin = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Last Logged In'), FailureHandling.STOP_ON_FAILURE)

    String payment1 = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Self funded'), FailureHandling.STOP_ON_FAILURE)

    String payment2 = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_COD'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyMatch(displayname, '01Seller', false)

    WebUI.verifyMatch(fname, 'Adriana', false)

    WebUI.verifyMatch(lname, 'Ocampo', false)

    WebUI.verifyMatch(cnum, '+63000001', false)

    WebUI.verifyMatch(sellerLoc, 'Myanmar', false)

    WebUI.verifyMatch(address, 'Serangoon North Singapore N/A Singapore 956425', false)

    WebUI.verifyMatch(notifemail, 'arcadier.tester1@gmail.com', false)

    WebUI.verifyMatch(customlogin, 'Custom Login', false)

    WebUI.verifyMatch(datejoined, '19/03/2021 14:11:54', false)

    WebUI.verifyMatch(lastloggedin, '9/03/2021 14:14:02', false)

    WebUI.verifyMatch(payment1, 'arcadier.tester1@gmail.com', false)

    WebUI.verifyMatch(payment2, 'arcadier.tester1@gmail.com', false) //WebUI.click(findTestObject('FIND/ADMIN/User Details Page/a_Change Password'))
    //WebUI.setText(findTestObject('FIND/ADMIN/User Details Page/textfield_Newpass'), 'welcome9')
    //WebUI.setText(findTestObject('FIND/ADMIN/User Details Page/textfield_ConfirmPass'), 'welcome9')
    // WebUI.click(findTestObject('FIND/ADMIN/User Details Page/button_Save'))
    // WebUI.delay(3)
    // WebUI.comment('ADMIN LOGOUT')
    //WebUI.callTestCase(findTestCase('FIND/Seller/Seller Login GDA'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('FIND/ADMIN/User Details Page/a_Change Password'))

    String newpass = 'welcome10'

    WebUI.setText(findTestObject('FIND/ADMIN/User Details Page/textfield_Newpass'), newpass)

    WebUI.setText(findTestObject('FIND/ADMIN/User Details Page/textfield_ConfirmPass'), newpass)

    WebUI.click(findTestObject('FIND/ADMIN/User Details Page/button_Save'))

    GlobalVariable.buyerPasswordFind = newpass

    WebUI.delay(3)

    WebUI.comment('insert ADMIN LOGOUT')

    WebUI.acceptAlert()

    WebUI.callTestCase(findTestCase('FIND/Admin/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (usertype == 'Consumer') {
    WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/User Details Page/icon_users'), 0)

    String displayname = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/VALUE textlabel_displayname'), FailureHandling.STOP_ON_FAILURE)

    String fname = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Fname'), FailureHandling.STOP_ON_FAILURE)

    String lname = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Lname'), FailureHandling.STOP_ON_FAILURE)

    String cnum = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Contact No'), FailureHandling.STOP_ON_FAILURE)

    String address = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value text_Address1'))

    def addresstrim = address.replace('').trim()

    String notifemail = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Notifemail'), FailureHandling.STOP_ON_FAILURE)

    String customlogin = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value Textlabel_Custom Login'), FailureHandling.STOP_ON_FAILURE)

    String datejoined = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Date Joined'), FailureHandling.STOP_ON_FAILURE)

    String lastloggedin = WebUI.getText(findTestObject('FIND/ADMIN/User Details Page/Value textlabel_Last Logged In'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyMatch(displayname, '01Buyer', false)

    WebUI.verifyMatch(fname, 'Mark', false)

    WebUI.verifyMatch(lname, 'Twain', false)

    WebUI.verifyMatch(cnum, '+63000001', false)

    WebUI.verifyMatch(notifemail, 'arcadierteam2@gmail.com', false)

    WebUI.verifyMatch('address', '', false)

    WebUI.verifyMatch(customlogin, 'Custom Login', false)

    WebUI.verifyMatch(datejoined, '28/09/2020 10:27:52', false)

    WebUI.verifyMatch(lastloggedin, '03/03/2021 08:44:56', false)

    WebUI.click(findTestObject('FIND/ADMIN/User Details Page/a_Change Password'))

    String newpass = 'welcome10'

    WebUI.setText(findTestObject('FIND/ADMIN/User Details Page/textfield_Newpass'), newpass)

    WebUI.setText(findTestObject('FIND/ADMIN/User Details Page/textfield_ConfirmPass'), newpass)

    WebUI.click(findTestObject('FIND/ADMIN/User Details Page/button_Save'))

    GlobalVariable.buyerPasswordFind = newpass

    WebUI.delay(3)

    WebUI.comment('insert ADMIN LOGOUT')

    WebUI.acceptAlert()

    WebUI.callTestCase(findTestCase('FIND/Admin/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)
}

