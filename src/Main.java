import com.opencsv.CSVReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Verificar que se pasen los argumentos correctos
        if (args.length < 2) {
            System.out.println("Se requieren dos argumentos: archivo de pronósticos y archivo de resultados");
            return;
        }

        String archivoPronosticos = args[0];
        String archivoResultados = args[1];

        // Construir las rutas completas de los archivos
        String rutaPronosticos = Paths.get(".", "C:\\Users\\Augusto\\IdeaProjects\\TrabjIntegr\\Archivos\\pronostico2.csv", archivoPronosticos).toString();
        String rutaResultados = Paths.get(".", "C:\\Users\\ugusto\\IdeaProjects\\TrabjIntegr\\Archivos\\Resultados2.csv", archivoResultados).toString();

        // Crear objeto Pronostico y cargar los pronósticos desde el archivo
        Pronostico pronostico = new Pronostico();
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Augusto\\IdeaProjects\\TrabjIntegr\\Archivos\\pronostico2.csv"))) {
            String[] linea;
            while ((linea = reader.readNext()) != null) {
                String equipoLocal = linea[0];
                String equipoVisitante = linea[1];
                String resultadoFinal = linea[2];

                Partido pronosticoPartido = new Partido(equipoLocal, equipoVisitante, resultadoFinal);
                pronostico.addPronostico(pronosticoPartido);
            }
        }

        // Crear objeto Ronda y cargar los resultados desde el archivo
        Ronda ronda = new Ronda();
        try (CSVReader reader = new CSVReader(new FileReader("C:\\\Users\\Augusto\\IdeaProjects\\TrabjIntegr\\Archivos\\Resultados2.csv"))) {
            String[] linea;
            while ((linea = reader.readNext()) != null) {
                String equipoLocal = linea[0];
                String equipoVisitante = linea[1];
                String resultadoFinal = linea[2];

                Partido partido = new Partido(equipoLocal, equipoVisitante, resultadoFinal);
                ronda.addPartido(partido);
            }
        }

        // Calcular el puntaje y mostrar por pantalla
        Puntaje puntaje = new Puntaje();
        int puntajeTotal = puntaje.calcularPuntaje(pronostico, ronda, 1); // 1 punto por acierto
        System.out.println("Puntaje total: " + puntajeTotal);
    }
}
