public class Main {
    public static void main(String[] args) {
        KdvHesapla kdvHesapla = new KdvHesapla();
        TutarGiris tutarGiris = new TutarGiris();
        double tutar = tutarGiris.tutarGir();
        kdvHesapla.kdvHesapla(tutar);
        kdvHesapla.toplamTutarHesapla(tutar);
    }
}