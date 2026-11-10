
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan sisi kedua: ");
        int b = in.nextInt();

        System.out.print("Masukkan sisi ketiga: ");
        int c = in.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 ||
            a + b <= c || a + c <= b || b + c <= a) {

            System.out.println("Bukan Segitiga");

        } else if (a == b && b == c) {

            System.out.println("Segitiga Sama Sisi");

        } else if (a == b || a == c || b == c) {

            System.out.println("Segitiga Sama Kaki");

        } else {

            System.out.println("Segitiga Sembarang");
        }

        in.close();
    }
}
