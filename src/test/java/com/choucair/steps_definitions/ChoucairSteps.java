package com.choucair.steps_definitions;

import com.choucair.actions.ChoucairActions;
import com.choucair.actions.MangetoActions;
import com.choucair.models.ChoucairModels;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ChoucairSteps {
    @Managed
    WebDriver driver;

    ChoucairActions choucairActions = new ChoucairActions(driver);
    MangetoActions mangetoActions = new MangetoActions(driver);

    @Dado("^que estoy en la seccion home de la pagina de choucair$")
    public void queEstoyEnLaSeccionHomeDeLaPaginaDeChoucair() {
        choucairActions.open();

    }


    @Cuando("^cuando ingreso los datos requeridos por el sistema$")
    public void cuandoIngresoLosDatosRequeridosPorElSistema(List<ChoucairModels> choucairModels)  {
        choucairActions.llenarFormulario();
        mangetoActions.irOfertas();
        mangetoActions.esperar(choucairModels.get(0));


    }

    @Entonces("^deberia poder visualizar las diferentes ofertas laborales$")
    public void deberiaPoderVisualizarLasDiferentesOfertasLaborales() {
        mangetoActions.verOfertas();

    }
}
