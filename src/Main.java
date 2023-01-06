import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = input.nextLine();
            System.out.print("Parolaniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                    System.out.println("1-Para yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cikis Yap");

                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    select = input.nextInt();

                 switch(select){
                     case 1:
                         System.out.print("Para miktarı : ");
                         int price = input.nextInt();
                         balance += price;
                         break;
                     case 2:
                         System.out.print("Para miktarı : ");
                         price = input.nextInt();
                         if (price > balance) {
                             System.out.println("Bakiye yetersiz.");
                         } else {
                             balance -= price;
                         }
                         break;
                     case 3:
                         System.out.println("Bakiyeniz : " + balance);
                         break;
                     default:
                         System.out.println("Tekrar görüşmek üzere.");
                         break;

                 }

            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}