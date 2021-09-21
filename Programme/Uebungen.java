public class Uebungen
{
    public static void main(String[] args) {
        Wertetabelle();
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
            for (float i = -2; i < 3; i = i + 0.1f) {
                System.out.println(i);
            }
    }
    public static void Schaltjahr() {

    }
    public static void Stellenzaehler() {

    }
    public static void Quersumme() {

    }
    public static void Dualzahl() {

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
