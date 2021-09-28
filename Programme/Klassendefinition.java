import java.lang.*;

public class Klassendefinition
{
    public static void main(String[] args) {
        
    }

    private String autor;
    private String titel;
    private int seiten;
    private String refNummer;
    private int ausgeliehen;
    private final boolean kursText;

    /**
     * Setze den Autor und den Titel, wenn ein Objekt erzeugt wird.
     */
    public Klassendefinition(String buchautor, String buchtitel, int seiten, boolean kursText)
    {
        autor = buchautor;
        titel = buchtitel;
        this.seiten = seiten;
        refNummer = "";
        ausgeliehen = 0;
        this.kursText = kursText;
    }
    
    public void setzeRefNummer(String refNummer) {
        if (refNummer.length() >= 3)
            this.refNummer = refNummer;
        else
            throw new java.lang.Error("Argument not allowed, too short");
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
        return autor;
    }
    
    public String gibTitel() {
        return titel;
    }
    
    public int gibSeiten() {
        return seiten;
    }
    
    public void detailsAusgeben() {
        System.out.println("Autor: " + autor + ", Titel: " + titel + ", Seiten: " + seiten + ", Referenz Nummer: " + ((refNummer != "") ? refNummer : "ZZZ") + ", " + ausgeliehen + "-mal ausgeliehen");
    }
    
    public void autorAusgeben() {
        System.out.println(autor);
    }
    
    public void titelAusgeben() {
        System.out.println(titel);
    }

    // weitere Methoden hier einfügen ...
}