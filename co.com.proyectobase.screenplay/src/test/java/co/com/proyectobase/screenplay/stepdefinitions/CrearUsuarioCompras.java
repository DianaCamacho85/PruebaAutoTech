package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.ValidarCreacionUsuarioExitosa;
import co.com.proyectobase.screenplay.tasks.AbrirNavegador;
import co.com.proyectobase.screenplay.tasks.CrearUsuario;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CrearUsuarioCompras {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor diana = Actor.named("Diana");

    @Before
    public void configuracion() {
        diana.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que Diana ingresa a la pagina de tutorial ninja$")
    public void queDianaIngresaALaPaginaDeTutorialNinja() {
        diana.wasAbleTo(AbrirNavegador.webTutorialNinja());
    }

    @Cuando("^requiero crear un usuario para realizar una compra$")
    public void requieroCrearUnUsuarioParaRealizarUnaCompra(DataTable dtDataFormulario) {
        List<List<String>> data = dtDataFormulario.raw();
        diana.attemptsTo(CrearUsuario.RegistroUsuario(data));
    }
    @Entonces("^verificar que el nombre del usuario creado corresponde a (.*)$")
    public void verificarQueElNombreDelUsuarioCreadoCorrespondeA(String mensaje)  {
        diana.should(seeThat(ValidarCreacionUsuarioExitosa.elUsuario(),equalTo(mensaje)));
    }
}







