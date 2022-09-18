import java.util.Scanner;

public class ders6 {
    public static void main(String[] args) {
        System.out.println("...ders harf geçme tablosu progrramı...");
        Scanner scanner =new Scanner(System.in);
        System.out.println("harf notunu girin =");
        String harf = scanner.next();
        switch (harf){
            case "AA":
                System.out.println("ders notunuz çok iyi geçtimiz");
                break;
            case "BB":
                System.out.println("ders notunuz  iyi geçtimiz");
                break;
            case "CC":
                System.out.println("ders notunuz ORTA geçtimiz");
                break;
            case "DD":
                System.out.println("ders notunuz KÖTÜ geçtimiz");
                break;
            default:
                System.out.println("yanlış harf notu girdiniz");
        }
    }
}

