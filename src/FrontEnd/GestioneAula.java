package FrontEnd;

import BackEnd.Cognomi;
import BackEnd.Nomi;
import BackEnd.Studente;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GestioneAula {
    public static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Studente> listaStudenti = new ArrayList<>();
    private static final Nomi[] nomiStudenti = Nomi.values();
    private static final Cognomi[] cognomiStudenti = Cognomi.values();
    private static final Random rand = new Random();
    private static final int
            minMedia = 2,
            maxMedia = 10,
            minAge = 6,
            maxAge = 18,
            maxNames = Nomi.values().length,
            maxSurnames = Cognomi.values().length,
            maxStudenti = 50;

    public static void generaRandomStudenti(int nStudenti) {
        int randomName, randomSurname, randomAge, randomMedia;
        String name, surname;
        int age, media;
        for (int i = 0; i < nStudenti; i++) {
            randomName = rand.nextInt(0, maxNames);
            randomSurname = rand.nextInt(0, maxSurnames);
            randomAge = rand.nextInt(minAge, maxAge);
            randomMedia = rand.nextInt(minMedia, maxMedia);

            name = nomiStudenti[randomName].toString();
            surname = cognomiStudenti[randomSurname].toString();
            age = randomAge;
            media = randomMedia;
            Studente std = new Studente(name, surname, age, media);
            listaStudenti.add(std);
        }
    }

    public static ArrayList creaAula() {
        String line = "===========================";
        int nStudenti = 0;
        System.out.println("Inserisci quanti studenti vuoi inserire");
        do {
            System.out.print(" (max " + maxStudenti + ") Inserisci qui: ");
            try {
                nStudenti = input.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inseirto un intero");
                input.nextLine();
                continue;
            }
            if (nStudenti < 0 || nStudenti > maxStudenti) {
                System.out.println("Hai inserito un numero di studenti non valido.");
            }
        } while (nStudenti < 0 || nStudenti > maxStudenti);


        System.out.println("Creazione Aula");
        try {
            generaRandomStudenti(nStudenti);
        } catch (Exception e) {
            System.out.println("Qualcosa è andato storto nel creare gli studenti");
            return null;
        }
        System.out.println("Aula Creata con successo!");
        System.out.println("Studenti creati: ");
        for (int i =0; i < nStudenti; i++) {
            System.out.println(line);
            listaStudenti.get(i).printStudente();
        }

        return listaStudenti;
    }

    public static int getLenghtofList() {
        return listaStudenti.size();
    }
}
