package spb.tele2.steps;

import io.qameta.allure.Step;
import spb.tele2.pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WebMainSteps {

    private MainPage mainPage = new MainPage();

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(mainPage.openPageMain);
    }

    @Step("Делаем клик для перехода на страницу Тарифы")
    public void clickTariff() {
        $x(mainPage.cartridgeTariffLocator).click();
    }

    @Step("Проверяем что на странице есть текст")
    public void checkText() {
        $x(mainPage.textTariffLocator).shouldHave(text("Тарифы для смартфонов"));
    }

    @Step("Проверяем отображение картриджей")
    public void checkCartridge() {
        $(mainPage.detailTariffLocator).shouldBe(visible);
    }

    @Step("Делаем клик по иконке поиска")
    public void clickButtonFind() {
        $(mainPage.iconFindLocator).click();
    }

    @Step("Делаем клик по иконке поиска")
    public void inputValueText() {
        $(mainPage.searchTextLocator).setValue("Тарифы");
    }

    @Step("Делаем клик по иконке поиска")
    public void checkResults() {
        $(mainPage.resultsBoxLocator).shouldHave(visible);
    }

    @Step("Проверяем наличие информации о тарифе")
    public void checkInformationTariff() {
        $(mainPage.informationViewLocator).shouldHave(visible);
    }

    @Step("Скролл до элемента и клик по нему")
    public void scrollToElementsAndClick() {
        $(mainPage.buttonTariffLocator).scrollTo().click();
    }

    @Step("Проверяем появление popup")
    public void checkViewPopup() {
        $(mainPage.infoModalLocator).shouldBe(visible);
        $(mainPage.iconCloseLocator).shouldBe(visible);
    }

    @Step("Проверяем текст в popup")
    public void checkTextPopup() {
        $(mainPage.popupContentLocator).shouldHave(text("И тогда вас ждет скидка 15% на абонентскую плату за тариф! Не забудьте настроить автоплатеж. Привяжите карту Visa и получите повышенную скидку 20%."));
        $(mainPage.buttonYesLocator).shouldHave(text("Да, все верно"));
        $x(mainPage.buttonNoLocator).shouldHave(text("Нет, нужна 1 SIM"));
        $(mainPage.textDownLocator).shouldHave(text("Вы можете купить несколько объединенных в группу SIM-карт, чтобы получать скидку за тариф. Или приобрести сейчас одну SIM-карту и собрать группу со скидкой позднее."));
    }

}
