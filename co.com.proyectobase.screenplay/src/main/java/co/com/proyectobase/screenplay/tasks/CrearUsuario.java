package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.CrearUsuarioCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class CrearUsuario implements Task {

    private List<List<String>> data;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CrearUsuarioCompra.SelectMyAcountMenu));
        actor.attemptsTo(Click.on(CrearUsuarioCompra.BtnRegistrar));
        actor.attemptsTo(Enter.theValue(data.get(1).get(0).trim()).into(CrearUsuarioCompra.Nombre));
        actor.attemptsTo(Enter.theValue(data.get(1).get(1).trim()).into(CrearUsuarioCompra.Apellido));
        actor.attemptsTo(Enter.theValue(data.get(1).get(2).trim()).into(CrearUsuarioCompra.Email));
        actor.attemptsTo(Enter.theValue(data.get(1).get(3).trim()).into(CrearUsuarioCompra.Telefono));
        actor.attemptsTo(Enter.theValue(data.get(1).get(4).trim()).into(CrearUsuarioCompra.Password));
        actor.attemptsTo(Enter.theValue(data.get(1).get(5).trim()).into(CrearUsuarioCompra.ConfPass));
        actor.attemptsTo(Click.on(CrearUsuarioCompra.Suscribirse));
        actor.attemptsTo(Click.on(CrearUsuarioCompra.PolPrivacidad));
        actor.attemptsTo(Click.on(CrearUsuarioCompra.btnContinuar));
        actor.attemptsTo(Click.on(CrearUsuarioCompra.btnContinuarPag2));
        actor.attemptsTo(Click.on(CrearUsuarioCompra.EditarMenuMyAccount));
    }

    public static CrearUsuario RegistroUsuario(List<List<String>> data) {
        return Tasks.instrumented(CrearUsuario.class, data);
    }
    public CrearUsuario(List<List<String>> data) {
        this.data = data;
    }

}