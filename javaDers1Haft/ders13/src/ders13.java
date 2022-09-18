public class ders13 {
    public static void main(String[] args) {
        String cumle = "bugün hava çok güzel";

        System.out.println(cumle.replace(' ', '_'));
        System.out.println(cumle.substring(3, 9));
        for (String cum : cumle.split(" ")) {
            System.out.println(cum);
            System.out.println(cumle.toUpperCase());
        }
    }
}