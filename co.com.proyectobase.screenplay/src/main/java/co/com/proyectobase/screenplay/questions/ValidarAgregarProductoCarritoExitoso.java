package co.com.proyectobase.screenplay.questions;


import co.com.proyectobase.screenplay.ui.SelecionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarAgregarProductoCarritoExitoso implements Question<String> {

    public static ValidarAgregarProductoCarritoExitoso elmensaje() {
        return new ValidarAgregarProductoCarritoExitoso();
    }

    public String answeredBy(Actor actor) {

        String mensaje = Text.of(SelecionarProducto.MensajeValidacionCarrito).viewedBy(actor).asString().trim();
        return mensaje;


    }

}
