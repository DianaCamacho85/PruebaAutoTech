package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.interactions.ELiminarProductoWish;
import co.com.proyectobase.screenplay.questions.ValidarEliminarProductoWishList;
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

public class EliminarProductosWishList {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor diana = Actor.named("Diana");

    @Before
    public void configuracion() {
        diana.can(BrowseTheWeb.with(hisBrowser));
        diana.wasAbleTo(LoguearCliente.loguearUsuario());
    }
    @Dado("^que Diana requiere loguearse en la pagina tutorial$")
    public void queDianaRequiereLoguearseEnLaPaginaTutorial()  {

    }
    @Cuando("^requiero eliminar los articulos de la wish list$")
    public void requieroEliminarLosArticulosDeLaWishList(DataTable dtDataEliminarWishList)  {
        List<List<String>> data = dtDataEliminarWishList.raw();
        diana.attemptsTo(ELiminarProductoWish.EliminarProductoWish(data));
    }
    @Entonces("^verificar que el articulo fue eliminado correctamente de la wish list con el mensaje (.*)$")
    public void verificarQueElArticuloFueEliminadoCorrectamenteDeLaWishListConElMensaje(String mensaje)  {
        diana.should(seeThat(ValidarEliminarProductoWishList.elmensaje(),equalTo(mensaje)));
    }

    }


