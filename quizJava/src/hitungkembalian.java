import java.util.Scanner;
public class hitungkembalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double harga,jumlah,total,bayar,kembalian;
        harga = 28000.0;
        System.out.print("Masukkan jumlah telur yg akan dibeli (kg): ")
        jumlah = scanner.nextDouble();
        total = harga * jumlah;
        bayar = 100000.0;
        kembalian = bayar - total;
        System.out.println("Harga telur perkilo: Rp."+harga);
        System.out.println("Jumlah telur: "+jumlah+" Kg");
        System.out.println("Total harga: Rp."+total);
        System.out.println("Uang yg diberikan: Rp."+bayar);
        System.out.println("Uang kembalian: "+kembalian);
    }
}
