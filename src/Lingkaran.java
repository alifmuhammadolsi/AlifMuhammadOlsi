public class Lingkaran {

    private double phi = 3.14;
    private double keliling;
    private double jari = 5;

    public void keliling(){
        this.keliling = 2 * phi * jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getKeliling() {
        return keliling;
    }
}


