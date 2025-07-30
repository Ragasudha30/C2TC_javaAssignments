package Assignment4;

public class Executor {
    public static void main(String[] args) {
        Airfare airIndia = new AirIndia(5, 1000.0);
        Airfare kingFisher = new KingFisher(4, 800.0);
        Airfare indigo = new Indigo(3, 700.0);

        System.out.println("AirIndia Amount: " + airIndia.calculateAmount());
        System.out.println("KingFisher Amount: " + kingFisher.calculateAmount());
        System.out.println("Indigo Amount: " + indigo.calculateAmount());
    }
}
