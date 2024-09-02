import java.util.*;
public class Menue {
    Datenbank db = new Datenbank();
    private Scanner scan = new Scanner(System.in);

    public void ausgabe(){
        int auswahl;
        do{
            System.out.println(" 1 - Mitglied hinzufügen \n 2 - Mitglieder listen \n 3 - Mitglied entfernen \n 4 - Mitglied einchecken \n 5 - Mitglied auschecken \n 6 - Umsatz buchen \n 7 - Programm beenden ");
            auswahl = scan.nextInt();
            scan.nextLine();

            switch(auswahl){
                case(1):
                    db.mitgliedEinfuegen();
                    break;
                case(2):
                    db.listeMitglieder();
                    break;
                case(3):
                    db.mitgliedLoeschen();
                    break;
                case(4):
                    db.mitgliedEinchecken();
                    break;
                case(5):
                    db.auscheckenMitglied();
                    break;
                case(6):
                    db.bucheUmsatz();
                    break;
                case(7):
                    System.out.println("Auf Wiedersehen ! ");
            }
        }while(auswahl != 7);
    }

}
