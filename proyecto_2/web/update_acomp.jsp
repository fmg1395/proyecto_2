<%-- 
    Document   : update_acomp
    Created on : 27 jun. 2020, 23:44:03
    Author     : Kike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <title>Modificar Acompañamiento</title>
    </head>
    <body>
        <div id="wrapper">
            <div id='barra-nav' class='barra-nav'>
                <ul>
                     <li><a href='inicio.jsp'>Inicio</a></li>
                    <li><a href='registrar_acomp.jsp'>Crear acompañamiento</a></li>
                   <li><a href='delete_acomp.jsp'>Eliminar acompañamiento</a></li>
                    <li><a href='registrar_pizza.jsp'>Gestión Pizza</a></li>
                </ul>
            </div>
            <div id = 'contenedor-form' class= 'contenedor-form'>
                <div class='titulo'>
                    <label for="fname"><b>Registro de Nuevo Acomp.</b></label>
                </div>
                <form id="form_registro" accept-charset="UTF-8" onsubmit='return modificarAcomp()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Id del acompañamiento </label>
                        </div>
                        <div class="col-75">
                            <input type='number' id='upd_id_acomp' name='upd_id' placeholder='Ingrese el id' autofocus>
                        </div>
                        <div class="col-25">
                            <label>Nombre del acomp. </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='upd_name_acomp' name='upd_name' placeholder='Ingrese nombre'>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Precio </label>
                        </div>
                        <div class="col-75">
                            <input type='number' id='upd_pre_acomp' name='upd_pre_acomp'>
                        </div>
                    </div>
                    <div class="row">
                        <input type='submit' id='upd_btn' name='reg_btn' value='Actualizar'>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>

