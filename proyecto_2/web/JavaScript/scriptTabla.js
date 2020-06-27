function solicitarDatos()
{
    var datos = {'tabla':'tabla'};
   enviarDatos('servicio_tabla', JSON.stringify(datos), crearTabla);
}

function crearTabla(datos){
    
    
}