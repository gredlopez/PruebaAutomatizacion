package com.choucair.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.choucairtesting.com/")

public class ChoucairPage extends BasePage{
    public ChoucairPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav[@id='mainnav']//li[@id='menu-item-550']//a")
    private WebElementFacade botonSeccionEmpleos;

    @FindBy(xpath = "(//div[@class='elementor-button-wrapper']//a[@class='elementor-button-link elementor-button elementor-size-lg'])[1]")
    private  WebElementFacade botonIrPortalDeEmpleos;

    @FindBy(xpath = "//a[contains(@data-cli_action,'accept')]")
    private WebElementFacade botonCeptarCookies;

    @FindBy(xpath = "//div[@class='elementor-button-wrapper']//a[@class='elementor-button-link elementor-button elementor-size-sm']")
    private WebElementFacade botonContinuar;

    public WebElementFacade getBotonContinuar() {
        return botonContinuar;
    }

    public WebElementFacade getBotonCeptarCookies() {
        return botonCeptarCookies;
    }

    public WebElementFacade getBotonIrPortalDeEmpleos() {
        return botonIrPortalDeEmpleos;
    }

    public WebElementFacade getBotonSeccionEmpleos() {
        return botonSeccionEmpleos;
    }
}
