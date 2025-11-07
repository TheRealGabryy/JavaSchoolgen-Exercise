package BackEnd;

import FrontEnd.GestioneAula;

import java.util.ArrayList;
import java.util.Random;

public class Aula {
    private int nStudenti;
    private ArrayList listaStudenti;

    public Aula(int nStudenti, ArrayList<Studente> listaStudenti) {
        this.nStudenti = nStudenti;
        this.listaStudenti = listaStudenti;
    }

    public void generaAula() {
        listaStudenti = GestioneAula.creaAula();
    }

    public int getnStudenti() {
        return nStudenti;
    }

    public void setnStudenti(int nStudenti) {
        this.nStudenti = nStudenti;
    }

    public ArrayList<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(ArrayList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public int getLenghtofList() {
        return listaStudenti.size();
    }
}
