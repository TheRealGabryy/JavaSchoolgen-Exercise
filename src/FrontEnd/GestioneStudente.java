package FrontEnd;

import BackEnd.Studente;

import java.util.Scanner;

public class GestioneStudente {
    public static final Scanner input = new Scanner(System.in);
    public static Studente std;
    public static Studente inserisciStudente() {
        String nome, cognome;
        int age = 0, media = 0;
        System.out.println("Dai un nome allo studente");
        do {
            System.out.print("Inserisci il nome: ");
            nome = input.nextLine();
            if (!checkNome(nome)) {
                System.out.println("Hai inserito un nome non valido");
            }
        } while (!checkNome(nome));
        System.out.println("Nome inserito: " + nome);
        System.out.println("Dai un cognome allo studente");
        do {
            System.out.print("Inserisci il cognome: ");
            cognome = input.nextLine();
            if (!checkNome(cognome)) {
                System.out.println("Hai inserito un cognome non valido");
            }
        } while (!checkNome(cognome));
        System.out.println("Cognome inserito: " + cognome);
        System.out.println("Quanti anni ha lo studente?");
        do {
            System.out.print("Inserisci l'età: ");
            try {
                age = input.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inserito un intero");
                input.nextLine();
                continue;
            }
            if (age < 10 || age > 99) {
                System.out.println("Hai inserito un'età non valida");
            }
        } while (age < 10 || age > 99);
        System.out.println("Età inserita: " + age);
        System.out.println("Inserisci la media dello studente");
        do {
            System.out.print("Inserisci media: ");
            try {
                media = input.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inserito un intero");
                input.nextLine();
                continue;
            }
            if (media < 2 || media > 10) {
                System.out.println("Hai inserito una media non valida");
            }
        } while (media < 10 || age > media);
        System.out.println("Media inserita: " + media);
        std = new Studente(nome, cognome, age, media);
        return std;
    }

    public static Studente modificaMedia(Studente std) {
        System.out.println("Media corrente: " + std.getMedia());
        int media = 0;
        do {
            System.out.print("Inserisci media: ");
            try {
                media = input.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inserito un intero");
                input.nextLine();
                continue;
            }
            if (media < 2 || media > 10) {
                System.out.println("Non hai inserito una media valida");
            }
        } while (media < 2 || media > 10);
        std.setMedia(media);
        return std;
    }

    public static void visualizzaDatiStudente(Studente std) {
        std.printStudente();
    }

    public static void cancellaStudente(Studente std) {
        std = new Studente();
    }

    public static boolean checkNome(String nome) {
        boolean hasSpecial = false;
        for (int i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) {
                hasSpecial = true;
            }
        }
        if (hasSpecial) {
            return false;
        }
        return true;
    }
}
