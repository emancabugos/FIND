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

File sellerTotalTmp = tmpDir.resolve('sellerTotal.txt').toFile()

File orderNoTmp = tmpDir.resolve('orderNo.txt').toFile()

WebUI.callTestCase(findTestCase('FIND/Admin/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/sidemenu_Transactions'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/sidemenu_Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/sidemenu_Transaction List'), 0)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/sidemenu_Transaction List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/textbox_search'), 0)

String invoice = invoiceTmp.text.trim()

String orderNo = orderNoTmp.text.trim()

WebUI.setText(findTestObject('FIND/ADMIN/Txn List/textbox_search'), invoice)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/btn_apply'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/ADMIN/Txn List/textvalue_invoiceList'), 0)

WebUI.verifyElementText(findTestObject('FIND/ADMIN/Txn List/textvalue_invoiceList'), invoice)

WebUI.verifyElementText(findTestObject('FIND/ADMIN/Txn List/textvalue_OrderIDList'), orderNo)

WebUI.click(findTestObject('FIND/ADMIN/Txn List/textvalue_OrderIDList'), FailureHandling.CONTINUE_ON_FAILURE)

