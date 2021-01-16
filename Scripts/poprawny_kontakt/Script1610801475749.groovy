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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.befuture.pl/kontakt/')

WebUI.setText(findTestObject('Object Repository/Page_Agencja reklamowa Gosty - kontakt  bef_cca1fb/input_kontaktowy_text-240'), 
    'Adam Nowak')

WebUI.setText(findTestObject('Object Repository/Page_Agencja reklamowa Gosty - kontakt  bef_cca1fb/input_kontaktowy_email-353'), 
    'test@test.pl')

WebUI.setText(findTestObject('Object Repository/Page_Agencja reklamowa Gosty - kontakt  bef_cca1fb/textarea_kontaktowy_textarea-437'), 
    'przeprowadzam test do szkoly')

WebUI.click(findTestObject('Object Repository/Page_Agencja reklamowa Gosty - kontakt  bef_cca1fb/span_Rozumiem informacj o przetwarzaniu dan_0c6469'))

WebUI.click(findTestObject('Object Repository/Page_Agencja reklamowa Gosty - kontakt  bef_cca1fb/input_polityk prywatnoci_wpcf7-form-control_070e15'))

WebUI.click(findTestObject('Object Repository/Page_Dzikujemy za przesanie wiadomoci - bef_8c7db2/li_Wr do strony gwnej'))

WebUI.closeBrowser()

