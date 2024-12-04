
/**
 *
 * @author chente15
 */
import java.util.Scanner;

public class MejorEgresado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //DECLARACION DE VARIABLES
        String Nombre, nombreEstudiante, primerMejor_estudiante = null, segundoMejor_estudiante = null;
        double promedio, primerMejor_Promedio = 0, segundoMejor_promedio = 0;
        int cont, limite;
        //SOLICITAR EL LIMITE DE ESTUDIANTES
        System.out.print("Ingrese el limite de estudiantes: ");
        limite = scanner.nextInt();
        scanner.nextLine();
        //CICLO PARA INGRESAR DATOS POR CADA ESTUDIANTE
        for (cont = 0; cont < limite; cont++) {
            //AUTOGENERA EL NOMBRE DEL ESTUDIANTE ( ESTUDIANTE 1, ESTUDIANTE 2, ESTUDIANTE 3, etc)
            nombreEstudiante = "estudiante" + (cont + 1);
            System.out.println("Nombre: " + nombreEstudiante);
            //SOLICITAR EL PROMEDIO DEL ESTUDIANTE
            System.out.print("Ingrese el promedio del " + nombreEstudiante + ": ");
            promedio = scanner.nextDouble();
            scanner.nextLine(); //LEE LA LINEA COMPLETA
            //COMPARAR PROMEDIOS Y ACTUALIZAR LOS MEJORES
            if (promedio > primerMejor_Promedio) {
                segundoMejor_estudiante = primerMejor_estudiante;
                segundoMejor_promedio = primerMejor_Promedio;
                primerMejor_estudiante = nombreEstudiante;
                primerMejor_Promedio = promedio;
            } else if (promedio > segundoMejor_promedio) {
                segundoMejor_estudiante = nombreEstudiante;
                segundoMejor_promedio = promedio;
            }
        }
        //MOSTRAR RESULTADOS
        System.out.println("Los mejores egresados son:");
        System.out.println("1. Nombre: " + primerMejor_estudiante + ", Promedio: " + primerMejor_Promedio);
        System.out.println("2. Nombre: " + segundoMejor_estudiante + ", Promedio: " + segundoMejor_promedio);
    }
}

/* 
* run:
* Ingrese el limite de estudiantes: 5
* Nombre: estudiante1
* Ingrese el promedio del estudiante1: 9,5
* Nombre: estudiante2
* Ingrese el promedio del estudiante2: 9,7
* Nombre: estudiante3
* Ingrese el promedio del estudiante3: 9,9
* Nombre: estudiante4
* Ingrese el promedio del estudiante4: 9,3
* Nombre: estudiante5
* Ingrese el promedio del estudiante5: 9,1
* Los mejores egresados son:
* 1. Nombre: estudiante3, Promedio: 9.9
* 2. Nombre: estudiante2, Promedio: 9.7
 */
