public class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji;

    // Konstruktor bez parametrów
    public Samochod() {
        this.marka = "Suzuki";
        this.model = "Grand Vitara";
        this.rokProdukcji = 2007;
    }
    // Konstruktor z parametrami
    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }
    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
    }
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod();
        System.out.println("Informacje o samochodzie 1:");
        samochod1.wyswietlInformacje();
        System.out.println();

        Samochod samochod2 = new Samochod("Toyota", "Corolla", 2022);
        System.out.println("Informacje o samochodzie 2:");
        samochod2.wyswietlInformacje();
    }
}
