let num=0;

num=prompt("Digite Un  Numero:");
alert("El numero es: "+num);

if(num>4){
   
    for(var i=1;i<=num;i++){
        
        if(i % 5 === 0){
            alert("Multiplos: "+i);
        }
        
    }
}else{
    alert("El Numero Ingresado No tiene Multiplos de 5 ")
}
