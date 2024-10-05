public class hitungkembalian {
    public static void main(String[] args) {
        double harga,jumlah,total,bayar,kembalian;
        harga = 28000.0;
        jumlah = 2.5;
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
