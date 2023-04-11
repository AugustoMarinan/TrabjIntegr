
import java.util.ArrayList;
    public class Ronda {
        private ArrayList<Partido> partidos;

        public Ronda(Partido partido1, Partido partido2) {
            partidos = new ArrayList<>();
            partidos.add(partido1);
            partidos.add(partido2);
        }

        public ArrayList<Partido> getPartidos() {
            return partidos;
        }

        public void setPartidos(ArrayList<Partido> partidos) {
            this.partidos = partidos;
        }
    }


