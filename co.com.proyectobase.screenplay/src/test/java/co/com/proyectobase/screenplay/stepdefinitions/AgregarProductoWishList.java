package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.interactions.AgregarProductosWish;
import co.com.proyectobase.screenplay.questions.ValidarAgregarProductoCarritoExitoso;
import co.com.proyectobase.screenplay.questions.ValidarAgregarProductoWishList;
import co.com.proyectobase.screenplay.tasks.LoguearCliente;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarProductoWishList {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor diana = Actor.named("Diana");

    @Before
    public void configuracion() {
        diana.can(BrowseTheWeb.with(hisBrowser));
        diana.wasAbleTo(LoguearCliente.loguearUsuario());
    }
    @Dado("^que Diana se loguea en la pagina de tutorial ninja$")
    public void queDianaSeLogueaEnLaPaginaDeTutorialNinja() {
        diana.wasAbleTo(LoguearCliente.loguearUsuario());
    }
    @Cuando("^requiero agregar un articulo a la wish list$")
    public void requieroAgregarUnArticuloALaWishList(DataTable dtDataAgregarWishList)  {
        List<List<String>> data = dtDataAgregarWishList.raw();
        diana.attemptsTo(AgregarProductosWish.AgregarProductoWishList(data));
    }
    @Entonces("^verificar que el articulo fue cargado correctamente a la wish list con el mensaje (.*)$")
    public void verificarQueElArticuloFueCargadoCorrectamenteALaWishListConElMensaje(String mensaje)  {
        diana.should(seeThat(ValidarAgregarProductoWishList.elmensaje(),equalTo(mensaje)));

    }

}

