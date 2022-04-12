import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matematik , fızık , kımya , turkce , tarıh , muzık;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin:    ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu girin:    ");
        fızık = input.nextInt();

        System.out.println("Kimya notunuzu girin:     ");
        kımya = input.nextInt();

        System.out.println("Türkçe notunuzu girin:    ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu girin:    ");
        tarıh = input.nextInt();

        System.out.println("Müzik notunuzu girin:    ");
         muzık = input.nextInt();

        int toplam =matematik + fızık + kımya + turkce + tarıh + muzık;
        double sonuc = toplam / 6;

        boolean result = sonuc > 60;
        System.out.println("Ortalamanız : " + sonuc);
        System.out.println("Başarı değeriniz : " + (result ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız."));




    }
}
