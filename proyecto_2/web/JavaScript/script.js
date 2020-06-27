function captura_login()
{
    var usr = document.getElementById('usr_login').value;
    var pass = document.getElementById('pass_login').value;
    var dato = {
        'cedula': usr,
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
    var pass = document.getElementById('reg_pass').value.toLowerCase();
    ;
    var obj = {
        'nombre': nombre,
        'apellido': apellidos,
        'cedula': cedula,
        'direccion': direccion,
        'telefono': telefono,
        'pass': pass
    };

    let datos = new FormData();
    datos.append('usuario', JSON.stringify(obj));

    enviarDatos('servicio_registro_usr', datos, redireccionar);
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
function borrarPizza()
{
    let id=document.getElementById('del_name_pizza').value;
    let obj={
        'id':id
    };
    let datos=new FormData();
    datos.append('pizza',JSON.stringify(obj));
    enviarDatos('servicio_del_pizza',JSON.stringify(obj),(res)=>{
        console.log(res);
    });
    return false;
}
function modificarPizza()
{
    let id=document.getElementById('upd_id_pizza').value;
    let name=document.getElementById('upd_name_pizza').value;
    let desc=document.getElementById('upd_des_pizza').value;
    let obj={
        'id':id,
        'nombre': name,
        'descripcion': desc
    };
    let datos=new FormData();
    datos.append('pizza',JSON.stringify(obj));
    enviarDatos('servicio_upd_pizza',JSON.stringify(obj),(res)=>{
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

function cambioPass()
{
    let cedula = document.getElementById('chg_cedula').value;
    let pass1 = document.getElementById('chg_pass').value;
    let pass2 = document.getElementById('chg_conf_pass').value;

    if (pass1 === pass2)
    {
        let obj = {
            'cedula': cedula,
            'pass': pass1
        };
        let datos = new FormData();
        datos.append('pass', JSON.stringify(obj));

        enviarDatos('servicio_pass', datos,redireccionar);
        return false;
    } else
    {
        let cedula = document.getElementById('chg_cedula').value = "";
        let pass1 = document.getElementById('chg_pass').value = "";
        let pass2 = document.getElementById('chg_conf_pass').value = "";
    }
}