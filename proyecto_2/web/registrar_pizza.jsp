<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <title>Registrar Pizza</title>
    </head>
    <body>
        <div id="wrapper">
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='index.jsp'>Inicio</a></li>
                    <li><a href='registro.jsp'>Registrarse</a></li>
                    <li><a href='registrar_pizza.jsp'>Registrar Pizza</a></li>
                    <li><a href='#About'>About</a></li>
                </ul>
            </div>
            <div id = 'contenedor-form' class= 'contenedor-form'>
                <div class='titulo'>
                    <label for="fname"><b>Registro de Nueva Pizza</b></label>
                </div>
                <form id="form_registro" accept-charset="UTF-8" onsubmit='return capturarPizza()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Nombre de la pizza: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_name_pizza' name='reg_name' placeholder='Ingrese nombre' autofocus>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Descripción </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_des_pizza' name='reg_des_pizza' placeholder='Ingrese una descripción'>
                        </div>
                    </div>
                    <div class="row">
                        <input type='submit' id='reg_btn' name='reg_btn' value='Registrarse'>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>