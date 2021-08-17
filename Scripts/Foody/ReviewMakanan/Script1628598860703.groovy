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

Mobile.tap(findTestObject('Foody/Review/lbl - review'), 0)

Mobile.verifyElementText(findTestObject('Foody/Review/txt - verify today'), 'Today Coffee & Ice Cream')

Mobile.setText(findTestObject('Foody/Review/txt-title'), 'Taste', 0)

Mobile.setText(findTestObject('Foody/Review/txt-description'), 
    'This is my favorite', 0)

Mobile.tap(findTestObject('Foody/Review/btn-post'), 0)

Mobile.tap(findTestObject('Foody/Review/btn-rate'), 0)

Mobile.tap(findTestObject('Foody/Review/txt-person'), 0)

Mobile.tap(findTestObject('Foody/Review/check-person'), 0)

Mobile.tap(findTestObject('Foody/Review/txt-expense'), 0)

Mobile.tap(findTestObject('Foody/Review/check-expense'), 0)

Mobile.tap(findTestObject('Foody/Review/txt-comeback'), 0)

Mobile.tap(findTestObject('Foody/Review/check-comeback'), 0)

Mobile.setSliderValue(findTestObject('Foody/Review/slider-location'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/slider-price'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/slider-quality'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/slider-service'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/slider-decoration'), 70, 0)

Mobile.tap(findTestObject('Foody/Review/btn-done'), 0)

Mobile.tap(findTestObject('Foody/Review/btn-post'), 0)

Mobile.tap(findTestObject('Foody/Review/btn-close'), 0)

Mobile.verifyElementText(findTestObject('Foody/Review/txt-verify-title'), 'Taste')

Mobile.verifyElementText(findTestObject('Foody/Review/txt-verify-desc'), 'This is my favorite')

Mobile.verifyElementVisible(findTestObject('Foody/Review/txt-verify-translation'), 0)

Mobile.verifyElementVisible(findTestObject('Foody/Review/btn-verify-like'), 0)

