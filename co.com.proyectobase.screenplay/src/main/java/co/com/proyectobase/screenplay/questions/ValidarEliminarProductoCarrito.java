package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.LoguearUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarEliminarProductoCarrito implements Question<String> {

    public static ValidarEliminarProductoCarrito elmensaje() {
        return new ValidarEliminarProductoCarrito();
    }

    public String answeredBy(Actor actor) {

        String mensaje = Text.of(LoguearUsuario.MensajeEliminarCarritoCompras).viewedBy(actor).asString().trim();
        return mensaje;


    }

}
