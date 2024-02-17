import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

       /*
        int sayi;
        System.out.println("lütfen sayi giriniz");
        Scanner scan=new Scanner(System.in);
        sayi= scan.nextInt();
        for (int i=1; i<=sayi; i*=2){
            System.out.println(i);
            }*/

        //Ödev
        //Java döngüler ile girilen sayıya kadar olan
        // 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int sayi;
        System.out.println("lütfen sayi giriniz");
        Scanner scan = new Scanner(System.in);
        sayi = scan.nextInt();
        System.out.println("4'ün katları");
        for (int i = 1; i <= sayi; i*=4) {
            System.out.println(i);
        }
        System.out.println("5'in katları");
        for (int i = 1; i <= sayi; i*=5) {
            System.out.println(i);
        }


    }
}