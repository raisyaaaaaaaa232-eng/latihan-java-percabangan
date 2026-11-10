
import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        String grade;

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C";
        } else {
            grade = "D";
        }

        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("Grade = " + grade);
        System.out.println("Status = " + status);

        in.close();
    }
}
