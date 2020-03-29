package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.CrearUsuarioCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

public class ValidarCreacionUsuarioExitosa implements Question<String> {

    public static ValidarCreacionUsuarioExitosa elUsuario() {
        return new ValidarCreacionUsuarioExitosa();
    }
    @Override

    public String answeredBy(Actor actor) {


        String mensaje = Value.of(CrearUsuarioCompra.Msj_Validacion).viewedBy(actor).asString();
        return mensaje;
    }

}





