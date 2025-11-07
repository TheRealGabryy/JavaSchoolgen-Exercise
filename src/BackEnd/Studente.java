package BackEnd;

public class Studente {
    private String name, surname;
    private int age, media;

    public Studente(String name, String surname, int age, int media) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.media = media;
    }

    public Studente() {
        this.name = null;
        this.surname = null;
        age = -1;
        media = -1;
    }

    public String getNome() {
        return name;
    }
    public String getCognome() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public int getMedia() {
        return media;
    }
    public void setSurname(String newInput) {
        this.surname = newInput;
    }
    public void setName(String newInput) {
        this.name = newInput;
    }
    public void setAge(int newInput) {
        this.age = newInput;
    }
    public void setMedia(int newInput) {
        this.media = newInput;
    }

    public void printStudente() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cognome: " + this.getCognome());
        System.out.println("Age: " + this.getAge());
        System.out.println("Media: " + this.getMedia());
    }
}
