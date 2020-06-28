<%-- 
    Document   : rastreo
    Created on : 27 jun. 2020, 19:22:45
    Author     : Kike
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
                    <li><a href='index.jsp'>Inicio</a></li>
                    <li><a href='registro.jsp'>Registrarse</a></li>
                    <li><a href='registrar_pizza.jsp'>Gestión Pizza</a></li>
                    <li><a href='orden_pizza.jsp'>Ordenar pizza</a></li>
                     <li><a href='rastreo.jsp'>Rastrear orden</a></li>

                </ul>
            </div>
            <div id="cuerpo">
                <h3>Inserta el código de factura:</h3><br>
                <%--Se enlista pedido--%>
                <span><input type='text' id='usr_login' placeholder="Ingrese su código"></span><br>
                <button type="button" class="pagado" onclick="verificar()"><span>Rastrear</span></button>
        </div>
        </div>
    </body>
</html>
