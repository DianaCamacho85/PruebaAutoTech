package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.interactions.AgregarProductoCarritoCompras;
import co.com.proyectobase.screenplay.questions.ValidarAgregarProductoCarritoExitoso;
import co.com.proyectobase.screenplay.tasks.LoguearCliente;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarProductoCarrito {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor diana = Actor.named("Diana");

    @Before
    public void configuracion() {
        diana.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que Diana se loguea en la pagina de tutorial nina$")
    public void queDianaSeLogueaEnLaPaginaDeTutorialNina()  {
        diana.wasAbleTo(LoguearCliente.loguearUsuario());
    }
    @Cuando("^requiero agregar un articulo al carrito de compra$")
    public void requieroAgregarUnArticuloAlCarritoDeCompra(DataTable dtDataAgregar)  {
        List<List<String>> data = dtDataAgregar.raw();
        diana.attemptsTo(AgregarProductoCarritoCompras.AgregarProducto(data));
    }
    @Entonces("^verificar que el articulo fue cargado en el carrito de compra con el mensaje (.*)$")
    public void verificarQueElArticuloFueCargadoEnElCarritoDeCompraConElMensaje(String mensaje){
        diana.should(seeThat(ValidarAgregarProductoCarritoExitoso.elmensaje(),equalTo(mensaje)));
    }

}
