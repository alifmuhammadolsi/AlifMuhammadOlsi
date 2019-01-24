public class Lingkaran {

    public double phi = 3.14;
    public double Keliling;
    public double jari = 5;

    public void setJari() {
        Keliling = 2*phi*jari ;
        System.out.println("Luas Lingkaran di atas adalah " + Keliling +" Cm");
        }

    public static void main(String[] args){
        Lingkaran lkr = new Lingkaran();
        lkr.setJari();
    }

}

