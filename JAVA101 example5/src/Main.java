import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] liste = {1,2,3,4,5};
        int toplam = 0;
        for(int a = 0; a < liste.length;a++){
            toplam += liste[a];
        }
        System.out.println(toplam / liste.length);

    }
}