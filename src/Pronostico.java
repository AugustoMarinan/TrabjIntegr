    import java.util.ArrayList;

    public class Pronostico {
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


