package com.choucair.actions;

import com.choucair.pages.ChoucairPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ChoucairActions extends ChoucairPage {
    public ChoucairActions(WebDriver driver) {
        super(driver);
    }

    public void irSeccionEmpleos(){
        getBotonCeptarCookies().click();
        getBotonSeccionEmpleos().waitUntilPresent();
        getBotonSeccionEmpleos().click();

    }
    public void irPortalDeEmpleos(){
        getBotonIrPortalDeEmpleos().waitUntilClickable();
        getBotonIrPortalDeEmpleos().click();

    }

    public void aceptarSalirDeChoucair(){
        getBotonContinuar().isDisplayed();
        getBotonContinuar().click();

    }

    public void  llenarFormulario(){
        irSeccionEmpleos();
        irPortalDeEmpleos();
        aceptarSalirDeChoucair();
        //ingresar();
        //llenarDatosManual();

    }







}
