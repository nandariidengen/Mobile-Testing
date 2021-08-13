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

Mobile.tap(findTestObject('Foody/Review/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Foody/Review/android.widget.EditText - Title (optional) (1)'), 'Taste', 0)

Mobile.setText(findTestObject('Foody/Review/android.widget.EditText - Please review more than 100 words, do not spam to get reward points (2)'), 
    'This is my favorite', 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - Post'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - Rate'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - No. person'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.CheckedTextView - 8'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - Expense'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.CheckedTextView - 500,000'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - Come back'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.CheckedTextView - Sure'), 0)

Mobile.setSliderValue(findTestObject('Foody/Review/android.widget.SeekBar'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/android.widget.SeekBar (1)'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/android.widget.SeekBar (2)'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/android.widget.SeekBar (3)'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Review/android.widget.SeekBar (4)'), 70, 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - Done'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.TextView - Post'), 0)

Mobile.tap(findTestObject('Foody/Review/android.widget.Button - Close'), 0)

Mobile.verifyElementText(findTestObject('Foody/Review/android.widget.TextView - Taste'), 'Taste')

Mobile.verifyElementText(findTestObject('Foody/Review/android.widget.TextView - This is my favorite'), 'This is my favorite')

Mobile.verifyElementVisible(findTestObject('Foody/Review/android.widget.TextView - View translations'), 0)

Mobile.verifyElementVisible(findTestObject('Foody/Review/android.widget.TextView - Like'), 0)

