/**
 *
 * @author Daniel Matute
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimuladorFutbol {
    public static void main(String[] args) {
        //Declarar variables
        int i , edad , goles, golesEquipoA , golesEquipoB;
        String nombre;
        //Importar Random
        Random random= new Random();
        List<String[]> equipoA=new ArrayList<>();
        List<String[]> equipoB=new ArrayList<>();
        
       //Definir Posiciones
       String[] posiciones={
            "Portero",
            "Defensa", "Defensa", "Defensa", "Defensa",
            "Mediocampista", "Mediocampista", "Mediocampista", "Mediocampista",
            "Delantero", "Delantero"
       };
       //Generar Jugadores para el equipo A
       for(i=0;  i < 11 ; i++){
           nombre = "Jugador A"+(i+1);
           edad =random.nextInt(12)+18; //Edad aletoria entre 18 y 29 
           goles =random.nextInt(2); //Goles aletorios entre (0 o 1)
           equipoA.add(new String[]{nombre, posiciones[i], String.valueOf(edad), String.valueOf(goles)});
        }

        // Generar jugadores para el equipo B
        for (i = 0; i < 11; i++) {
            nombre = "Jugador B" + (i + 1);
            edad = random.nextInt(12) + 18;  // Edad aleatoria entre 18 y 29
            goles = random.nextInt(2);       // Goles aleatorios (0 o 1)
            equipoB.add(new String[]{nombre, posiciones[i], String.valueOf(edad), String.valueOf(goles)});
        }

        // Mostrar equipo A
        System.out.println("\nEQUIPO A");
        System.out.println("NOMBRE     | POSICIÓN        | EDAD | GOLES");
        for (String[] jugador : equipoA) {
            System.out.printf("%-10s | %-15s | %-3s  | %-3s\n", jugador[0], jugador[1], jugador[2], jugador[3]);
        }

        // Mostrar equipo B
        System.out.println("\nEQUIPO B");
        System.out.println("NOMBRE     | POSICIÓN        | EDAD | GOLES");
        for (String[] jugador : equipoB) {
            System.out.printf("%-10s | %-15s | %-3s  | %-3s\n", jugador[0], jugador[1], jugador[2], jugador[3]);
        }

        // Calcular goles equipo A
        golesEquipoA = 0;
        for (String[] jugador : equipoA) {
            golesEquipoA += Integer.parseInt(jugador[3]);
        }

        // Calcular goles equipo B
        golesEquipoB = 0;
        for (String[] jugador : equipoB) {
            golesEquipoB += Integer.parseInt(jugador[3]);
        }

        // Mostrar estadísticas
        System.out.println("\nESTADÍSTICA DEL PARTIDO:");
        System.out.println("Goles Equipo A: " + golesEquipoA);
        System.out.println("Goles Equipo B: " + golesEquipoB);

        // Determinar el ganador o empate
        if (golesEquipoA > golesEquipoB) {
            System.out.println("Equipo ganador: Equipo A.");
        } else if (golesEquipoB > golesEquipoA) {
            System.out.println("Equipo ganador: Equipo B.");
        } else {
            System.out.println("Empate. Se simula tanda de penales...");

            // Simulación de penales
            int golesPenalesA = random.nextInt(5) + 1;  // Goles aleatorios de 1 a 5
            int golesPenalesB = random.nextInt(5) + 1;  // Goles aleatorios de 1 a 5

            System.out.println("Penales Equipo A: " + golesPenalesA);
            System.out.println("Penales Equipo B: " + golesPenalesB);

            if (golesPenalesA > golesPenalesB) {
                System.out.println("Equipo ganador por penales: Equipo A.");
            } else {
                System.out.println("Equipo ganador por penales: Equipo B.");
            }
        }
    }
}
/***
 * run:

 *EQUIPO A
 *NOMBRE     | POSICI�N        | EDAD | GOLES
 *Jugador A1 | Portero              | 26      | 1  
 *Jugador A2 | Defensa             | 21      | 1  
 *Jugador A3 | Defensa             | 21      | 0  
 *Jugador A4 | Defensa             | 28      | 1  
 *Jugador A5 | Defensa             | 24      | 0  
 *Jugador A6 | Mediocampista  | 18      | 0  
 *Jugador A7 | Mediocampista  | 29      | 0  
 *Jugador A8 | Mediocampista  | 18      | 0  
 *Jugador A9 | Mediocampista  | 28     | 1  
 *Jugador A10 | Delantero         | 29     | 0  
 *Jugador A11 | Delantero          | 28     | 1  

 *EQUIPO B
 *NOMBRE     | POSICI�N         | EDAD | GOLES
 *Jugador B1 | Portero               | 22      | 0  
 *Jugador B2 | Defensa              | 24      | 0  
 *Jugador B3 | Defensa              | 18       | 0  
 *Jugador B4 | Defensa              | 24       | 1  
 *Jugador B5 | Defensa              | 28       | 0  
 *Jugador B6 | Mediocampista   | 22      | 0  
 *Jugador B7 | Mediocampista   | 27      | 1  
 *Jugador B8 | Mediocampista   | 26      | 0  
 *Jugador B9 | Mediocampista   | 28      | 1  
 *Jugador B10 | Delantero          | 26      | 1  
 *Jugador B11 | Delantero           | 19      | 1  

 *ESTAD�STICA DEL PARTIDO:
 *Goles Equipo A: 5
 *Goles Equipo B: 5
 *Empate. Se simula tanda de penales...
 *Penales Equipo A: 2
 *Penales Equipo B: 1
 *Equipo ganador por penales: Equipo A.
 *BUILD SUCCESSFUL (total time: 0 seconds)
 */