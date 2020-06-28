<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>

        <title>Rastreo</title>
    </head>
    <body>
        <div id='wrapper'>
            <h1>Rastrear pedido</h1>
            <div id='barra-nav' class='barra-nav'>
                <ul>
                     <li><a href='inicio.jsp'>Inicio</a></li>
                     <li><a href='cambio_datos.jsp'>Actualizar Datos</a></li>
                    <li><a href='orden_pizza.jsp'>Ordenar pizza</a></li>
                    <li><a href='rastreo.jsp'>Rastrear orden</a></li>

                </ul>
            </div>
            <div id="cuerpo">
                <h3>Inserta el código de factura:</h3><br>
                <span><input type='text' id='usr_login' placeholder="Ingrese su código"></span><br>
                <button type="button" class="pagado" onclick="verificar()"><span>Rastrear</span></button>
        </div>
        </div>
    </body>
</html>
