<%-- 
    Document   : index
    Created on : 16/06/2020, 04:21:01 PM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <title>Pizza UNA</title>
    </head>
    <body>
        <div id='wrapper'>
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='index.jsp'>Inicio</a></li>
                    <li><a href='registro.jsp'>Registrarse</a></li>
                    <li><a href='#About'>About</a></li>
                </ul>
            </div>
            <div id='login-content' class='login-content'>
                <div>
                    <h1>Ingresar</h1>
                </div>
                <div>
                    <input type='text' placeholder="Ingrese su usuario">
                </div>
                <div>
                    <input type='text' placeholder="Ingrese su contraseña">
                </div>
                <div>
                    <input type='submit' value='Ingresar'>
                </div>
                <div>
                </div>
            </div>
        </div>
    </body>
</html>
