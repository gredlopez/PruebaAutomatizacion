package com.choucair.actions;

import com.choucair.models.ChoucairModels;
import com.choucair.pages.MagnetoPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
;

public class MangetoActions extends MagnetoPage {
    public MangetoActions(WebDriver driver) {
        super(driver);
    }

    public void irOfertas(){
        getVerOfertasLaborales().waitUntilClickable();
        getVerOfertasLaborales().click();
    }
    public void esperar(ChoucairModels choucairModels){

        getBtnAplicarOferta().isDisplayed();
        getBtnAplicarOferta().click();

        getBtnContinuar().click();
        getBotonIniciarSesion().isDisplayed();
        getBotonIniciarSesion().click();

        getCajaCorreo().isDisplayed();
        enter(choucairModels.getCorreo()).into(getCajaCorreo());

        getCajaContrasena().isDisplayed();
        enter(choucairModels.getContrasena()).into(getCajaContrasena());

        getBotonLogin().isDisplayed();
        getBotonLogin().click();

    }

    public  void verOfertas(){

        getBotoOfertas().isDisplayed();
        getBotoOfertas().click();

        getBotonSugeridas().isDisplayed();
        getBotonSugeridas().click();

        getEsperarOferta().waitUntilPresent();

    }




}
