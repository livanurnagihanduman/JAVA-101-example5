import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //ORT. BULAN PROGRAM
        
        int[] liste = {1,2,3,4,5};
        int toplam = 0;
        for(int a = 0; a < liste.length;a++){
            toplam += liste[a];
        }
        System.out.println("Ortalama = " + toplam / liste.length);

        //MAX & MİN BULAN PROGRAM

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {//foreach kullanımı vardır.
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);




    }
}