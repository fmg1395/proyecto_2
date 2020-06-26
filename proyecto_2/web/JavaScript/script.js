function captura_login()
{
    var usr = document.getElementById('usr_login').value;
    var pass = document.getElementById('pass_login').value;
    var dato = {
        'usuario': usr,
        'pass': pass
    };
    var usuario = new FormData();
    usuario.append('usuario', JSON.stringify(dato));
    console.log(`Credenciales son usr: ${usr} pass: ${pass}`);
    enviarDatos('servicio_login', usuario, redireccionar);
    return false;
}

function capturar_registro()
{
    var nombre = document.getElementById('reg_name').value;
    var apellidos = document.getElementById('reg_lastname').value;
    var cedula = document.getElementById('reg_id').value;
    var direccion = document.getElementById('reg_address').value;
    var telefono = document.getElementById('reg_phone').value;
    var pass = document.getElementById('reg_pass').value.toLowerCase();;
    var obj = {
        'nombre': nombre,
        'apellido': apellidos,
        'cedula': cedula,
        'direccion': direccion,
        'telefono': telefono,
        'pass': pass
    };
    
    let datos = new FormData();
    datos.append('usuario',JSON.stringify(obj));
    
    enviarDatos('servicio_registro_usr',datos,redireccionar);
    return false;
}

function capturarPizza()
{
    let nombre = document.getElementById('reg_name_pizza').value;
    let descripcion = document.getElementById('reg_des_pizza').value;
    let obj = {
        'nombre': nombre,
        'descripcion': descripcion
    };
    let datos = new FormData();
    datos.append('pizza', JSON.stringify(obj));

    enviarDatos('servicio_reg_pizza', JSON.stringify(obj), (res) => {
        console.log(res);
    });
    return false;
}

function enviarDatos(servicio, datos, callback)
{
    fetch(servicio, {
        method: 'POST',
        body: datos
    }).then((result) => {
        return result.json();
    }).then(callback);
}

function redireccionar(url)
{
    window.location.href = url.respuesta;
}