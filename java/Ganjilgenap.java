import java.util.Scanner;

public class Ganjilgenap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }

        in.close();
    }
}