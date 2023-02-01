
public class Main{

    public static void main(String[] args){
        
        // declaración de las variables. 
        int a; // entero (32 bits)
        char b; // caracteres 
        double c; // punto flotante (64 bits -> 32 parte entera, 32 parte decimal)
        // 3 -> esta almacenado en 32 bits | .756 esta en los otros 32 bits 
        String d; // cadenas de texto 
        float e; // punto flotante de 32 bits -> 16 para la parte entera 
        // y 16 para la parte decimal 


        // Inicializar las Variables
        a = 10;
        b = 'd'; 
        c = 3.756; 
        d = "Nombre";  

        System.out.println("variable entera: " + a+d); // imprimir el valor de a  
        String j = d + a; 
        System.out.println(j);

        System.out.println(5%2); 

        System.out.println(4%2); 

        int x = 5; 
        int y = 6; 
        int z = sum(x, y);
        System.out.println(z); 

        int t = 5;

        passByValue(t);

        System.out.println("No se modifica el valor de t: "+t);

        // se modifica el valor de la variable al 
        // reaccinarlo con el retorno de la 
        // función 'updateValue()'
        t = updateValue(t); 
        System.out.println("se modifica el valor de t: " + t);

        
    } // método main

    public static int sum(int a, int b){

        int c = a + b;
        return c; 
    }

    // No modifica el valor del párametro 
    // en java los párametros se pasan por valor 
    // (se pasa a la función una copia del valor)
    public static void passByValue(int a){
        System.out.println("el valor de a es: " + a); 
        a += a; 
        System.out.println("El valor de a es: " + a); 

    }

    // retornar un valor entero
    public static int updateValue(int a){
        a += a;
        return a; 
    }


} // Class Main
