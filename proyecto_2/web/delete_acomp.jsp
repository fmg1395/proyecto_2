<%-- 
    Document   : delete_acomp
    Created on : 27 jun. 2020, 23:53:16
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
        <title>Borrar Acomp</title>
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
                    <label for="fname"><b>Eliminar acomp del menú</b></label>
                </div>
                <form id="form_eliminar" accept-charset="UTF-8" onsubmit='return borrarAcomp()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Id del acomp. a eliminar: </label>
                        </div>
                        <div class="col-75">
                            <input type='number' id='del_name_id' name='del_name' placeholder='Ingrese id' autofocus>
                        </div>
                    </div>
                    <div class="row">
                        <input type='submit' id='reg_btn' name='reg_btn' value='Eliminar'>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
