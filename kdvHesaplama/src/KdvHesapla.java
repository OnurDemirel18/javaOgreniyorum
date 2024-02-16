public class KdvHesapla {
    double kdvOran = 0.2;
    double kdv;
    public void kdvHesapla(double tutar){
        kdv = tutar * kdvOran;
        System.out.println("KDV: " + kdv);
    }
    public void toplamTutarHesapla(double tutar){
        double toplamTutar = tutar + kdv;
        System.out.println("Toplam Tutar: " + toplamTutar);
    }
}
