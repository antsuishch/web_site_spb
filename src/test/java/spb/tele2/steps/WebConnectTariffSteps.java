package spb.tele2.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WebConnectTariffSteps {

    private static final String
            openConnectPageTariff = "https://spb.tele2.ru/connectTariff",
            connectLocators = ".connect-header",
            valueLocator = "#mnpNumber",
            errorTextLocator = ".error-text",
            cartridgeBaseLocator = ".connect-tariff__inner",
            radioButtonEsimLocator = "eSIM",
            moreDetailsLocator = ".sim-type-selector__esim-info-btn",
            popupLocator = ".popup-inner",
            popupButtonLocator = "a.btn";

    @Step("Открываем страницу Перейти в теле2")
    public void openConnectTariffPage() {
        open(openConnectPageTariff);
    }

    @Step("Проверям текст в хедере")
    public void checkHeaderConnectTariffPage() {
        $(connectLocators).shouldHave(text("Переход со своим номером"));
    }

    @Step("Вводим некорректный номер телефона")
    public void inputIncorrectNumberPhone() {
        $(valueLocator).setValue(" 8005553535 ");
    }

    @Step("Проверяем появление текста об ошибке")
    public void checkTextError() {
        $(errorTextLocator).shouldHave(visible);
    }

    @Step("Скролл до появление radiobutton")
    public void scrollToRadioButtons() {
        $(cartridgeBaseLocator).scrollTo();
    }

    @Step("Клик по eSim")
    public void clickRadioButtonEsim() {
        $(byText(radioButtonEsimLocator)).click();
    }

    @Step("Клик по \"Подробнее\"")
    public void clickMoreDetails() {
        $(moreDetailsLocator).click();
    }

    @Step("Проверка появления popup после нажатия \"Подробнее\"")
    public void checkViewPopupAfterClickMore() {
        $(popupLocator).shouldBe(visible);
    }

    @Step("Проверка текста popup после нажатия \"Подробнее\"")
    public void checkTextPopupAfterClickMore() {
        $(popupButtonLocator).click();
    }
}
