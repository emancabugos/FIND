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

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File currencyTmp = tmpDir.resolve('currency.txt').toFile()

File priceTmp = tmpDir.resolve('subtotal.txt').toFile()

File subtotalTmp = tmpDir.resolve('subtotal.txt').toFile()

WebUI.comment('Item Details Page')

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.selectOptionByLabel(findTestObject('FIND/BUYER/Checkout/textbox_qty'), '2', false)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/currency'), 0, FailureHandling.STOP_ON_FAILURE)

currency = WebUI.getText(findTestObject('FIND/BUYER/Checkout/currency'))

currencyTmp.text = currency

def itemprice = WebUI.getText(findTestObject('FIND/BUYER/Checkout/textvalue_actualPrice'))

priceTmp.text = itemprice

def quantity = WebUI.getAttribute(findTestObject('FIND/BUYER/Checkout/textbox_qty'), 'value')

def priceValue = itemprice.replace(',', '')

BigDecimal intitemprice = new BigDecimal(priceValue)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intitemprice * intquantity

def finalsub = df.format(new BigDecimal(subtotal))

subtotalTmp.text = finalsub

println(finalsub)

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_addToCartFIND'))

WebUI.comment('Cart')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/btn_view cart'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_view cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/btn_finalRequest'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_finalRequest'), FailureHandling.STOP_ON_FAILURE)
