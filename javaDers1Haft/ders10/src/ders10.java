public class ders10 {
    public static void main(String[] args) {
        double[] myList= {1.2,3.2,6.6,7.4,4.9};
        double total=0;
    double max=0;
        for(double number:myList){
            total=total+number;
            System.out.println(number);
            if(max<number){
                max=number;
            }
        }
        System.out.println("toplam= "+total);
        System.out.println("enbüyük değer= "+max);

    }
}