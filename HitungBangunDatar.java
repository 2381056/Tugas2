import java.util.Scanner;
public class HitungBangunDatar {
    public static void hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }
    public static void hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
    public static void hitungLingkaran(double jariJari) {
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = input.nextDouble();
                hitungPersegi(sisi);
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                hitungPersegiPanjang(panjang, lebar);
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                hitungLingkaran(jariJari);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }
        input.close();
    }
}
