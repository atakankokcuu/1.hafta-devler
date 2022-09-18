public class ders11 {
    public static void main(String[] args) {
        String[] [] sehirler = new String[3] [3];
        sehirler[0][0]="edirne";
        sehirler[0][1]="bursa";
        sehirler[0][2]="istanbul";
        sehirler[1][0]="izmir";
        sehirler[1][1]="çanakklae";
        sehirler[1][2]="denizli";
        sehirler[2][0]="kars";
        sehirler[2][1]="bitlis";
        sehirler[2][2]="van";
for(int i =0;i<3;i++){
    for(int j=0;j<3;j++){
        System.out.println(sehirler[i][j]);
    }
}


    }
}
