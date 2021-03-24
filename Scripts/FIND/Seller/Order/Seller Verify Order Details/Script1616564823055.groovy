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

File currencyTmp = tmpDir.resolve('currency.txt').toFile()

File subtotalTmp = tmpDir.resolve('subtotal.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File reqIDTmp = tmpDir.resolve('requestID.txt').toFile()

File orderNoTmp = tmpDir.resolve('orderNo.txt').toFile()

String reqID = reqIDTmp.text.trim()

String currency = currencyTmp.text.trim()

String subtotal = subtotalTmp.text.trim()

String total = totalTmp.text.trim()

String orderNo = orderNoTmp.text.trim()

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/value_detailsInvoice'), 0)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_detailsInvoice'), reqID)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_detailsOrderNo'), orderNo)

WebUI.verifyOptionSelectedByLabel(findTestObject('FIND/SELLER/Order Details/dd_detailsOrderStatus'), 'Order request created', 
    false, 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('FIND/SELLER/Order Details/dd_detailsPaymentStatus'), 'N/A', false, 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('FIND/SELLER/Order Details/dd_detailsShippingStatus'), '-', false, 0)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_subtotal'), ('Subtotal' + currency) + subtotal)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_total'), currency + total)

