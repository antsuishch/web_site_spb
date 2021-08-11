package cloud.autotests.tests.pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainPage {
    //  Locators an methods for Main Page
    String openPageMain = "https://spb.tele2.ru/",
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
            titleFrameLocator = ".title-frame",
            popupContentLocator = ".popup-content",
            buttonYesLocator = ".btn.btn-black.line-sale2__btn",
            buttonNoLocator = "//*[@id=\"simNumberSelectionPopup\"]//div[2]/a",
            textDownLocator = ".gray-text";


    public void mainPageTariff() {
        step("Открываем страницу с тарифом", () -> {
            open(openPageMain);
            $x(cartridgeTariffLocator).click();
        });
        step("Проверяем что на странице есть текст", () -> {
            $x(textTariffLocator).shouldHave(text("Тарифы для смартфонов"));
        });
        step("Проверяем наличие картриджей", () -> {
            $(detailTariffLocator).shouldBe(visible);
        });
    }


    public void checkFind() {
        step("Открываем главную страницу", () -> {
            open(openPageMain);
        });
        step("Делаем клик по иконке поиска", () -> {
            $(iconFindLocator).click();
        });
        step("Вводим значение в поле поиска", () -> {
            $(searchTextLocator).setValue("Тарифы");
        });
        step("Проверяем результат", () -> {
            $(resultsBoxLocator).shouldHave(visible);
        });
        step("Проверяем отображение информацию о тарифах", () -> {
            $(informationViewLocator).shouldHave(visible);
        });
    }


    public void popupTariff() {
        step("Открываем главную страницу", () -> {
            open(openPageMain);
        });
        step("Скролл до полного отображения картриджа и клик", () -> {
            $(buttonTariffLocator).scrollTo().click();
        });
        step("Переключаемся на попап и делаем общую проверку на его отображаение", () -> {
            switchTo().activeElement().isDisplayed();
        });
        step("Проверяем появление попапа и текста в нем", () -> {
            $(infoModalLocator).shouldBe(visible);
            $(iconCloseLocator).shouldBe(visible);
            $(titleFrameLocator).shouldHave(text("Вы собираетесь купить 5 SIM-карт"));
            $(popupContentLocator).shouldHave(text("И тогда вас ждет скидка 15% на абонентскую плату за тариф! Не забудьте настроить автоплатеж. Привяжите карту Visa и получите повышенную скидку 20%."));
            $(buttonYesLocator).shouldHave(text("Да, все верно"));
            $x(buttonNoLocator).shouldHave(text("Нет, нужна 1 SIM"));
            $(textDownLocator).shouldHave(text("Вы можете купить несколько объединенных в группу SIM-карт, чтобы получать скидку за тариф. Или приобрести сейчас одну SIM-карту и собрать группу со скидкой позднее."));
        });
    }
}
