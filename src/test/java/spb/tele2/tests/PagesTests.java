package spb.tele2.tests;

import spb.tele2.pages.MainPage;
import spb.tele2.pages.TariffPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Тесты для сайта spb.tele2")
public class PagesTests extends TestBase {

    MainPage mainPage = new MainPage();
    TariffPage tariffPage = new TariffPage();


    @DisplayName("Переход на страницу тариф")
    @Test
    void goTariffPage() {
        mainPage.mainPageTariff();
    }

    @DisplayName("Проверка страницы поиска")
    @Test
    void checkFindPage() {
        mainPage.checkFind();
    }

    @DisplayName("Отображение попапа")
    @Test
    void popupViewPage() {
        mainPage.popupTariff();
    }

    @DisplayName("Страница переноса номера")
    @Test
    void removeNumberPage() {
        tariffPage.inputNumber();
    }

    @DisplayName("Переклчючение кнопок и появление popup")
    @Test
    void chekButtonPage() {
        tariffPage.checkRadioButton();
    }
}
