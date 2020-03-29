package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelecionarProducto extends PageObject {

    public static final Target OpcionPhonePda = Target.the("PhonePDA").located(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
    public static final Target BtnCarritoCompras = Target.the("Carrito de Compras").located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]"));
    public static final Target BtnAgregarWishList = Target.the("Wish list").located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]"));
    public static final Target MensajeValidacionCarrito = Target.the("Mensaje validacion carrito").located(By.xpath("//*[@id=\"product-category\"]/div[1]/a[2]"));
    public static final Target MensajeValidacionWishList = Target.the("Mensaje validacion Wish").located(By.xpath("//*[@id=\"product-category\"]/div[1]/a[2]"));

}
