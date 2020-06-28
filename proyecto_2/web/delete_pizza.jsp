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
        <title>Borrar Pizza</title>
    </head>
    <body>
        <div id="wrapper">
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='inicio.jsp'>Inicio</a></li>
                    <li><a href='registrar_pizza.jsp'>Registrar pizza</a></li>
                    <li><a href='update_pizza.jsp'>Modificar pizza</a></li>
                    <li><a href='registrar_acomp.jsp'>Gestion Acompañamientos</a></li>
                </ul>
            </div>
            <div id = 'contenedor-form' class= 'contenedor-form'>
                <div class='titulo'>
                    <label for="fname"><b>Eliminar pizza del menú</b></label>
                </div>
                <form id="form_eliminar" accept-charset="UTF-8" onsubmit='return borrarPizza()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Id de la pizza a eliminar: </label>
                        </div>
                        <div class="col-75">
                            <input type='number' id='del_name_pizza' name='del_name' placeholder='Ingrese id' autofocus>
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
