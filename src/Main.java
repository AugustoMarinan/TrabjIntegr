import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // verificar que se hayan proporcionado 2 rutas de archivo como argumentos
        if (args.length != 2) {
            System.out.println("Por favor proporcione dos rutas de archivo como argumentos.");
            return;
        }

        // leer el archivo de partidos y crear una lista de partidos para la ronda
        ArrayList<Partido> partidos = new ArrayList<>();
        try {
            File archivoPartidos = new File(args[0]);
            Scanner scannerPartidos = new Scanner(archivoPartidos);

            while (scannerPartidos.hasNextLine()) {
                String[] datosPartido = scannerPartidos.nextLine().split(",");
                Partido partido = new Partido(datosPartido[0], datosPartido[1], datosPartido[2]);
                partidos.add(partido);
            }

            scannerPartidos.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el archivo de partidos.");
            return;
        }

        // leer el archivo de pronósticos y crear una lista de pronósticos
        ArrayList<String> pronosticos = new ArrayList<>();
        try {
            File archivoPronosticos = new File(args[1]);
            Scanner scannerPronosticos = new Scanner(archivoPronosticos);

            while (scannerPronosticos.hasNextLine()) {
                String[] datosPronostico = scannerPronosticos.nextLine().split(",");
                for (String resultado : datosPronostico) {
                    pronosticos.add(resultado);
                }
            }

            scannerPronosticos.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el archivo de pronósticos.");
            return;
        }

        // verificar que la cantidad de pronósticos coincida con la cantidad de partidos
        if (pronosticos.size() != partidos.size() * 2) {
            System.out.println("La cantidad de pronósticos no coincide con la cantidad de partidos.");
            return;
        }

        // comparar los resultados reales con los pronósticos y sumar un punto por cada pronóstico correcto
        int puntaje = 0;
        for (int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get();
        }
    }
}