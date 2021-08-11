package cloud.autotests.tests.pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TariffPage {
    String openPageTariff = "https://spb.tele2.ru/connectTariff",
            textLocators = "Перейти в Tele2",
            connectLocators = ".connect-header",
            valueLocator = "#mnpNumber",
            errorTextLocator = ".error-text",
            cartridgeBaseLocator = ".connect-tariff__inner",
            radioButtonEsimLocator = "eSIM",
            moreDetailsLocator = ".sim-type-selector__esim-info-btn",
            popupLocator = ".popup-inner",
            popupButtonLocator = "Понятно";


    public void inputNumber() {
        step("Открываем страницу переноса номера", () -> {
            open(openPageTariff);
        });
        $(byText(textLocators)).click();
        step("Проверяем что перешли на страницу", () -> {
            $(connectLocators).shouldHave(text("Переход со своим номером"));
        });
        step("Вводим номера", () -> {
            $(valueLocator).setValue(" 8005553535 ");
            $(errorTextLocator).shouldHave(visible);
        });

    }


    public void checkRadioButton() {
        step("Открываем страницу переноса номера", () -> {
            open(openPageTariff);
        });
        step("Скролим до radioButton", () -> {
            $(cartridgeBaseLocator).scrollTo();
        });
        step("Делаем клики по кнопкам", () -> {
            $(byText(radioButtonEsimLocator)).click();
            $(moreDetailsLocator).click();
        });
        step("Проверяем что появился popup", () -> {
            $(popupLocator).shouldBe(visible);
            $(byText(popupButtonLocator)).click();
        });
    }
}
