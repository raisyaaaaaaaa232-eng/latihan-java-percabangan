import java.util.Scanner;

public class Positifnegatif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        if (angka > 0) {
            System.out.println("Angka Positif");
        } else if (angka < 0) {
            System.out.println("Angka Negatif");
        } else {
            System.out.println("Angka Nol");
        }

        in.close();
    }
}
