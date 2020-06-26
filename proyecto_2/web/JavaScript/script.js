function captura_login()
{
    var usr = document.getElementById('usr_login').value;
    var pass = document.getElementById('pass_login').value;

    var dato = {
        'usuario': usr,
        'pass': pass
    };

    var usuario = new FormData();
    usuario.append('usuario',JSON.stringify(dato));


    console.log(`Credenciales son usr: ${usr} pass: ${pass}`);
    enviarDatos('servicio_login', usuario, redireccionar);
    return false;
}

function capturar_registro()
{
    var nombre = document.getElementById('reg_name').value;
    var apellidos = document.getElementById('reg_lastname').value;
    var usuario = document.getElementById('reg_usr').value;
    var cedula = document.getElementById('reg_id').value;
    var direccion = document.getElementById('reg_address').value;
    var telefono = document.getElementById('reg_phone').value;

    var obj = {
        'nombre': nombre,
        'apellidos': apellidos,
        'usuario': usuario,
        'cedula': cedula,
        'direccion': direccion,
        'telefono': telefono
    };

    console.log(`Registro: ${obj}`);
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