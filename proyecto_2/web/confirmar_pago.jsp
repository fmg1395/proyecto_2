<%-- 
    Document   : confirmar_pago
    Created on : 26 jun. 2020, 21:36:50
    Author     : Kike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <html>
    <head>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <title>Confirmar pedido</title>
    </head>
    <body>
       <div id='wrapper'>
            <h1>Confirmar pedido</h1>
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='index.jsp'>Inicio</a></li>
                    <li><a href='registro.jsp'>Registrarse</a></li>
                    <li><a href='registrar_pizza.jsp'>Registrar Pizza</a></li>
                    <li><a href='#About'>Ordenar pizza</a></li>
                </ul>
            </div>
            <div id="cuerpo">
                <h3>Tu pedido</h3><br>
                <%--Se enlista pedido--%>
                <span>Opciones de pago</span><br>
                <input type="radio" id="pago" name="modoPago" value="efectivo">
                <label for="pago">Efectivo</label><br>
                 <input type="radio" id="pago" name="modoPago" value="tarjeta">
                <label for="pago">Tarjeta</label><br>
        </div>
    </body>
</html>

