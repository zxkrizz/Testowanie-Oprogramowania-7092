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

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/eurortv/akceptowanie_cookies'))
WebUI.click(findTestObject('Object Repository/eurortv/zaloz_konto'))

/* WebUI.click(findTestObject('Object Repository/eurortv/zaloz_nowe_konto')) */  /* - uwaga, różnie się strona otwiera (na pierwsze kilka razy jest ta linijka nie potrzebna, później może byc potrzebna! */

WebUI.setText(findTestObject('Object Repository/eurortv/imie'), imie)
WebUI.setText(findTestObject('Object Repository/eurortv/nazwisko'), nazwisko)
WebUI.setText(findTestObject('Object Repository/eurortv/email'), email)
WebUI.setText(findTestObject('Object Repository/eurortv/haslo'), haslo)
WebUI.setText(findTestObject('Object Repository/eurortv/haslo_potwierdzenie'), haslo)

WebUI.click(findTestObject('Object Repository/eurortv/zarejestruj'))

String error = WebUI.getText(findTestObject('Object Repository/eurortv/komunikat_bledu'))
assert komunikat == error


