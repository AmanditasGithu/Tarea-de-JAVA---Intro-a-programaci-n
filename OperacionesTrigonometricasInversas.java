import java.util.Scanner; //se importa la libreria para poder usar la terminal


public class OperacionesTrigonometricasInversas {
    public static void main(Scanner scanner) {
        

        System.out.println("===== Angulos Inversos =====");
        System.out.println("1. Arcoseno(sen⁻¹)");
        System.out.println("2. Arcocoseno (cos⁻¹)");
        System.out.println("3. Arcotangente(tan⁻¹)");
         System.out.print("Selecciona una opción (1, 2 o 3): ");
        int opcion = scanner.nextInt();
        //compara la opcion seleccionanda y retorna opcion invalida si no está dentro de las opciones
        if (opcion< 1 || opcion > 3){
            System.out.println("Opcion Invalida");
            
            return;
        }   
        double valor = 0.0;
        double anguloRadianes = 0.0;
        boolean operacionValida = true;


        switch (opcion){
            //los casos es lo que pasa depiendo de la opcion seleccionada
            //tambien se usa Math, para realizar las operaciones de arcosen, arcocos y arcotan
            case 1:
                // arcoseno
                System.out.print("Ingrese un valor entre -1 y 1");
                valor = scanner.nextDouble();
                if (valor >= -1 && valor <= 1){
                    anguloRadianes = Math.asin(valor);
                } else{
                    System.out.println("Error: El dominio para arcoseno debe estar entre -1 y 1");
                    operacionValida = false;
                }
                break;
            case 2:
                //Arcocoseno
                System.out.print("Ingrese un valore entre -1 y 1");
                valor = scanner.nextDouble();
                if (valor >= -1 && valor <= 1){
                    anguloRadianes = Math.acos(valor);
                }else{
                    System.out.println("Error: El dominio para arcocoseno debe estar entre -1 y 1");
                    operacionValida = false;
                }
                break;
            case 3:
                //Arcotangente
                anguloRadianes = Math.atan(valor);
                break;
            default:
                System.out.println("Opción inválida");
                operacionValida = false;
                break;
        }
        
        if (operacionValida) {
            //Conversion del resultado a grados 
            //Aqui se usa Math para hacer la conversion de radianes a grados
            double anguloGrados = Math.toDegrees(anguloRadianes);
            System.out.println("\n --- Resultados ---");
            System.out.println("Ángulo en radianes: " + anguloRadianes + " rad");
            System.out.println("Ángulo en grados: " + anguloGrados + " °");

        }

         

    }
    
}
