package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://tutorialsninja.com/demo/")

public class LoguearUsuario extends PageObject {

    public static final Target SelectMyAcountMenu = Target.the("Seleccionar campo menu").located(By.linkText("My Account"));
    public static final Target BtnLogin           = Target.the("Seleccionar campo Loguear").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
    public static final Target EmailLogin         = Target.the("EmailLogin").located(By.name("email"));
    public static final Target PassLogin          = Target.the("PassLogin").located(By.id("input-password"));
    public static final Target BtnContinuarLogin  = Target.the("BtnContinuarLogin").located(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
    public static final Target BtnItemCarroCompras = Target.the("Eliminar producto Carrito").located(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
    public static final Target BtnEliminarProductoCarrito = Target.the("Eliminar Producto").located(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr['HTC Touch HD']/td[4]/div/span/button[2]"));
    public static final Target BtnWishList = Target.the("Boton Wish List").located(By.xpath("//*[@id=\"wishlist-total\"]"));
    public static final Target BtnWishListEliminar = Target.the("Boton eliminar Wish list").located(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a"));
    public static final Target MensajeEliminarCarritoCompras = Target.the("Mensaje Eliminar Carrito").located(By.xpath("//*[@id=\"content\"]/p"));
    public static final Target MensajeEliminarWishList = Target.the("Mensaje Eliminar Wish List").located(By.xpath("//*[@id=\"content\"]/p"));

}
