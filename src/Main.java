// https://app.patika.dev
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
            eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
            unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
            şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
            sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        // Kullanıcı adı ve şifremi belirledim.
        Scanner input = new Scanner(System.in);
        String name = "Patika", sifre = "Java123";

        // Kullanıcıdan giriş için bilgilerini istedim.
        System.out.print("Kullanıcı Adı : ");
        String kullaniciAdi = input.nextLine();

        System.out.print("Şifre : ");
        String password = input.nextLine();

        // ilk isim kontrolü yaptım eğer doğruysa ikinci aşama şifre kontrolüne girecek.
        if (kullaniciAdi.equals(name)){
            if (password.equals(sifre)){
                System.out.println("Giriş Başarılı..");
            }else { // Şİfre yanlış ise izlenecek adımlar. Şifre değiştir veya devam et
                System.out.println("Şifreniz yanlış sıfırlamak isterseniz 1'e basınız.\nİstemiyorsanız 2'ye basınız.");
                int degis = input.nextInt();

                // Şifre yenileme var ise 1 durum yok ise 2 duruma git.
                switch (degis){

                    case 1:
                       Scanner istek = new Scanner(System.in);
                        System.out.print("Lütfen Yeni Şifrenizi Giriniz : "); // Yeni Şifre Belirlendi
                        String password2 = istek.nextLine();

                        if (sifre.equals(password2)){ // Eski Şifre İle Aynı Mı Kontrolü
                            System.out.print("Şifre oluşturulamadı, \nlütfen başka şifre giriniz : ");
                            String password3 = istek.nextLine(); // Eksi şifre ile aynıysa değişim sağlandı
                            System.out.println("Şifre oluşturuldu");
                            System.out.println("Yeni Şifreniz : " + password3);
                            // Tekrar sistemde giriş yapabiliyor mu kontrol.
                            System.out.println("!! Kullanıcı Girişine Tekrar Hoşgeldiniz !!");
                            System.out.print("kullanıcı Adı : ");
                            String sonKullanici = istek.nextLine();
                            System.out.print("Şifreniz : ");
                            String sonSifre = istek.nextLine();

                            if (sonKullanici.equals(name) && sonSifre.equals(password3)){
                                System.out.println("Giriş Başarılı..");
                            }else { // Yine yanlış giriş varsa sistem kapanır.
                                System.out.println("Tekrar Yanlış Giriş Tespit Edildi..");
                            }
                        }else { // Eski şifre benzerlik yok yeni şifre oluştu.
                            System.out.println("Şifre oluşturuldu");
                            System.out.println("Yeni Şifreniz : " + password2);
                            // Tekrar sistemde giriş yapabiliyor mu kontrol.
                            System.out.print("Kullanıcı Adı : ");
                            String sonKullanici = istek.nextLine();
                            System.out.print("Şifreniz : ");
                            String sonSifre = istek.nextLine();

                            if (sonKullanici.equals(name) && sonSifre.equals(password2)){
                                System.out.println("Giriş Başarılı..");
                            }else { // Yine yanlış giriş varsa sistem kapanır.
                                System.out.println("Tekrar Yanlış Giriş Tespit Edildi..");
                            }
                        }

                        break;
                    case 2: // Şifre değiştirmedi ve tekrardan şifre ile giriş yapmak istedi.
                        Scanner iste = new Scanner(System.in);
                        System.out.println("Şifrenizi Giriniz : ");
                        String againSifre = iste.nextLine();
                        if (againSifre.equals(sifre)){
                            System.out.println("Giriş Başarılı..");
                        }else {
                            System.out.println("Hakkınız Doldu.. Tekrar Deneyin..");
                        }
                }
            }
        }else {
            System.out.println("Kullanıcı Adı Yanlış..");
        }
    }
}