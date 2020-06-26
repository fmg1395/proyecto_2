<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <title>Registro Pizza</title>
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
                    <label for="fname"><b>Registro de Cliente</b></label>
                </div>
                <form id="form_registro" accept-charset="UTF-8" onsubmit='return capturar_registro()'>
                    <div class="row">
                        <div class="col-25">
                            <label>Nombre: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_name' name='reg_name' placeholder='Ingrese su nombre' autofocus>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Apellidos: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_lastname' name='reg_lastname' placeholder='Ingrese sus apellidos'>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Cédula: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_id' name='reg_id' placeholder='Ingrese su cédula' >
                        </div>
                    </div>
                     <div class="row">
                        <div class="col-25">
                            <label>Constraseña: </label>
                        </div>
                        <div class="col-75">
                            <input type='password' id='reg_pass' name='reg_pass' placeholder='Ingrese una contraseña' >
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Dirección: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_address' name='reg_address' placeholder='Ingrese su dirección' >
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label>Teléfono: </label>
                        </div>
                        <div class="col-75">
                            <input type='text' id='reg_phone' name='reg_phone' placeholder='Ingrese su telefono' >
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
