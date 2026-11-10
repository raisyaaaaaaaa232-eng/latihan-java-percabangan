
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Hasil = " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil = " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil = " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Tidak bisa dibagi dengan nol");
                } else {
                    System.out.println("Hasil = " + (angka1 / angka2));
                }
                break;
            case '%':
                if (angka2 == 0) {
                    System.out.println("Tidak bisa modulus dengan nol");
                } else {
                    System.out.println("Hasil = " + (angka1 % angka2));
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }

        in.close();
    }
}
