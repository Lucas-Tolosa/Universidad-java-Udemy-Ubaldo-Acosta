//tipo de dato string
var nombre="Carlos";
console.log(nombre);
//tipo de dato numerico
var numero= 1000;
console.log(numero);

nombre= 10;
console.log(typeof nombre);
//tipo de datos objetos
var objetito ={
    nombre: "Lucas",
    apellido:"tolosa",
     telefono: "412312312"
}
console.log(typeof objetito);
//tipo de dato boolean
var ejemplo="true";

//tipo de dato funcion

function miFuncion(){
console.log(typeof miFuncion);
}
miFuncion();
//tipo de dato symbol
var simbolo= Symbol("mi simbolo");
console.log(typeof simbolo);

//tipo clase es una function

class Persona{
    constructor(nombre, apellido){
        this.nombre=nombre;
        this.apellido=apellido;

    }
}
console.log(typeof Persona);


//tipo de dato undefined

var x;
console.log(typeof x);

//null

var y=null;
console.log(typeof y);