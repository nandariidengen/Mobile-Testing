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

Mobile.tap(findTestObject('Foody/Login/lbl - home'), 0)

Mobile.tap(findTestObject('Foody/Order/field-search-tap'), 0)

Mobile.setText(findTestObject('Foody/Order/txt-search'), 'ice cream', 0)

Mobile.scrollToText('Today Coffee & Ice Cream')

Mobile.tap(findTestObject('Foody/Order/lbl-name cafee'), 0)

actual = Mobile.getText(findTestObject('Foody/Order/txt - verify today'), 0)

Mobile.verifyMatch(actual, 'Today Coffee & Ice Cream', false)

Mobile.verifyElementVisible(findTestObject('Foody/Order/txt - opening'), 0)

Mobile.verifyElementVisible(findTestObject('Foody/Order/txt - time'), 0)

