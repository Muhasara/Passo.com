import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.passo.com.tr/tr/giris')

//WebUI.navigateToUrl('https://www.passo.com.tr/tr/giris')
WebUI.delay(2)

WebUI.click(findTestObject('Elements/cokieClose'))

WebUI.delay(2)

WebUI.click(findTestObject('Elements/popupClose'))

WebUI.setText(findTestObject('Elements/email'), 'gsmurat12@yandex.com')

WebUI.setText(findTestObject('Object Repository/Elements/password'), '19051905Ma')

WebUI.click(findTestObject('Object Repository/Elements/login'))

WebUI.navigateToUrl('https://www.passo.com.tr/tr/kombine/fenerbahce-fb-kombine-mac-biletleri/134727')

WebUI.click(findTestObject('Object Repository/Elements/buy'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Elements/type'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Elements/birthDay'), '08.06.1984')

int i = 20369

for (i; i < 20371; i++) {
    WebUI.setText(findTestObject('Object Repository/Elements/sicilNo'), String.valueOf(i))

    WebUI.click(findTestObject('Object Repository/Elements/continue'))

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Elements/errorPopupClose'), 5) == false) {
        WebUI.setText(GlobalVariable.sicilNo, String.valueOf(i))

        break
    } else {
        WebUI.click(findTestObject('Object Repository/Elements/errorPopupClose'))
    }
    
    WebUI.clearText(findTestObject('Object Repository/Elements/sicilNo'))
}