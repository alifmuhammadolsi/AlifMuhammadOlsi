public class Main {

    public static void main(String[] args){
    bujursangkar hitung = new bujursangkar();
    Lingkaran tung = new Lingkaran();

    tung.setJari(12);
    tung.keliling();
    System.out.println("Keliling lingkaran diatas adalah" + tung.getKeliling());

    hitung.setSisi(6);
    hitung.keliling();
    System.out.println("Keliling bujur sangkar adalah "+ hitung.getKeliling());
    }
}
