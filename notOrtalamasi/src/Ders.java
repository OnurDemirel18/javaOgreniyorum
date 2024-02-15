import java.util.Scanner;

public class Ders {
    int dersAdet = 0;
    Scanner input = new Scanner(System.in);
    public int dersAdet(){
        System.out.print("Ders Adetiniz: ");
        dersAdet = input.nextInt();
        return dersAdet;
    }
    public String[] dersAdi(){

        String dersAdi;
        String[] dersler = new String[dersAdet];
        for(int i = 0; i < dersAdet; i++){
            System.out.print("Ders Adı: ");
            dersAdi = input.next();
            dersler[i] = dersAdi;


        }
        return dersler;
    }
    public int[] dersNotu(){
        int dersNotu;
        int[] notlar = new int[dersAdet];
        for(int i = 0; i < dersAdet; i++){
            System.out.print("Ders Notu: ");
            dersNotu = input.nextInt();
            notlar[i] = dersNotu;
        }
        return notlar;
    }

    public int[] dersSaati(){
        int dersSaati;
        int[] saatler = new int[dersAdet];
        for(int i = 0; i < dersAdet; i++){
            System.out.print("Ders Saati: ");
            dersSaati = input.nextInt();
            saatler[i] = dersSaati;
        }
        return saatler;
    }
}
