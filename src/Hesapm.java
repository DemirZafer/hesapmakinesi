import java.util.Scanner;

public class Hesapm {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        float a1 , a2 ;
                int sonuc ;
        System.out.println("Buraya girmek istediğiniz a1 sayısını giriniz : ");
        a1 = vr.nextFloat();
        System.out.println("Buraya girmek istediğiniz a2 sayısını giriniz : ");
        a2 = vr.nextFloat();
        System.out.println("1-Toplama , 2-Çıkarma , 3-Çarpma , 4-Bölme , \n Lütfen seçiminizi yazın :  ");
        sonuc = vr.nextInt();

        switch (sonuc){
            case 1 :
                System.out.println("Sonuç : "+(a1 + a2));
                break;
            case 2 :
                System.out.println("Sonuç : "+(a1 - a2));
                break;
            case 3 :
                System.out.println("Sonuç : "+(a1 * a2));
                break;
            case 4 :
                System.out.println("Sonuç : "+(a1 / a2));
                break;

        }


    }
}
