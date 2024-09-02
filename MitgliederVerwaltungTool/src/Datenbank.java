import java.util.*;

public class Datenbank {

    private ArrayList<Mitglied> mitglieder = new ArrayList();
    private Scanner scan = new Scanner(System.in);
    private int nextid = 0;

    public void mitgliedEinfuegen(){
        Mitglied md = new Mitglied();
        md.eingabe();
        md.setId(nextid);
        nextid++;
        mitglieder.add(md);
    }

    public void mitgliedLoeschen(){

try{
        System.out.println("Geben sie die ID ein die sie löschen möchten: ");
        int id = scan.nextInt();
        scan.nextLine();


        Mitglied zuLoeschendeId = null;

        for(Mitglied m : mitglieder){
            if(m.getId() == id){
                zuLoeschendeId = m;
            }
        }

        if(zuLoeschendeId == null){
            throw new IdNotFoundException("ID wurde nicht gefunden");
        }

        if(zuLoeschendeId.isCheckin() || zuLoeschendeId.getUmsatz() > 0){
            throw new IllegalStateException("Mitglied ist eingecheckt oder hat Umsatz und kann nicht gelöscht werden.");
        }

        mitglieder.remove(zuLoeschendeId);
        System.out.println("Mitglied wurde erfolgreich gelöscht. ");

    }catch(IdNotFoundException e){
    System.out.println(e.getMessage());

    }catch(IllegalStateException e){
    System.out.println(e.getMessage());
    }

    }

    public void mitgliedEinchecken(){

        try{
            System.out.println("ID eingeben zum einchecken: ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.println("Schlüsselnummer eingeben: ");
            int schluesselNummer = scan.nextInt();
            scan.nextLine();

            Mitglied eincheckendeID = null;

            for(Mitglied m : mitglieder){
                if(m.getId() == id){
                    eincheckendeID = m;
                }
            }

            if(eincheckendeID == null){
                throw new IdNotFoundException("ID wurde nicht gefunden");
            }

            eincheckendeID.setCheckin(true);
            eincheckendeID.setSchluesselnummer(schluesselNummer);
            System.out.println("Sie wurden erfolgreich eingecheckt. ");

        }catch(IdNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    public void auscheckenMitglied(){

    try {
        System.out.println("Geben sie die Schlüsselnummer ein zum auschecken: ");
        int nummer = scan.nextInt();
        scan.nextLine();

        Mitglied auscheckendeNummer = null;

        for (Mitglied m : mitglieder) {
            if (m.getSchluesselnummer() == nummer) {
                auscheckendeNummer = m;
            }
        }

        if (auscheckendeNummer == null) {
            throw new KeyNotFoundException("Schlüsselnummer konnte nicht gefunden werden. ");
        }

        auscheckendeNummer.setCheckin(false);
        auscheckendeNummer.setUmsatz(0);
        auscheckendeNummer.setSchluesselnummer(0);
        System.out.println("Mitglied wurde erfolgreich ausgecheckt. ");

    }catch(KeyNotFoundException e){
        System.out.println(e.getMessage());
    }

    }

    public void bucheUmsatz(){

    try {

        System.out.println("Schlüsselnummer zum buchen eingeben: ");
        int nummer = scan.nextInt();
        scan.nextLine();

        System.out.println("Betrag eingeben: ");
        double betrag = scan.nextDouble();
        scan.nextLine();

        Mitglied schluesselNummer = null;

        for(Mitglied m : mitglieder){
            if(m.getSchluesselnummer() == nummer){
                schluesselNummer = m;
            }
        }

        if(schluesselNummer == null){
            throw new KeyNotFoundException("Schlüsselnummer wurde nicht gefunden. ");
        }

        schluesselNummer.setUmsatz(schluesselNummer.getUmsatz() + betrag);
        System.out.println("Buchung war erfolgreich. ");

    }catch(KeyNotFoundException e){
        System.out.println(e.getMessage());
    }

    }

    public void listeMitglieder(){
        for(Mitglied m : mitglieder){
            System.out.println(m);
        }
    }

}
