import java.util.Scanner;
public class TutarGiris {
    Scanner input = new Scanner(System.in);
    public double tutarGir(){
        System.out.print("Tutarı giriniz: ");
        double tutar = input.nextDouble();
        return tutar;
    }
}
