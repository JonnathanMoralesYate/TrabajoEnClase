let num1=0;
let num2=0;
let suma=0;
let resta=0;
let division=0;
let multiplicacion=0;
let op=0;

num1=parseInt(prompt("Digite el Primer numero:"));
num2=parseInt(prompt("Digite el Segundo numero:"));
op=prompt("Seleccione la Operacion: suma resta division multiplicacion");

if (op == "suma") {
    suma=num1+num2;
    alert("Resultado de la Operacion es: "+suma);
} else if(op == "resta") {
    resta=num1+num2;
    alert("Resultado de la Operacion es: "+resta);
} else if(op == "division") {
    division=num1/num2;
    alert("Resultado de la Operacion es: "+division);
} else if(op == "multiplicacion") {
    multiplicacion=num1*num2;
    alert("Resultado de la Operacion es: "+multiplicacion);
        }

