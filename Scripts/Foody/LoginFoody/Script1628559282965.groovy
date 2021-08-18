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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

String app = RunConfiguration.getProjectDir() + GlobalVariable.app

Mobile.startApplication(app, false)

//Path currentRelativePath = Paths.get("");
//def s = currentRelativePath.toAbsolutePath().toString();
//System.out.println("Current absolute path is: " + s);
//s = s + "\\Data Files\\foody.apk"
//System.out.println("Current absolute path is: " + s);
//Mobile.startApplication(s, false)
//Mobile.startApplication('C:\\Users\\user\\Katalon Studio\\Mobile Testing\\Data Files\\foody.apk', false)
Mobile.tapAndHold(findTestObject('Foody/Login/btn-ok'), 0, 0)

Mobile.tap(findTestObject('Foody/Login/lbl - profile'), 0)

Mobile.tap(findTestObject('Foody/Login/btn-login'), 0)

Mobile.tap(findTestObject('Foody/Login/btn-connect fb'), 0)

Mobile.setText(findTestObject('Foody/Login/txt-inputemail'), 'inputemail', 0)

Mobile.setEncryptedText(findTestObject('Foody/Login/txt-pass'), '/X0fKMoFo2pQrzvgNIPtsA==', 0)

Mobile.tap(findTestObject('Foody/Login/btn - masuk'), 0)

Mobile.tapAndHold(findTestObject('Foody/Login/btn - lanjutkan'), 0, 0)

Mobile.verifyElementText(findTestObject('Foody/Login/txt-name'), 'Christin Dengen')

