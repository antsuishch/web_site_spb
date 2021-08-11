package cloud.autotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты для сайта spb.tele2")
public class PageTests {

    PageObjects.MainPage mainPage = new PageObjects.MainPage();
    PageObjects.TariffPage tariffPage = new PageObjects.TariffPage();

    @DisplayName("Переход на страницу тариф")
    @Test
    void checkPageTariff() {
        mainPage.mainPageTariff();
    }

    @DisplayName("Проверка страницы поиска")
    @Test
    void checkPageFind() {
        mainPage.checkFind();
    }

    @DisplayName("Отображение попапа")
    @Test
    void everywherePageOnline() {
        mainPage.popupTariff();
    }

    @DisplayName("Страница переноса номера")
    @Test
    void savePageNumber() {
        tariffPage.inputNumber();
    }

    @DisplayName("Переклчючение кнопок и появление popup")
    @Test
    void checkPageButton() {
        tariffPage.checkRadioButton();
    }
}
