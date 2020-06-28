/*
 * <%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>
 */

var orden_pizza;


function solicitarDatos()
{
    var datos = {'tabla': 'tabla'};
    enviarDatos('servicio_tabla', JSON.stringify(datos), crearTabla);
    return false;
}

function crearTabla(datos) {

    let refTabla = document.getElementById('cuerpoTabla');
    let lista = datos.lista;

    for (let i = 0; i < lista.length; i++)
    {
        let row = refTabla.insertRow(-1);
        let pizza = row.insertCell(-1);
        let descripcion = row.insertCell(-1);
        let tamano = row.insertCell(-1);
        let precio = row.insertCell(-1);
        let cantidad = row.insertCell(-1);
        let total = row.insertCell(-1);
        let drop = document.createElement('select');
        let lista_tipos = lista[i].tipos;

        total.setAttribute('id', `total_${i}`);

        let cant = document.createElement('input');
        cant.setAttribute('type', 'number');
        cant.setAttribute('min', 0);
        cant.setAttribute('value', 0);
        cant.setAttribute('id', `input_${i}`);
        cant.onchange = updateTotal;

        drop.setAttribute('onchange', 'dropFunction(this)');
        drop.setAttribute('id', `select_${i}`);

        precio.setAttribute('id', `precio_${i}`);


        for (let j = 0; j < lista_tipos.length; j++)
        {
            let opcion = document.createElement('option');
            opcion.value = lista_tipos[j].precio;
            opcion.text = lista_tipos[j].tamano;
            drop.appendChild(opcion);
        }


        pizza.innerHTML = lista[i].nombre;
        descripcion.innerHTML = lista[i].descripcion;
        tamano.appendChild(drop);
        cantidad.appendChild(cant);
        precio.innerHTML = drop.options[0].value;
        total.innerHTML = 0;
    }
}

function dropFunction(element)
{
    let valor = element.options[element.selectedIndex].value;
    let indice = element.id.split('_')[1];

    let celda = document.getElementById(`precio_${indice}`);
    let total = document.getElementById(`total_${indice}`);

    let cantidad = document.getElementById(`input_${indice}`).value;
    celda.innerHTML = valor;
    total.innerHTML = valor * cantidad;
    totalGeneral();
}

function updateTotal()
{
    let indice = event.target.id.split('_')[1];
    let total = document.getElementById(`total_${indice}`);
    let precio = document.getElementById(`precio_${indice}`).innerHTML;
    let cantidad = event.target.value;

    total.innerHTML = precio * cantidad;
    totalGeneral();
}

function totalGeneral()
{
    let tabla = document.getElementById('cuerpoTabla');
    let total_general = document.getElementById('totalGeneral');
    let total_final = 0;

    for (let i = 0; i < tabla.rows.length; i++)
    {
        let precio = document.getElementById(`total_${i}`);
        total_final += parseInt(precio.innerHTML, 10);
    }
    total_general.innerHTML = total_final;
}

function recuperarDatosPizza()
{
    let refTabla = document.getElementById('cuerpoTabla');
    let size = refTabla.rows.length;
    let celda_precio;
    let lista_pedido = [];
    for (let i = 0; i < size; i++)
    {
        celda_precio = document.getElementById(`total_${i}`);

        let valor = parseInt(celda_precio.innerHTML,10);

        if (valor !== 0)
        {
            lista_pedido.push(procesarFila(refTabla.rows[i]));
        } else {
            console.log('indefinido');
        }
    }
    let total = parseFloat(document.getElementById('totalGeneral').innerHTML);
    orden_pizza = {
        'pedido':lista_pedido,
        'total':total  
    };
    
    return orden_pizza;
}

function procesarFila(fila)
{
    
    let pizza = fila.childNodes[0].innerHTML;
    let tamano = fila.childNodes[2].childNodes[0].selectedOptions[0].innerHTML;
    let cantidad = parseInt(fila.childNodes[4].childNodes[0].value,10);
    let total = parseFloat(fila.childNodes[5].innerHTML,10);
    
    let resultado = {
        'pizza':pizza,
        'tamano':tamano,
        'cantidad':cantidad,
        'total':total
    };
    return resultado;
}
