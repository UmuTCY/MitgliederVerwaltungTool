import java.util.Scanner;

public class Personen {
    private int id;
    private String titel;
    private String vorname;
    private String nachname;
    private String strasse;
    private int plz;
    private String ort;
    private String geschlecht;

    public Personen(int id, String titel, String vorname, String nachname, String strasse, int plz, String ort, String geschlecht) {
        this.id = id;
        this.titel = titel;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.geschlecht = geschlecht;
    }

    public Personen() {
    }

    public void eingabe(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Titel: ");
        this.titel = scan.nextLine();

        //Pflichtfelder
        do{
            System.out.println("Vorname: ");
            this.vorname = scan.nextLine();
        }while(vorname.isEmpty());

        do{
            System.out.println("Nachname: ");
            this.nachname = scan.nextLine();
        }while(nachname.isEmpty());

        do{
            System.out.println("Strasse: ");
            this.strasse = scan.nextLine();
        }while(strasse.isEmpty());

        do{
            System.out.println("PLZ: ");
            this.plz = scan.nextInt();
            scan.nextLine();
        }while(plz < 0);

        do{
            System.out.println("Ort: ");
            this.ort = scan.nextLine();
        }while(ort.isEmpty());

        System.out.println("Geschlecht: ");
        this.geschlecht = scan.nextLine();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String toString(){
        return "ID: " + getId() + ", Titel: " + getTitel() + ", Vorname: " + getVorname() + ", Nachname: " + getNachname() + ", Strasse: " + getStrasse() + ", PLZ: " + getPlz() + ", Ort: " + getOrt() + ", Geschlecht: " + getGeschlecht();
    }
}
