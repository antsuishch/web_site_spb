package spb.tele2.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WebMainSteps {

    private static final String
            openPageMain = "https://spb.tele2.ru/",
            cartridgeTariffLocator = "//*[@id=\"root\"]//header/section[2]//li[1]",
            textTariffLocator = "//*[@id=\"root\"]//div//div[2]/h1[1]",
            detailTariffLocator = ".tariffs-detailed-list",
            iconFindLocator = ".ico.icon-search",
            searchTextLocator = "#search-text",
            resultsBoxLocator = ".global-results",
            informationViewLocator = ".recently-tariffs",
            buttonTariffLocator = ".btn.tariff-card-summary__button",
            infoModalLocator = ".info-modal.violet-style",
            iconCloseLocator = ".not-print-element.close.icon-close",
            popupContentLocator = ".popup-content",
            buttonYesLocator = ".btn.btn-black.line-sale2__btn",
            buttonNoLocator = "//*[@id=\"simNumberSelectionPopup\"]//div[2]/a",
            textDownLocator = ".gray-text",
            tariffCartridgesLocator = "div.tariff-cards.visible-lg";

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(openPageMain);
    }

    @Step("Делаем клик для перехода на страницу Тарифы")
    public void clickTariff() {
        $x(cartridgeTariffLocator).click();
    }

    @Step("Проверяем что на странице есть текст")
    public void checkText() {
        $x(textTariffLocator).shouldHave(text("Тарифы для смартфонов"));
    }

    @Step("Проверяем отображение картриджей")
    public void checkCartridge() {
        $(detailTariffLocator).shouldBe(visible);
    }

    @Step("Делаем клик по иконке поиска")
    public void clickButtonFind() {
        $(iconFindLocator).click();
    }

    @Step("Делаем клик по иконке поиска")
    public void inputValueText() {
        $(searchTextLocator).setValue("Тарифы");
    }

    @Step("Делаем клик по иконке поиска")
    public void checkResults() {
        $(resultsBoxLocator).shouldHave(visible);
    }

    @Step("Проверяем наличие информации о тарифе")
    public void checkInformationTariff() {
        $(informationViewLocator).shouldHave(visible);
    }

    @Step("Скролл до элемента и клик по нему")
    public void scrollToElementsAndClick() {
        $(buttonTariffLocator).scrollTo().click();
    }
    @Step("Скролл до карточек тарифа")
    public void scrollToCartridgeTariffs() {
        $(tariffCartridgesLocator).scrollTo();
    }

    @Step("Карточки тарифа отображаются")
    public void visibleCartridgesTariff() {
        $(tariffCartridgesLocator).shouldBe(visible);
    }

    @Step("Проверяем появление popup")
    public void checkViewPopup() {
        $(infoModalLocator).shouldBe(visible);
        $(iconCloseLocator).shouldBe(visible);
    }

    @Step("Проверяем текст в popup")
    public void checkTextPopup() {
        $(popupContentLocator).shouldHave(text("И тогда вас ждет скидка 15% на абонентскую плату за тариф! Не забудьте настроить автоплатеж. Привяжите карту Visa и получите повышенную скидку 20%."));
        $(buttonYesLocator).shouldHave(text("Да, все верно"));
        $x(buttonNoLocator).shouldHave(text("Нет, нужна 1 SIM"));
        $(textDownLocator).shouldHave(text("Вы можете купить несколько объединенных в группу SIM-карт, чтобы получать скидку за тариф. Или приобрести сейчас одну SIM-карту и собрать группу со скидкой позднее."));
    }

}
