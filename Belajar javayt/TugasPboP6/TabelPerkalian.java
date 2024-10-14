import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai n (<=10): ");
        int n = sc.nextInt();

        System.out.println("\nTabel Perkalian " + n + "x" + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}