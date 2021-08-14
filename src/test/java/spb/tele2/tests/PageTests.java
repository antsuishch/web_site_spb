package spb.tele2.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spb.tele2.steps.WebConnectTariffSteps;
import spb.tele2.steps.WebMainSteps;

@DisplayName("Тесты для сайта spb.tele2")
public class PageTests extends TestBase {

    final WebMainSteps mainSteps = new WebMainSteps();

    @DisplayName("Переход на страницу Тарифы")
    @Test
    void goToPageTariff() {
        mainSteps.openMainPage();
        mainSteps.clickTariff();
        mainSteps.checkText();
        mainSteps.checkCartridge();
    }

    @DisplayName("Проверка страницы поиска")
    @Test
    void checkPageFind() {
        mainSteps.openMainPage();
        mainSteps.clickButtonFind();
        mainSteps.inputValueText();
        mainSteps.checkResults();
        mainSteps.checkInformationTariff();
    }

    @DisplayName("Тест на отображение попапа")
    @Test
    void checkPopup() {
        mainSteps.openMainPage();
        mainSteps.scrollToElementsAndClick();
        mainSteps.checkViewPopup();
        mainSteps.checkTextPopup();
    }

    @DisplayName("Общее отображение карточек тарифа")
    @Test
    void tariffCards() {
        mainSteps.openMainPage();
        mainSteps.scrollToCartridgeTariffs();
        mainSteps.visibleCartridgesTariff();
    }

    @DisplayName("Отображение карточки тарифа \"Везде онлайн\"")
    @Test
    void tariffCardsEverWhereOnline() {
        mainSteps.openMainPage();
        mainSteps.scrollToCartridgeTariffs();
        mainSteps.everWhereOnline();
    }

    final WebConnectTariffSteps webConnectTariffSteps = new WebConnectTariffSteps();

    @DisplayName("Проверка на появление текста об ошибке при вводе некорректного номера")
    @Test
    void incorrectNumberErrorText() {
        webConnectTariffSteps.openConnectTariffPage();
        webConnectTariffSteps.checkHeaderConnectTariffPage();
        webConnectTariffSteps.inputIncorrectNumberPhone();
        webConnectTariffSteps.checkTextError();
    }

    @DisplayName("Проверка кнопок на странице")
    @Test
    void checkButtonConnectTariffPage() {
        webConnectTariffSteps.openConnectTariffPage();
        webConnectTariffSteps.scrollToRadioButtons();
        webConnectTariffSteps.clickRadioButtonEsim();
        webConnectTariffSteps.clickMoreDetails();
        webConnectTariffSteps.checkViewPopupAfterClickMore();
        webConnectTariffSteps.checkTextPopupAfterClickMore();
    }
}
