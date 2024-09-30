public class hitungkembalian {
    public static void main(String[] args) {
        float harga,jumlah,total,bayar,kembalian;
        harga = 28000f;
        jumlah = 2.5f;
        total = harga * jumlah;
        bayar = 100000f;
        kembalian = bayar - total;
        System.out.println("Harga telur perkilo: Rp."+harga);
        System.out.println("Jumlah telur: "+jumlah+" Kg");
        System.out.println("Total harga: Rp."+total);
        System.out.println("Uang yg diberikan: Rp."+bayar);
        System.out.println("Uang kembalian: "+kembalian);
    }
}
