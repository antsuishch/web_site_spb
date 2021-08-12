package spb.tele2.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainPage {
    //  Locators for Main Page
    public final String openPageMain = "https://spb.tele2.ru/",
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
                        textDownLocator = ".gray-text";
}
