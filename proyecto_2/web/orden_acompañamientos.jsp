<%-- 
    Document   : orden_acompañamientos
    Created on : 26 jun. 2020, 21:17:10
    Author     : Kike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <html>
    <head>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <title>Ordenar pizza</title>
    </head>
    <body>
       <div id='wrapper'>
            <h1>Ordenar acompañamientos</h1>
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='index.jsp'>Inicio</a></li>
                    <li><a href='registro.jsp'>Registrarse</a></li>
                    <li><a href='registrar_pizza.jsp'>Registrar Pizza</a></li>
                     <li><a href='rastreo.jsp'>Rastrear orden</a></li>
                </ul>
            </div>
            <div id="cuerpo">
                <section>
                    <table class="tablaGeneral">
                        <thead>
                            <tr>
                                <th style="width: 60px;">Extra</th>
                                <th style="width: 90px;">Precio</th>
                                <th style="width: 90px;">Cantidad</th>
                                <th style="width: 120px;">Total</th>
                                <th style="width: 48px;">&nbsp;</th>
                            </tr>
                        </thead>
                        <tbody id="cuerpoTabla"></tbody>
                        <tfoot>
                            <tr>
                                <td>&nbsp;</td>
                                <td colspan="3" class="c2b">Total general:</td>
                                <td id="totalGeneral" class="c2c" />
                            </tr>
                        </tfoot>
                    </table>
                </section>
            </div>
            <button type="button" class="trans" onclick="recuperarDatosExtras()"><span>Siguiente</span></button>
        </div>
    </body>
</html>
