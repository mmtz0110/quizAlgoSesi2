import java.util.Scanner;
public class programsuhu {
    public static void main(String[] args) {
        Scanner inputSuhu = new Scanner(System.in);
        double celcius, fahrenheit;
        System.out.print("Masukkan celcius: ");
        celcius = inputSuhu.nextDouble();
        fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Suhu dalam Celcius: "+celcius);
        System.out.println("Hasil konversi dari Celcius ke Fahrenheit: "+fahrenheit);
    }
}
