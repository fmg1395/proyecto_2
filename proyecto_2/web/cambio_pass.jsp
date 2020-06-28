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
        <title>Cambio de Contraseña</title>
    </head>
    <body>
        <div id="wrapper">
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='inicio.jsp'>Inicio</a></li>
                     <li><a href='cambio_datos.jsp'>Actualizar Datos</a></li>
                    <li><a href='orden_pizza.jsp'>Ordenar pizza</a></li>
                    <li><a href='rastreo.jsp'>Rastrear orden</a></li>
                </ul>
            </div>
            <div id = 'contenedor-form' class= 'contenedor-form'>
                <div class='titulo'>
                    <label for="fname"><b>Cambiar Contraseña</b></label>
                </div>
                <form id="form_registro" accept-charset="UTF-8" onsubmit='return cambioPass()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Cédula: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='chg_cedula' name='chg_cedula' placeholder='Ingrese cédula' autofocus>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Ingrese nueva contraseña</label>
                        </div>
                        <div class="col-75">
                            <input type='password' id='chg_pass' name='chg_pass' placeholder='Ingrese nueva contraseña'>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Confirmar nueva contraseña </label>
                        </div>
                        <div class="col-75">
                            <input type='password' id='chg_conf_pass' name='chg_conf_pass' placeholder='Confirme contraseña'>
                        </div>
                    </div>
                    <div class="row">
                        <input type='submit' id='reg_btn' name='reg_btn' value='Enviar'>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>