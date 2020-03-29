package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.ui.LoguearUsuario;
import co.com.proyectobase.screenplay.ui.SelecionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class AgregarProductosWish implements Interaction {

    private List<List<String>> data;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoguearUsuario.SelectMyAcountMenu));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnLogin));
        actor.attemptsTo(Enter.theValue(data.get(1).get(0).trim()).into(LoguearUsuario.EmailLogin));
        actor.attemptsTo(Enter.theValue(data.get(1).get(1).trim()).into(LoguearUsuario.PassLogin));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnContinuarLogin));
        actor.attemptsTo(Click.on(SelecionarProducto.OpcionPhonePda));
        actor.attemptsTo(Click.on(SelecionarProducto.BtnAgregarWishList));

    }
    public static AgregarProductosWish AgregarProductoWishList(List<List<String>> data) {
        return Tasks.instrumented(AgregarProductosWish.class,data);
  }
    public AgregarProductosWish(List<List<String>> data) {
        this.data = data;
    }

}
