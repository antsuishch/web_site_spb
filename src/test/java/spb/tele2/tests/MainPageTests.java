package spb.tele2.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spb.tele2.steps.WebMainSteps;

@DisplayName("Тесты для главной страницы сайта spb.tele2")
public class MainPageTests extends TestBase {

    final static WebMainSteps mainSteps = new WebMainSteps();

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

    @DisplayName("Отображение карточки тарифа \"Мой онлайн +\"")
    @Test
    void tariffCardsMyOnline() {
        mainSteps.openMainPage();
        mainSteps.scrollToCartridgeTariffs();
        mainSteps.myOnlinePlus();
    }

    @DisplayName("Отображение карточки тарифа \"Настройте свой \"")
    @Test
    void constructorCards() {
        mainSteps.openMainPage();
        mainSteps.scrollToCartridgeTariffs();
        mainSteps.constructorCartridge();
    }
}
