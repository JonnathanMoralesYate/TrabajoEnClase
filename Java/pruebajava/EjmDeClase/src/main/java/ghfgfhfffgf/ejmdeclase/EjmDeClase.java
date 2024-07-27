package ghfgfhfffgf.ejmdeclase;

import java.util.Scanner;

public class EjmDeClase {
    // Declaracion de Aributos
    private String nombre;
    private int edad;
    
    // Constructor Inicializa los Atributos
    public EjmDeClase(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
    }
    
//Metodo
    public void saludar(){
        System.out.println("Hola, soy "+ nombre + " y Tengo "+edad+ " Años");
    }
    
//Metodo Set 
    public void setnombre(String pnombre){
        this.nombre = pnombre;
    }
    
    public void setedad(int pedad){
        this.edad = pedad;
    }
    
//Metodo Get 
    public String getnombre(){
        return nombre;
    }
    
    public int getedad(){
        return edad;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
// Objeto c1 se crea para hacer la instancias
        EjmDeClase c1= new EjmDeClase("Pedro", 55);
        EjmDeClase c2= new EjmDeClase("Maria", 50);
        c1.saludar();
        c2.saludar();
        
        
        String name = c1.getnombre();
        System.out.println(""+name);
        
        c1.setnombre("Wilson");
        
        System.out.println(""+c1.nombre);
        
        System.out.println(c2.getedad());
        
       // String Nombre = sc.nextLine();
       
        
    }
}