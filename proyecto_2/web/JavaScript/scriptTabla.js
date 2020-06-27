function solicitarDatos()
{
    var datos = {'tabla': 'tabla'};
    enviarDatos('servicio_tabla', JSON.stringify(datos), crearTabla);
    return false;
}

function crearTabla(datos) {

    console.log("prueba recibo de datos");
    
    let obj = datos;
    let obj1 = datos.pizza;

console.log('termina prueba');

}