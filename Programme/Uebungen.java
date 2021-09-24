public class Uebungen
{
    public static void main(String[] args) {
        Dualzahl(1011100101);
    }
        public Uebungen(){

        }
    public static int MyModulo(int Zaehler, int Nenner){
            int ZwischenErgebnis = Zaehler / Nenner;
            int Rest = Zaehler-(ZwischenErgebnis*Nenner);
            return Rest;
        }
    public static void Switch(int a, int b){
            int c=a;
            a=b;
            b=c;
            System.out.println("a=" + a + " b=" + b);
        }
    public static double Pyramide(double Seitenlaenge, double Hoehe) {
            double Volumen;
            double Grundflaeche = Seitenlaenge*Seitenlaenge;
            Volumen = 1.0/3.0 * Grundflaeche * Hoehe;
            return Volumen;
        }
    public static void Alterstest(int alter) {
            if (alter<7) {
                System.out.println("Geschäftsunfähig");
            }
            else if (alter<18) {
                System.out.println("Geschäftsfähigkeit beschränkt");
            }
            else {
                System.out.println("unbeschränkte Geschäftsfähigkeit");
            }
        }
    public static void Gerade(int Zahl) {
            if (Zahl%2 == 0) {
                System.out.println("Die Zahl ist gerade");
            } 
            else {
                System.out.println("Die Zahl ist ungerade");
            }
        }
    public static void Noten(float Note) {
            if (Note <=6 && Note >=1) {
                float a = Note - (int)Note;
                if (a >= 0.5f) {
                    Note = (int)Note + 1;
                    
                } else {
                    Note = (int)Note;
                }
                if (Note == 1) {
                    System.out.println("1, Sehr Gut!");
                }
                if (Note == 2) {
                    System.out.println("2, Gut!");
                }
                if (Note == 3) {
                    System.out.println("3, Befriedigend!");
                }
                if (Note == 4) {
                    System.out.println("4, Mangelhaft!");
                }
                if (Note == 5) {
                    System.out.println("5, Ausreichend!");
                }
                if (Note == 6) {
                    System.out.println("6, Ungenügend!");
                }
                
            }
            else {
                System.out.println("Keine gueltige Note");
            }
    }
    public static void Wertetabelle() {
            float y=0;

            for (float x = -2; x < 3; x = x + 0.1f) {
            
                y = x*x - 6*x - 4;
                System.out.println("x="+x + " f(x)="+y);
            }
    }
    public static void Schaltjahr(int Jahr) {
            if (Jahr % 4 == 0) {
                System.out.println("Dieses Jahr ist ein Schaltjahr");
            }
            else {
                System.out.println("Dieses Jahr ist kein Schaltjahr");
            }
    }
    public static void Stellenzaehler(int Zahl) {
        int Stellen = 0; 
        int neueZahl = Zahl;

        if (Zahl == 0) {
            System.out.println("Die Zahl hat 1 Stelle.");
        }
        else {
            while (neueZahl  != 0) {
                neueZahl = neueZahl/10;
                Stellen = Stellen + 1;
            }
                System.out.println("Die Zahl hat " + Stellen + " Stellen.");
        }
        
    }
    public static void Quersumme(int Zahl) {
        int ZahlEnd = Zahl;
        int Zahl1 = Zahl % 10;
        Zahl /= 10;
        int Zahl2 = Zahl % 10;
        Zahl /= 10;
        int Zahl3 = Zahl % 10;
        Zahl /= 10;
        int Zahl4 = Zahl % 10;
        Zahl /= 10;
        int Zahl5 = Zahl % 10;
        Zahl /= 10;
        int Zahl6 = Zahl % 10;
        Zahl /= 10;
        int Zahl7 = Zahl % 10;
        Zahl /= 10;
        int Quersumme = Zahl1 + Zahl2 + Zahl3 + Zahl4 + Zahl5 + Zahl6 + Zahl7;
        System.out.println("Die Quersumme von " + ZahlEnd + " ist " + Quersumme + "!");
        
    }
    public static void Dualzahl(long BinärZahl) {
        int Stellen =0;
        int DezimalZahl=0;
        long Rest=0;
        long SaveBinärZahl = BinärZahl;

        while (BinärZahl !=0){
			Rest=BinärZahl % 10;
			DezimalZahl = DezimalZahl+(int)(Rest*(Math.pow(2, Stellen)));	
			BinärZahl=BinärZahl / 10;
			Stellen=Stellen+1;

        
		}
        System.out.println("Die Binärzahl " + SaveBinärZahl + " ist im Zehnersystem " + DezimalZahl + "!");
    }
    public static void Zahlendreher() {

    }
    public static void Pi() {

    }
    public static void XQuadrat() {

    }
    public static void Dreieck() {

    }
    public static void Lottozahlen() {

    }
}
