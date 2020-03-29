package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.ui.LoguearUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class EliminarProductoCarrito implements Interaction {

    private List<List<String>> data;

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Click.on(LoguearUsuario.SelectMyAcountMenu));
            actor.attemptsTo(Click.on(LoguearUsuario.BtnLogin));
            actor.attemptsTo(Enter.theValue(data.get(1).get(0).trim()).into(LoguearUsuario.EmailLogin));
            actor.attemptsTo(Enter.theValue(data.get(1).get(1).trim()).into(LoguearUsuario.PassLogin));
            actor.attemptsTo(Click.on(LoguearUsuario.BtnContinuarLogin));
            actor.attemptsTo(Click.on(LoguearUsuario.BtnItemCarroCompras));
            actor.attemptsTo(Click.on(LoguearUsuario.BtnEliminarProductoCarrito));
        }
        public static EliminarProductoCarrito EliminarProductoCarrito(List<List<String>> data) {
            return Tasks.instrumented(EliminarProductoCarrito.class,data);
        }
    public EliminarProductoCarrito(List<List<String>> data) {
            this.data = data;
        }
     }





