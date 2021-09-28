public class Buch
{
    public static void main(String[] args) {
        
    }

     String Autor;
     String Titel;
     int Seiten;
     String refNummer;
     int ausgeliehen;
     final boolean kursText;

    public Buch(String buchautor, String buchtitel, int seiten, boolean kursText)
    {
        Autor = buchautor;
        Titel = buchtitel;
        this.Seiten = seiten;
        refNummer = "";
        ausgeliehen = 0;
        this.kursText = kursText;
    }
    
    public void setzeRefNummer(String refNummer) {
        if (refNummer.length() >= 3) {
            this.refNummer = refNummer;
        }
        else {
        throw new java.lang.Error("Argument not allowed, too short");
        }
    }
    
    public boolean istKursText() {
        return kursText;
    }
    
    public String gibRefNummer() {
        return refNummer;
    }
    
    public void ausleihen() {
        ausgeliehen++;
    }
    
    public int gibAusgeliehen() {
        return ausgeliehen;
    }
    
    public String gibAutor() {
        return Autor;
    }
    
    public String gibTitel() {
        return Titel;
    }
    
    public int gibSeiten() {
        return Seiten;
    }
    
    public void detailsAusgeben() {
        System.out.println("Autor: " + Autor + ", Titel: " + Titel + ", Seiten: " + Seiten + ", Referenz Nummer: " + ((refNummer != "") ? refNummer : "ZZZ") + ", " + ausgeliehen + "-mal ausgeliehen");
    }
    
    public void autorAusgeben() {
        System.out.println(Autor);
    }
    
    public void titelAusgeben() {
        System.out.println(Titel);
    }

}