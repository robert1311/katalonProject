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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/span_Username'))

WebUI.setText(findTestObject('Object Repository/TimesheetsLL_OR/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TimesheetsLL_OR/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/img'))

WebUI.setText(findTestObject('Object Repository/TimesheetsLL_OR/input__timeemployeeName'), 'cdnu')

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/input__btnView'))

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/ol_Employee Name                         In_632ce6'))

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/span_Invalid'))

WebUI.doubleClick(findTestObject('Object Repository/TimesheetsLL_OR/span_Invalid'))

WebUI.verifyElementText(findTestObject('Object Repository/TimesheetsLL_OR/span_Invalid'), 'Invalid')

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/a_Welcome Paul'))

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/a_Logout'))

WebUI.click(findTestObject('Object Repository/TimesheetsLL_OR/div_LOGIN Panel                            _c4431b'))

WebUI.verifyElementText(findTestObject('Object Repository/TimesheetsLL_OR/div_LOGIN Panel'), 'LOGIN Panel')

