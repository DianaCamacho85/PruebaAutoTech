package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.ui.LoguearUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class ELiminarProductoWish implements Interaction {

    private List<List<String>> data;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoguearUsuario.SelectMyAcountMenu));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnLogin));
        actor.attemptsTo(Enter.theValue(data.get(1).get(0).trim()).into(LoguearUsuario.EmailLogin));
        actor.attemptsTo(Enter.theValue(data.get(1).get(1).trim()).into(LoguearUsuario.PassLogin));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnContinuarLogin));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnWishList));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnWishListEliminar));

    }
    public static ELiminarProductoWish EliminarProductoWish(List<List<String>> data) {
        return Tasks.instrumented(ELiminarProductoWish.class,data);
    }
    public ELiminarProductoWish(List<List<String>> data) {
        this.data = data;
    }


}



