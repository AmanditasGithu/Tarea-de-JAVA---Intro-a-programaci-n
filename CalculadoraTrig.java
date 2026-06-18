import java.util.Scanner;  //Importo la herramienta para leer la terminal. Fun fact: a diferencia de Python en Java los comentarios son con //
public class CalculadoraTrig {
     //Java trabaja dentro de clases absolutamente todo codigo, la clase debe de llamarse igual que el archivo
    public static void ejecutar (Scanner lector){ //Por default todo programa en Java debe empezar de esta forma, todo lo que hay dentro de los corchetes se ejecuta en ese orden
        //el Scanner lector, se reutiliza del main
        
        System.out.println("CALCULADORA DE FUNCIONES HIPERBOLICAS");//println hace un print por linea, print es mas simple. Por default terminan con ;
        System.out.print("Introduzca el valor de un angulo");
        double angulo = lector.nextDouble(); //Se lee el numero que escribe el usuario y se guarda en la variable angulo. Double se usa en Java para indicar decimales 
        double senoHiperbolico = Math.sinh(angulo); //Para calcular las funciones hiperbolicas se utilizan las librerias predeterminadas de MATH 
        double cosenoHiperbolico = Math.cosh(angulo);//Ellas hacen el calculo de una y lo entregan
        double tangenteHiperbolico = Math.tanh(angulo);

        System.out.println("Resultados del angulo ="+angulo+":"); //+ sirve para concatenar en este caso
        System.out.println("Seno =" + senoHiperbolico); //println ya que cuando solo puse print simple todo salio pegado y no es visualmente agradable
        System.out.println("Coseno =" + cosenoHiperbolico);
        System.out.println("Tangente = " + tangenteHiperbolico);
         


    }
}

