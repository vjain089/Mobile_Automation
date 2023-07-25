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

/*Use Case:
1. Launch the Freeform iOS app(com.apple.freefrom)
2. Tap on the New Board.
3. Tap on Add Sticky Notes.
4. Write a text.
5. Click on Done.
6. Delete the Sticky Notes.
7. Tap on Add shape
8. Tap on Animal
9. Tap on Horse.
10. Tap on Done.
11. Delete Horse.
12. Tap on the Add Text box.
13. Write a text.
14. Tap on Done.
15. Delete the Text box.
16 Close the app.*/
Mobile.startExistingApplication('com.apple.freeform')

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - New Board'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Add sticky note'), 0)

Mobile.setText(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeTextField - sticky note'), 'Mobile Automation', 
    0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeOther - sticky note'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Delete'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Add shape'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Animals'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeCell - Horse'), 0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeOther - Horse'), 0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Delete'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeButton - Add text box'), 0)

Mobile.setText(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeTextField - text box'), 'Demo Flow', 
    0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS_Freeform_Objects/XCUIElementTypeOther - text box'), 0)

Mobile.tap(findTestObject('IOS_Freeform_Objects/XCUIElementTypeButton - Delete'), 0)

Mobile.closeApplication()

