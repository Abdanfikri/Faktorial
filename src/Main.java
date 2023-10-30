import java.util.Scanner;

/**
 * program faktorial
 * @author Muhammad Abdan Fikri
 * @since 29/10/2023
 *
 *
 */

public class Main {

    /**
     * @param angka angka yang ingin di faktorial
     * @return x hasil faktorial
     */
    public static int Faktorial(int angka) {

        int x = 1;
        for (int i = angka; i > 0; i--) {
            x *= i;
        }
        return x;

    }

    ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("masukan angka : ");
        int angka = scanner.nextInt();

        System.out.println("nilai faktorial :" + Faktorial(angka));


    }
}

