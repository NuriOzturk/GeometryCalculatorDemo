package Shape;

import java.util.Scanner;

public class Kare implements IIslem {
    private double kenar;
    Scanner scanner = new Scanner(System.in);

    public Kare() {
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        double alan = kenar * kenar;
        System.out.println("Karenin alanı: " + alan);
    }

    @Override
    public void cevreHesapla() {
        double cevre = 4 * kenar;
        System.out.println("Karenin çevresi: " + cevre);
    }

    @Override
    public void hesaplamaMenusu() {
        System.out.println("\nKare için yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 --> Alan Hesapla");
        System.out.println("2 --> Çevre Hesapla");
        System.out.println("3 --> Çıkış");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.print("Bir kenar uzunluğu giriniz: ");
                kenar = scanner.nextDouble();
                alanHesapla();
                break;
            case 2:
                System.out.print("Bir kenar uzunluğu giriniz: ");
                kenar = scanner.nextDouble();
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
