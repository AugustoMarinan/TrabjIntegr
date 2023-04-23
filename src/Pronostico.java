    import java.util.ArrayList;
    import java.util.Map;

    public class Pronostico {
        private String equipoLocal;
        private String equipoVisitante;
        private String resultado;
        public Pronostico(String equipoLocal, String equipoVisitante, String resultado) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
            this.resultado = resultado;
        }

        private ArrayList<String> resultadosPronosticados;

        public Pronostico() {
            resultadosPronosticados = new ArrayList<String>();
        }

        public ArrayList<String> getResultadosPronosticados() {
            return resultadosPronosticados;
        }

        public void setResultadosPronosticados(ArrayList<String> resultadosPronosticados) {
            this.resultadosPronosticados = resultadosPronosticados;
        }

        public void agregarResultado(String resultado) {
            resultadosPronosticados.add(resultado);
        }

        public void quitarResultado(String resultado) {
            resultadosPronosticados.remove(resultado);
        }

    }



