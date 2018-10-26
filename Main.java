package ba.etf.unsa;



public class Main {

    public static void main(String[] args) {
        Sati s = new Sati(15,30,45);
        s.Postavi(5,10,15);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();

    }
}
