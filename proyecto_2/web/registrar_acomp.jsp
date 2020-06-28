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
        <title>Registrar Acompañamiento</title>
    </head>
    <body>
        <div id="wrapper">
            <div id='barra-nav' class='barra-nav'>
                <ul>
                     <li><a href='inicio.jsp'>Inicio</a></li>
                    <li><a href='registrar_acomp.jsp'>Crear acompañamiento</a></li>
                   <li><a href='update_acomp.jsp'>Modificar acompañamiento</a></li>
                    <li><a href='registrar_pizza.jsp'>Gestión Pizza</a></li>
                </ul>
            </div>
            <div id = 'contenedor-form' class= 'contenedor-form'>
                <div class='titulo'>
                    <label for="fname"><b>Registro de Nuevo Acomp.</b></label>
                </div>
                <form id="form_registro" accept-charset="UTF-8" onsubmit='return capturarAcomp()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Nombre del Acomp.: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_name_acomp' name='reg_name' placeholder='Ingrese nombre' autofocus>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Precio </label>
                        </div>
                        <div class="col-75">
                            <input type='number' id='reg_pre_acomp' name='reg_precio_' placeholder='Ingrese un precio'>
                        </div>
                    </div>
                    <div class="row">
                        <input type='submit' id='reg_btn' name='reg_btn' value='Registrar'>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
