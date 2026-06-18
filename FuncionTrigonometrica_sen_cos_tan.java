import java.util.Scanner;   //Para pedir datos en la terminal, necesitamos importar una biblioteca o no podremos realizar dicha accion

public class FuncionTrigonometrica_sen_cos_tan {    //Como punto importante, el documento debe de llevar el nombre de la clase principal
    public static void main (String[]args){ 
        Scanner lector=new Scanner (System.in); //Se le da un nuevo nombre a la biblioteca Scanner que sera "lector"
        System.out.println("Calculadora Trigonometrica para un ángulo a: sena, cosa, tana");    //Imprime el mensaje en terminal 
        System.out.println("Introduzca la operacion a realizar:");  //Imprime el mensaje en terminal
        System.out.println("1. Seno");  //Imprime el mensaje en terminal
        System.out.println("2. Coseno");    //Imprime el mensaje en terminal
        System.out.println("3. Tangente");  //Imprime mensaje en terminal 
        int opcion = lector.nextInt();
            //En cada variable, es importante poner el tipo de dato antes junto con punto y coma al terminar, en este caso es un int y se usa la biblioteca Scanner
            //El .nextInt permite recibir solo numeros enteros, en este caso sera en el intervalo de 1 a 3
            
            if (opcion < 1 || opcion>3) { //Si se escoge otra opcion, imprimira un mensaje de error
                System.out.println("ERROR: opcion invalida");
            }

        System.out.println("Introduzca el angulo en grados:");
        double angulo = lector.nextDouble();
            //Esta variable recibe el angulo y .nextDouble permite recibir decimales 
        
            if (opcion == 1) {  //Si se escoge la opcion 1, se ejecuta seno
            double radianes = Math.toRadians(angulo); //Convierte el angulo a radianes con la biblioteca Math
            System.out.println("Seno = "+ Math.sin(radianes)); //Y los radianes los convierte a una aproximacion de seno con la biblioteca Math
        } else if (opcion == 2) { //Si se escoge la opcion 2, se ejecuta coseno
            double radianes = Math.toRadians(angulo); //Convierte el angulo a radianes con la biblioteca Math
            System.out.println("Coseno = "+ Math.cos(radianes));//Y los radianes los convierte a una aproximacion de coseno con la biblioteca Math
        } else if (opcion == 3) { //Si se secoge la opcion 3, se ejecuta tangente
            double radianes = Math.toRadians(angulo); //Convierte el angulo a radianes con la biblioteca Math
            System.out.println("Tangente = "+ Math.tan(radianes)); //Y los radianes los convierte a una aproximacion de tangente con la biblioteca Math
        } 
        lector.close(); //Se cierra la biblioteca para que no tenga conflicto con otras clases
    }
}    
 