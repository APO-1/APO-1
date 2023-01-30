
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
    
        
    }

}