import BackEnd.Aula;
import BackEnd.Studente;
import FrontEnd.GestioneAula;
import Utils.Menu;
import FrontEnd.GestioneStudente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final Scanner input = new Scanner(System.in);
    public static Aula classe;
    public static void main(String[] args) {
        boolean fine = false;
        int choice;
        String[] options = {
                "Inserire uno studente",
                "Visualizzare dati studente",
                "Modificare la media studente",
                "cancella Studente",
                "Crea Aula Di Studenti",
                "Cerca Studente in Aula",
                "Togli Studente Dall'aula",
                "Fine"
        };
        Studente std = null;
        do {
            Menu.printMenu("Titile", options);
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inserito un intero");
                input.nextLine();
                continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("inserisci Studente");
                    std = GestioneStudente.inserisciStudente();
                    System.out.println("Successo.");
                    break;
                }
                case 2 -> {
                    System.out.println("visualizza Studente");
                    assert std != null;
                    String nome;
                    GestioneStudente.visualizzaDatiStudente(std);
                    break;
                }
                case 3 -> {
                    System.out.println("Modifica Media");
                    assert std != null;
                    GestioneStudente.modificaMedia(std);
                    break;
                }
                case 4 -> {
                    System.out.println("Cancella Studente");
                    GestioneStudente.cancellaStudente(std);
                    break;
                }
                case 5 -> {
                    System.out.println("Generazione aula Studente");
                    GestioneAula.creaAula();
                    int nStudenti = 10;
                }
                case 6 -> {
                    System.out.println("Fine programma");
                    fine = true;
                    break;
                }
                default -> {
                    System.out.println("Hai inserito un'opzione non valida");
                    break;
                }

            }
        } while (!fine);
    }


}
