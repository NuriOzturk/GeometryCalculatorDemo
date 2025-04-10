package Shape;

import java.util.Scanner;

public class Ucgen implements IIslem {
    private double kenar1;
    private double kenar2;
    private double kenar3;
    Scanner scanner = new Scanner(System.in);

    public Ucgen() {
    }

    @Override
    public void alanHesapla() {
        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı: " + alan);
    }

    @Override
    public void cevreHesapla() {
        double cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Üçgenin çevresi: " + cevre);
    }

    @Override
    public void hesaplamaMenusu() {
        System.out.println("\nÜçgen için yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 --> Alan Hesapla");
        System.out.println("2 --> Çevre Hesapla");
        System.out.println("3 --> Çıkış");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.print("1. kenar uzunluğunu giriniz: ");
                kenar1 = scanner.nextDouble();
                System.out.print("2. kenar uzunluğunu giriniz: ");
                kenar2 = scanner.nextDouble();
                System.out.print("3. kenar uzunluğunu giriniz: ");
                kenar3 = scanner.nextDouble();
                alanHesapla();
                break;
            case 2:
                System.out.print("1. kenar uzunluğunu giriniz: ");
                kenar1 = scanner.nextDouble();
                System.out.print("2. kenar uzunluğunu giriniz: ");
                kenar2 = scanner.nextDouble();
                System.out.print("3. kenar uzunluğunu giriniz: ");
                kenar3 = scanner.nextDouble();
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
