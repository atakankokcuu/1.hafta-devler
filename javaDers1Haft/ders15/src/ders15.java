import java.util.Scanner;

public class ders15 {
    public static void main(String[] args) {
        System.out.println("bir harf girin");
        Scanner scanner =new Scanner(System.in);
        String karakter =scanner.next();
        switch (karakter){
            //KULLANIICDAN DEĞERİ CHAR ŞEKLİNDE ALAMADIM AMA STRİNG DEĞER ALDIĞIMDA CASE KISMI CAHAR OLUYOR VE PROGRAM HATA VERİYOR
            case "AA":
            case "II":
            case "OO":
            case "UU":
                System.out.println("harf kalın seslidirr");
                break;
            case "EE":
            case "İİ":
            case "ÜÜ":
            case "ÖÖ":
                System.out.println("harf İNCE seslidirr");
                break;

        }
    }
}
