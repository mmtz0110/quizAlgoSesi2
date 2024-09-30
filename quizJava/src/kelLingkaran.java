import java.util.Scanner;
public class kelLingkaran {
    public static void main(String[] args) {
        Scanner inputR = new Scanner(System.in);
        float R,kelLingkaran;
        System.out.print("Masukkan jari-jari lingkaran: ");
        R = inputR.nextFloat();
        kelLingkaran = 2 * 3.14f * R;
        System.out.println("Keliling lingkarannya adalah: "+kelLingkaran);
    }
}
