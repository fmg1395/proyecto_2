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
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="images/fav-pizza.png"/>
        <script src="JavaScript/script.js" type="text/javascript"></script>
        <script src="JavaScript/scriptTabla.js" type="text/javascript"></script>
        <title>Ordenar pizza</title>
    </head>
    <body onload = 'solicitarDatos()'>
       <div id='wrapper'>
            <h1>Ordenar pizza</h1>
            <div id='barra-nav' class='barra-nav'>
                <ul>
                    <li><a href='index.jsp'>Inicio</a></li>
                    <li><a href='registro.jsp'>Registrarse</a></li>
                    <li><a href='registrar_pizza.jsp'>Registrar Pizza</a></li>
                    <li><a href='#About'>Ordenar pizza</a></li>
                </ul>
            </div>
            <div id="cuerpo">
                <section>
                    <table class="tablaGeneral">
                        <thead>
                            <tr>
                                <th style="width: 60px;">Pizza</th>
                                <th style="width: 180px;">Descripción</th>
                                <th style="width: 90px;">Tamaño</th>
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
                                <td colspan="5" class="c2b">Total general:</td>
                                <td id="totalGeneral" class="c2c" />
                            </tr>
                        </tfoot>
                    </table>
                </section>
            </div>
            <button type="button" class="trans" onclick="recuperarDatosPizza()"><span>Siguiente</span></button>
        </div>
    </body>
</html>
