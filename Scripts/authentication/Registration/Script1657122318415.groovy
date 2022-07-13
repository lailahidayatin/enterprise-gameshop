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

WebUI.navigateToUrl(GlobalVariable.base_url)

WebUI.maximizeWindow()

'Looping negative case for failed regstration data'
for (def index : (1..5)) {
    WebUI.click(findTestObject('authentication/accountBtn'))

    WebUI.selectOptionByValue(findTestObject('authentication/registration/favoriteGenreField'), findTestData('registration_ddt').getValue(
            1, index), false)

    WebUI.selectOptionByValue(findTestObject('authentication/registration/favoriteConsoleField'), findTestData('registration_ddt').getValue(
            2, index), false)

    WebUI.selectOptionByValue(findTestObject('authentication/registration/hobbiesInterestField'), findTestData('registration_ddt').getValue(
            3, index), false)

    WebUI.check(findTestObject('authentication/registration/genderRadioBtn'))

    WebUI.setText(findTestObject('authentication/registration/emailField'), findTestData('registration_ddt').getValue(5, 
            index))

    WebUI.setText(findTestObject('authentication/registration/passwordField'), findTestData('registration_ddt').getValue(
            6, index))

    WebUI.setText(findTestObject('authentication/registration/confirmPasswordField'), findTestData('registration_ddt').getValue(
            7, index))

    WebUI.click(findTestObject('authentication/registration/registerBtn'))
}

'Positive case success registration data\n'
WebUI.click(findTestObject('authentication/accountBtn'))

WebUI.selectOptionByValue(findTestObject('authentication/registration/favoriteGenreField'), findTestData('registration_local_data').getValue(
        1, 1), false)

WebUI.selectOptionByValue(findTestObject('authentication/registration/favoriteConsoleField'), findTestData('registration_local_data').getValue(
        2, 1), false)

WebUI.selectOptionByValue(findTestObject('authentication/registration/hobbiesInterestField'), findTestData('registration_local_data').getValue(
        3, 1), false)

WebUI.check(findTestObject('authentication/registration/genderRadioBtn'))

WebUI.setText(findTestObject('authentication/registration/emailField'), findTestData('registration_local_data').getValue(
        5, 1))

WebUI.setText(findTestObject('authentication/registration/passwordField'), findTestData('registration_local_data').getValue(
        6, 1))

WebUI.setText(findTestObject('authentication/registration/confirmPasswordField'), findTestData('registration_local_data').getValue(
        7, 1))

WebUI.click(findTestObject('authentication/registration/registerBtn'))

