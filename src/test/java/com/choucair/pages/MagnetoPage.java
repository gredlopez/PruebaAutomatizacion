package com.choucair.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.magneto365.com/choucair")

public class MagnetoPage extends BasePage{
    public MagnetoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Nuestras Vacantes')]")
    private WebElementFacade verOfertasLaborales;

    @FindBy(xpath = "//input[@value='Buscar']")
    private WebElementFacade espera;

    @FindBy(xpath = "(//a[@id='apply-vacant'])[1]")
    private WebElementFacade btnAplicarOferta;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[4]/button")
    private WebElementFacade btnContinuar;

    @FindBy(id = "emailId")
    private WebElementFacade cajac1;

    @FindBy(id = "emailConfirmationId")
    private WebElementFacade cajac2;

    @FindBy(id = "formBasicCheckbox")
    private WebElementFacade btnAceptarterminos;

    @FindBy(xpath = "(//button[contains(.,'Continuar')])[1]")
    private WebElementFacade btnContinuarCorreo;

    @FindBy(xpath = " //div[@class='mb-0 searchLocation col-sm-12 col-12']//input")
    private WebElementFacade cajaCiudad;

    @FindBy(xpath = "//div[@class='content-cities']//div")
    private WebElementFacade ciudadDesplegada;

    @FindBy(xpath = "//button[contains(@id,'d-nacimiento')]")
    private WebElementFacade continuarCiudad2;

    @FindBy(xpath = " (//label[@class='custom-control-label'])[1]")
    private WebElementFacade genero;

    @FindBy(xpath = "//body/div[1]/div/div/div[3]/div/form/div[1]/input")
    private WebElementFacade cajaCedula;

    public WebElementFacade getBotonCerrarAyuda() {
        return botonCerrarAyuda;
    }

    @FindBy(xpath = "//button[contains(@aria-label,'Dismiss Message')]")
    private WebElementFacade botonCerrarAyuda;

    public WebElementFacade getCajaCelular() {
        return cajaCelular;
    }

    @FindBy(xpath = "//input[@class='inputInvalidReal form-control']")
    private WebElementFacade cajaCelular;

    @FindBy(id = "inputGroupSelect01")
    private WebElementFacade pickCedula;


    @FindBy(xpath = "//p[@class='email-step__formside-login text-left mb-5']//a")
    private WebElementFacade botonIniciarSesion;

    @FindBy(xpath = "//div[@id='validEmailSubmit']/following::input[@id='emailSignIn']")
    private WebElementFacade cajaCorreo;


    @FindBy(xpath = "//div[@id='validEmailSubmit']/following::input[@id='emailSignInConfirm']")
    private WebElementFacade cajaContrasena;

    @FindBy(xpath = "//div[@class='buttonIniciarSesionMain']//button[@id='btnSubmitLogin']")
    private WebElementFacade botonLogin;

    @FindBy(xpath = "(//i[@class='la la-briefcase']/following::span)[1]")
    private WebElementFacade botoOfertas;

    @FindBy(xpath = " (//li[@class='ant-menu-item ant-menu-item-only-child']//a)[1]")
    private WebElementFacade botonSugeridas;

    @FindBy(xpath = " (//div[@class='jobs-content__content']//div[@class='job-offer-title-label'])[7]")
    private WebElementFacade vacante;

    @FindBy(xpath = "//div[@class='header-info__application-buttons']//button")
    private WebElementFacade botonAplicar;

    @FindBy(xpath = " (//div[@class='job-offer-title-label'])[2]")
    private WebElementFacade esperarOferta;

    public WebElementFacade getEsperarOferta() {
        return esperarOferta;
    }

    public WebElementFacade getBotonAplicar() {
        return botonAplicar;
    }

    public WebElementFacade getVacante() {
        return vacante;
    }

    public WebElementFacade getPickCedula() {
        return pickCedula;
    }

    public WebElementFacade getBotonSugeridas() {
        return botonSugeridas;
    }

    public WebElementFacade getBotoOfertas() {
        return botoOfertas;
    }

    public WebElementFacade getBotonLogin() {
        return botonLogin;
    }

    public WebElementFacade getCajaContrasena() {
        return cajaContrasena;
    }

    public WebElementFacade getBotonIniciarSesion() {
        return botonIniciarSesion;
    }

    public WebElementFacade getCajaCorreo() {
        return cajaCorreo;
    }

    public WebElementFacade getCajaCedula() {
        return cajaCedula;
    }

    public WebElementFacade getGenero() {
        return genero;
    }

    public WebElementFacade getContinuarCiudad2() {
        return continuarCiudad2;
    }

    public WebElementFacade getCiudadDesplegada() {
        return ciudadDesplegada;
    }

    public WebElementFacade getCajaCiudad() {
        return cajaCiudad;
    }


    public WebElementFacade getBtnContinuarCorreo() {
        return btnContinuarCorreo;
    }

    public WebElementFacade getBtnAceptarterminos() {
        return btnAceptarterminos;
    }

    public WebElementFacade getCajac1() {
        return cajac1;
    }

    public WebElementFacade getCajac2() {
        return cajac2;
    }

    public WebElementFacade getBtnContinuar() {
        return btnContinuar;
    }

    public WebElementFacade getBtnAplicarOferta() {
        return btnAplicarOferta;
    }

    public WebElementFacade getEspera() {
        return espera;
    }

    public WebElementFacade getVerOfertasLaborales() {
        return verOfertasLaborales;
    }


}
