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
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <title>Pizza UNA</title>
    </head>
    <body>
        <div id='wrapper'>
            <div id='barra-nav' class='barra-nav'>
                <ul>
                </ul>
            </div>
            <div id='login-content' class='login-content'>
                <form id='form_login' name='form_login' onsubmit='return captura_login()'>
                    <div>
                        <h1>Ingresar</h1>
                    </div>
                    <div>
                        <input type='text' id='usr_login' placeholder="Ingrese su usuario">
                    </div>
                    <div>
                        <input type='password' id='pass_login' placeholder="Ingrese su contraseña">
                    </div>
                    <div>
                        <input type='submit' value='Ingresar'>
                    </div>
                    <div>
                        <a href="cambio_pass.jsp">¿Olvidaste tu contraseña?</a>
                        <a href='registro.jsp'>Registrarse</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
