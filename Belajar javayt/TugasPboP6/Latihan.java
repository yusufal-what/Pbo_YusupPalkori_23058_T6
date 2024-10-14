public class Latihan {
    public static void main(String[] args) {
        // 1.a. Menghitung deret bilangan prima dan bukan dari 0 - 20
        System.out.println("1.a. Bilangan Prima dan Bukan Prima (0-20):");
        for (int i = 0; i <= 20; i++) {
            if (adalahPrima(i)) {
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " bukan bilangan prima.");
            }
        }

        // 1.b. Menghitung deret bilangan ganjil dan genap dari 0 - 20
        System.out.println("\n1.b. Bilangan Ganjil dan Genap (0-20):");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
                System.out.println(i + " adalah bilangan ganjil.");
            }
        }

        // 1.c. Menampilkan huruf Z - A
        System.out.println("\n1.c. Huruf Z - A:");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 1.d. Lagu "Anak Ayam Turun N"
        System.out.println("\n1.d. Lagu Anak Ayam Turun N:");
        int N = 10; // Contoh nilai N
        for (int i = N; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
    }

    // Fungsi untuk memeriksa apakah bilangan prima
    public static boolean adalahPrima(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}