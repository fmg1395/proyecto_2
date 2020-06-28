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
        <title>Modificar Pizza</title>
    </head>
    <body>
        <div id="wrapper">
            <div id='barra-nav' class='barra-nav'>
                <ul>
                 <li><a href='inicio.jsp'>Inicio</a></li>
                    <li><a href='registrar_pizza.jsp'>Registrar pizza</a></li>
                    <li><a href='delete_pizza.jsp'>Eliminar pizza</a></li>
                    <li><a href='registrar_acomp.jsp'>Gestion Acompañamientos</a></li>
                </ul>
            </div>
            <div id = 'contenedor-form' class= 'contenedor-form'>
                <div class='titulo'>
                    <label for="fname"><b>Modificar Pizza</b></label>
                </div>
                <form id="form_registro" accept-charset="UTF-8" onsubmit='return modificarPizza()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Id de la pizza: </label>
                        </div>
                        <div class="col-75">
                            <input type='number' id='upd_id_pizza' name='upd_id' placeholder='Ingrese el id' autofocus>
                        </div>
                        <div class="col-25">
                            <label>Nombre de la pizza: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='upd_name_pizza' name='upd_name' placeholder='Ingrese nombre'>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Descripción </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='upd_des_pizza' name='upd_des_pizza' placeholder='Ingrese una descripción'>
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
