import java.util.Scanner;
public class volumekubus {
    public static void main(String[] args) {
        Scanner inputS = new Scanner(System.in);
        int S, volume;
        System.out.println("Masukkan panjang sisi: ");
        S = inputS.nextInt();
        volume = S * S * S;
        System.out.println("Volume Kubus: "+volume);
    }
}
