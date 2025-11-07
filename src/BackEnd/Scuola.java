package BackEnd;

import java.util.ArrayList;

public class Scuola {
    private static ArrayList<Aula> listaAule = new ArrayList<>();

    public static ArrayList<Aula> getListaAule() {
        return listaAule;
    }

    public static void setListaAule(ArrayList<Aula> listaAule) {
        Scuola.listaAule = listaAule;
    }

    private static Aula a;
    public void creaScuola() {

    }
}
