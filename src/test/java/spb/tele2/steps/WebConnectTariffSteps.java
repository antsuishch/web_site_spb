package spb.tele2.steps;

import io.qameta.allure.Step;
import spb.tele2.pages.ConnectTariffPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WebConnectTariffSteps {

    private ConnectTariffPage connectTariffPage = new ConnectTariffPage();

    @Step("Открываем страницу Перейти в теле2")
    public void openConnectTariffPage() {
        open(connectTariffPage.openConnectPageTariff);
    }

    @Step("Проверям текст в хедере")
    public void checkHeaderConnectTariffPage() {
        $(connectTariffPage.connectLocators).shouldHave(text("Переход со своим номером"));
    }

    @Step("Вводим некорректный номер телефона")
    public void inputIncorrectNumberPhone() {
        $(connectTariffPage.valueLocator).setValue(" 8005553535 ");
    }

    @Step("Проверяем появление текста об ошибке")
    public void checkTextError() {
        $(connectTariffPage.errorTextLocator).shouldHave(visible);
    }

    @Step("Скролл до появление radiobutton")
    public void scrollToRadioButtons() {
        $(connectTariffPage.cartridgeBaseLocator).scrollTo();
    }

    @Step("Клик по eSim")
    public void clickRadioButtonEsim() {
        $(byText(connectTariffPage.radioButtonEsimLocator)).click();
    }

    @Step("Клик по \"Подробнее\"")
    public void clickMoreDetails() {
        $(connectTariffPage.moreDetailsLocator).click();
    }

    @Step("Проверка появления popup после нажатия \"Подробнее\"")
    public void checkViewPopupAfterClickMore() {
        $(connectTariffPage.popupLocator).shouldBe(visible);
    }

    @Step("Проверка текста popup после нажатия \"Подробнее\"")
    public void checkTextPopupAfterClickMore() {
        $(byText(connectTariffPage.popupButtonLocator)).click();
    }
}
