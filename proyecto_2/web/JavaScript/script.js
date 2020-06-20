function captura_login()
{
    var usr = document.getElementById('usr_login').value;
    var pass = document.getElementById('pass_login').value;
    
    console.log(`Credenciales son usr: ${usr} pass: ${pass}`);
    
}

function capturar_registro()
{
    var nombre= document.getElementById('reg_name').value;
    var apellidos = document.getElementById('reg_lastname').value;
    var usuario = document.getElementById('reg_usr').value;
    var cedula = document.getElementById('reg_id').value;
    var direccion = document.getElementById('reg_address').value;
    var telefono = document.getElementById('reg_phone').value;
    
    var obj = {
        'nombre':nombre,
        'apellidos':apellidos,
        'usuario':usuario,
        'cedula':cedula,
        'direccion':direccion,
        'telefono':telefono
    };
    
    console.log(`Registro: ${obj}`);
    
}