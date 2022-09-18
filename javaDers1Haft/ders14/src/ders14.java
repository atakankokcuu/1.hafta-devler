import java.util.Scanner;

public class ders14 {
    public static void main(String[] args) {
        System.out.println("sayı girin=");
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        for (int a = 2; a < sayi; a++) {
            int kalan=sayi%a;
            if (kalan == 0) {
                b++;
            }
        }
        if (b == 0) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }

    }
}
