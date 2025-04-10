package Shape;

import java.util.Scanner;

public class Daire implements IIslem {
    private double yaricap;
    Scanner scanner = new Scanner(System.in);

    public Daire() {
    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public void alanHesapla() {
        double alan = Math.PI * Math.pow(yaricap, 2);
        System.out.println("Dairenin alanı: " + alan);
    }

    @Override
    public void cevreHesapla() {
        double cevre = 2 * Math.PI * yaricap;
        System.out.println("Dairenin çevresi: " + cevre);
    }

    @Override
    public void hesaplamaMenusu() {
        System.out.println("\nDaire için yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 --> Alan Hesapla");
        System.out.println("2 --> Çevre Hesapla");
        System.out.println("3 --> Çıkış");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.print("Yarıçap uzunluğunu giriniz: ");
                yaricap = scanner.nextDouble();
                alanHesapla();
                break;
            case 2:
                System.out.print("Yarıçap uzunluğunu giriniz: ");
                yaricap = scanner.nextDouble();
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
