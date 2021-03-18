import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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

File priceTmp = tmpDir.resolve('subtotal.txt').toFile()

File subtotalTmp = tmpDir.resolve('subtotal.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

File deliveryTmp = tmpDir.resolve('delivery.txt').toFile()

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Login GDA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 0)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 'GDA(AgencyFIND)')

itemName = WebUI.getAttribute(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), 'value')

itemNameTmp.text = itemName

WebUI.sendKeys(findTestObject('FIND/BUYER/Checkout/searchbox_homepage'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/search_resulItem'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/search_resulItem'))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/textbox_qty'), 0)

WebUI.comment('Item Details Page')

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.setText(findTestObject('FIND/BUYER/Checkout/textbox_qty'), '2')

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

WebUI.comment('Checkout - Delivery Page')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/icon_selectAddress'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/icon_selectAddress'))

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_NEXTshipping'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/dd_shippingMethod                                                                                                                                                Sea freight (cold chain) (USD 000)'), 
    0)

WebUI.selectOptionByIndex(findTestObject('FIND/BUYER/Checkout/dd_shippingMethod                                                                                                                                                Sea freight (cold chain) (USD 000)'), 
    '6', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/textbox_needByDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/Need By Date/21'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/Need By Date/21'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/Need By Date/25'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/Need By Date/btn_apply'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/text_itemName'), itemName)

String subtotalValue = subtotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_subtotalReview'), subtotalValue)

shippingCost = WebUI.getText(findTestObject('FIND/BUYER/Checkout/textvalue_shippinCostReview'), FailureHandling.CONTINUE_ON_FAILURE)

deliveryTmp.text = shippingCost

def finalSubValue = finalsub.replace(',', '')

BigDecimal intsubtotal = new BigDecimal(finalSubValue)

BigDecimal intshippingCost = new BigDecimal(shippingCost)

def finalTotal = intshippingCost + intsubtotal

totalTmp.text = finalTotal

String totalValue = totalTmp.text.trim()

WebUI.verifyElementText(findTestObject('FIND/BUYER/Checkout/textvalue_totalReview'), totalValue)

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_PROCEED TO PAYMENT'))

WebUI.comment('Payment Page')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/dd_paymentMethod'), 0)

WebUI.selectOptionByLabel(findTestObject('FIND/BUYER/Checkout/dd_paymentMethod'), 'Self-Funded', false)

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_ORDER NOW'))

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/btn_Purchase order history'), 0)

invoice = WebUI.getText(findTestObject('FIND/BUYER/Checkout/textvalue_invoice'))

invoiceTmp.text = invoice

WebUI.callTestCase(findTestCase('FIND/Buyer/Buyer Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FIND/Buyer/Verify PO Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FIND/Seller/Seller Verify Order'), [:], FailureHandling.CONTINUE_ON_FAILURE)

