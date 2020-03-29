#Author: Diana Camacho
# language:es

@Regresion
Característica: Ingresar a la pagina de tutorial ninja
  Seleccionar el producto a ser agregado
  Para validar que fue agregado correctamente al carrito de compras

  @Caso1
     Escenario: Ingresar a la pagina de tutorial ninja, crear un usuario para compras y verificar que el nombre de usuario corresponde al usuario que ingresa
     Dado que Diana ingresa a la pagina de tutorial ninja
     Cuando  requiero crear un usuario para realizar una compra
        |Nombre|Apellido|Email|Telefono|Password|ConfPassword|
        |Diana|Camacho|hola44@gmail.com|12345|diana|diana|
     Entonces verificar que el nombre del usuario creado corresponde a Diana

    @Caso2
     Escenario: Loguearse en la pagina tutorial ninja y agregar un articulo y verificar que el articulo fue cargado al carrito de compras
     Dado que Diana se loguea en la pagina de tutorial nina
     Cuando requiero agregar un articulo al carrito de compra
        |Email|Password|
        |hola44@gmail.com|diana|
      Entonces verificar que el articulo fue cargado en el carrito de compra con el mensaje shopping cart

    @Caso3
      Escenario: Loguearse en la pagina tutorial ninja y agregar un articulo a la wish list y verificar que se haya agregado correctamente
      Dado que Diana se loguea en la pagina de tutorial ninja
      Cuando requiero agregar un articulo a la wish list
        |Email|Password|
        |hola44@gmail.com|diana|
      Entonces verificar que el articulo fue cargado correctamente a la wish list con el mensaje wish list

    @Caso4
     Escenario: Loguearse en la pagina tutorial ninja y eliminar los artículos del carrito de compras
     Dado que Diana requiere loguearse en la pagina tutorial ninja
     Cuando requiero eliminar los articulos del carrito de compras
       |Email|Password|
       |hola44@gmail.com|diana|
      Entonces verificar que el articulo fue eliminado correctamente del carrito de compras con el mensaje Your shopping cart is empty!

    @Caso5
      Escenario: Loguearse en la pagina tutorial ninja y eliminar los artículos de la wish list
      Dado que Diana requiere loguearse en la pagina tutorial
      Cuando requiero eliminar los articulos de la wish list
       |Email|Password|
       |hola44@gmail.com|diana|
      Entonces verificar que el articulo fue eliminado correctamente de la wish list con el mensaje Your shopping cart is empty!




