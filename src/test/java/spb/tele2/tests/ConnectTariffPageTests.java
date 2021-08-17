package spb.tele2.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spb.tele2.steps.WebConnectTariffSteps;

@DisplayName("Тесты для страницы connect/Tariff")
public class ConnectTariffPageTests extends TestBase {

    final static WebConnectTariffSteps webConnectTariffSteps = new WebConnectTariffSteps();

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
