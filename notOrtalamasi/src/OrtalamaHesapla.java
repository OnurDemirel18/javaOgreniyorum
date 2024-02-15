public class OrtalamaHesapla {

    public static void ortalamaHesapla(int dersAdedi,String[] dersler, int[] notlar, int[] saatler){
        int toplamDersSaati = 0;
        double agirlikNotu = 0;


        for(int i = 0; i < dersAdedi; i++){
            agirlikNotu += notlar[i] * saatler[i];
            toplamDersSaati += saatler[i];
        }
        agirlikNotu = agirlikNotu / toplamDersSaati;
        System.out.println("Ortalamanız: " + agirlikNotu);
    }
}
