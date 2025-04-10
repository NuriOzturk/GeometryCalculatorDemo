package Shape;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    -----------------
                    ***Şekillerin Alan ve Çevre Hesaplamaları***
                    -----------------
                    1--> Kare
                    2--> Dikdörtgen
                    3--> Daire
                    4--> Üçgen
                    0--> Çıkış
                    -----------------
                    Lütfen bir seçim yapınız:\s""");
            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    Kare kare = new Kare();
                    kare.hesaplamaMenusu();
                    break;
                case 2:
                    Dikdortgen dikdortgen = new Dikdortgen();
                    dikdortgen.hesaplamaMenusu();
                    break;
                case 3:
                    Daire daire = new Daire();
                    daire.hesaplamaMenusu();
                    break;
                case 4:
                    Ucgen ucgen = new Ucgen();
                    ucgen.hesaplamaMenusu();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(100);
                        System.out.print("...");
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }
        }
    }
}
