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
File totalTmp = tmpDir.resolve('total.txt').toFile()

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('FIND/BUYER/Checkout/textbox_needByDate'), 0)

WebUI.click(findTestObject('FIND/BUYER/Checkout/textbox_needByDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/Need By Date/today_active'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/Need By Date/last_day'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FIND/BUYER/Checkout/Need By Date/btn_apply'), FailureHandling.CONTINUE_ON_FAILURE)

def valueTotal = WebUI.getText(findTestObject('FIND/BUYER/Checkout/value_total'))

totalTmp.text = valueTotal

WebUI.click(findTestObject('FIND/BUYER/Checkout/btn_FInalize'))

