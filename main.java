import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        // el do-while ejecuta primero el codigo y despues revisa la condicion
        do{
            System.out.println("\n === Calculadora Trigonometrica ===" );
            System.out.println("1. Funciones hiperbolicas");
            System.out.println("2. Funciones trigonometricas");
            System.out.println("3. Funciones trigonometricas inversas");

            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = lector.nextInt();

            switch (opcion){
                case 1:
                    CalculadoraTrig.ejecutar(lector); 
                    break;
                case 2:
                    FuncionTrigonometrica_sen_cos_tan.ejecutar(lector);
                    break;
                case 3:
                    ejecutarOperacionesTrigonométricasInversas(lector);
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");

                    
            }
            

        }while (opcion != 0);
            
        lector.close();
    }
}
