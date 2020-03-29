package co.com.proyectobase.screenplay.stepdefinitions;


import co.com.proyectobase.screenplay.interactions.EliminarProductoCarrito;
import co.com.proyectobase.screenplay.questions.ValidarEliminarProductoCarrito;
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

public class EliminarProductoCarritoCompras {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor diana = Actor.named("Diana");

    @Before
    public void configuracion() {
        diana.can(BrowseTheWeb.with(hisBrowser));
        diana.wasAbleTo(LoguearCliente.loguearUsuario());
    }
    @Dado("^que Diana requiere loguearse en la pagina tutorial ninja$")
    public void queDianaRequiereLoguearseEnLaPaginaTutorialNinja() {
        diana.wasAbleTo(LoguearCliente.loguearUsuario());
    }
    @Cuando("^requiero eliminar los articulos del carrito de compras$")
    public void requieroEliminarLosArticulosDelCarritoDeCompras(DataTable dtDataEliminarCarrito)  {
        List<List<String>> data = dtDataEliminarCarrito.raw();
        diana.attemptsTo(EliminarProductoCarrito.EliminarProductoCarrito(data));
    }
    @Entonces("^verificar que el articulo fue eliminado correctamente del carrito de compras con el mensaje (.*)$")
    public void verificarQueElArticuloFueEliminadoCorrectamenteDelCarritoDeComprasConElMensaje(String mensaje)  {
        diana.should(seeThat(ValidarEliminarProductoCarrito.elmensaje(),equalTo(mensaje)));
    }
}
