public class Mitglied extends Personen {
    private boolean checkin;
    private int schluesselnummer;
    private double umsatz;

    public Mitglied(int id, String titel, String vorname, String nachname, String strasse, int plz, String ort, String geschlecht, boolean checkin, int schluesselnummer, double umsatz) {
        super(id, titel, vorname, nachname, strasse, plz, ort, geschlecht);
        this.checkin = false;
        this.schluesselnummer = -1;
        this.umsatz = 0;
    }

    public Mitglied() {
        this.checkin = false;
        this.schluesselnummer = -1;
        this.umsatz = 0;
    }

    public void eingabe(){
        super.eingabe();
    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }

    public int getSchluesselnummer() {
        return schluesselnummer;
    }

    public void setSchluesselnummer(int schluesselnummer) {
        this.schluesselnummer = schluesselnummer;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public String toString(){
        return super.toString();
    }
}
