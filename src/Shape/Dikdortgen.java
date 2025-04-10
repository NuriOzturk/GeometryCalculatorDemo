package Shape;

import java.util.Scanner;

public class Dikdortgen implements IIslem {
    private double kisaKenar;
    private double uzunKenar;
    Scanner scanner = new Scanner(System.in);

    public Dikdortgen() {
    }

    @Override
    public void alanHesapla() {
        double alan = kisaKenar * uzunKenar;
        System.out.println("Dikdörtgenin alanı: " + alan);
    }

    @Override
    public void cevreHesapla() {
        double cevre = 2 * (kisaKenar + uzunKenar);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    @Override
    public void hesaplamaMenusu() {
        System.out.println("\nDikdörtgen için yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 --> Alan Hesapla");
        System.out.println("2 --> Çevre Hesapla");
        System.out.println("3 --> Çıkış");
        System.out.print("Seçiminiz: ");
        int secim =scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.print("Kısa kenar uzunluğunu giriniz: ");
                kisaKenar = scanner.nextDouble();
                System.out.print("Uzun kenar uzunluğunu giriniz: ");
                uzunKenar = scanner.nextDouble();
                alanHesapla();
                break;
            case 2:
                System.out.print("Kısa kenar uzunluğunu giriniz: ");
                kisaKenar = scanner.nextDouble();
                System.out.print("Uzun kenar uzunluğunu giriniz: ");
                uzunKenar = scanner.nextDouble();
                cevreHesapla();
                break;
            case 3:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
    }
}
