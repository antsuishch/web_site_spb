package spb.tele2.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spb.tele2.pages.TariffPage;

@DisplayName("Тесты для страницы с Тарифами")
public class TariffPageTests extends TestBase {

    TariffPage tariffPage = new TariffPage();

    @DisplayName("Отображение попапа")
    @Test
    void popupViewText() {
        tariffPage.checkRadioButton();
    }

    @DisplayName("Отображение номера")
    @Test
    void viewNumber() {
        tariffPage.inputNumber();
    }

}
