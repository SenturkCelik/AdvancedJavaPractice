package _06_Method_Creation;

import java.util.Scanner;

public class Q03_Convert {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacaginiz islemi seciniz");
        String islem=scan.next();
        System.out.println("cevirim miktarini giriniz");
        double miktar=scan.nextDouble();
        donustur(islem,miktar);


    }

    private static void donustur(String islem, double miktar) {

        switch (islem){
            case "saat":
                System.out.println("merak ettigin saat :"+miktar*60*60+ "  saniye dir");

                break;
            case "mil":
                System.out.println("merak ettigin mil :"+miktar*1.61+"  km dir");

                break;

            case"kg":
                System.out.println("merak ettigin kg :"+miktar*1000+"  gram dir");
                break;
            default:
                System.out.println("hatali giris yaptiniz");



        }
    }
}

