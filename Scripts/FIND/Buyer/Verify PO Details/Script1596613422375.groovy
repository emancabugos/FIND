import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// create directory to locate a temporary file
Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File itemNameTmp = tmpDir.resolve('itemName.txt').toFile()

File priceTmp = tmpDir.resolve('subtotal.txt').toFile()

File currencyTmp = tmpDir.resolve('currency.txt').toFile()

File subtotalTmp = tmpDir.resolve('subtotal.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

File deliveryTmp = tmpDir.resolve('delivery.txt').toFile()

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Login COVID'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Usermenu/usermenu'), 0)

WebUI.mouseOver(findTestObject('FIND/BUYER/Usermenu/usermenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Usermenu/tex_purchase'), 0)

WebUI.click(findTestObject('FIND/BUYER/Usermenu/tex_purchase'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/textbox_searchInvoice'), 0)

String invoice = invoiceTmp.text.trim()

WebUI.setText(findTestObject('FIND/BUYER/Checkout/textbox_searchInvoice'), invoice)

WebUI.click(findTestObject('FIND/BUYER/Checkout/icon_searchPO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/textvalue_invoicePO'), 0)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_invoicePO'), invoice)

WebUI.click(findTestObject('FIND/BUYER/Checkout/textvalue_invoicePO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/textlabel_paymentStatusPO'), 0)

String total = totalTmp.text.trim()

String currency = currencyTmp.text.trim()

def dftotal = df.format(new BigDecimal(total))

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_totalPO'), currency + dftotal)

String subtotal = subtotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_subtotalPO'), currency + subtotal)

String delivery = deliveryTmp.text.trim()

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_deliveryPO'), (currency + ' ') + delivery)

def subtotalValue = subtotal.replace(',', '')

def deliveryValue = delivery.replace(',', '')

BigDecimal intsubtotal = new BigDecimal(subtotalValue)

BigDecimal intdelivery = new BigDecimal(deliveryValue)

def Finaltotal = intsubtotal + intdelivery

def dfFinaltotal = df.format(new BigDecimal(Finaltotal))

println (dfFinaltotal)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_totalPO'), currency + dfFinaltotal)

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

