import java.util.Scanner;

public class ders16 {
    public static void main(String[] args) {
        int toplam=0;
        Scanner scanner  =new Scanner(System.in);
        System.out.println("sayı girin");
        int sayi=scanner.nextInt();
        for (int a =1;a<sayi;a++){
            if(sayi%a==0){
                toplam=a+toplam;
            }
        }
            if(sayi==(toplam)){
                System.out.println("sayı mükemmel sayıdır");
            }
            else {System.out.println("sayı mükemmel sayı değildir");}
        }
    }

