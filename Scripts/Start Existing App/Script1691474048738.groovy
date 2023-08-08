import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startExistingApplication('com.abhiandroid.foodorderingindia')

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.TextView - Skip Login'), 0)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.LinearLayout'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/Android_Food_Order/android.widget.EditText - Search your food item'), 'Paneer Butter', 
    0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.Button - Add To Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.Button - ADD TO CART (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.Button - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Android_Food_Order/android.widget.EditText - Email Address'), 'vaibhav.jain@abc.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Android_Food_Order/android.widget.EditText - Password'), 'test@12343', 
    0)

Mobile.tap(findTestObject('Object Repository/Android_Food_Order/android.widget.Button - SIGN IN'), 0)

Mobile.closeApplication()