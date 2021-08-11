package spb.tele2.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spb.tele2.pages.MainPage;

@DisplayName("Тесты для Главной страницы")
public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @DisplayName("Переход на страницу тариф")
    @Test
    void goPageTariff() {
        mainPage.mainPageTariff();
    }

    @DisplayName("Проверка страницы поиска")
    @Test
    void checkFindPage() {
        mainPage.checkFind();
    }

    @DisplayName("Переклчючение кнопок и появление popup")
    @Test
    void checkButtonPopup() {
        mainPage.popupTariff();
    }

}
