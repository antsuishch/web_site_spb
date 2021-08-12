package spb.tele2.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ConnectTariffPage {
    //  Locators Connect Tariff Page
    public final String openConnectPageTariff = "https://spb.tele2.ru/connectTariff",
                        connectLocators = ".connect-header",
                        valueLocator = "#mnpNumber",
                        errorTextLocator = ".error-text",
                        cartridgeBaseLocator = ".connect-tariff__inner",
                        radioButtonEsimLocator = "eSIM",
                        moreDetailsLocator = ".sim-type-selector__esim-info-btn",
                        popupLocator = ".popup-inner",
                        popupButtonLocator = "Понятно";
}
