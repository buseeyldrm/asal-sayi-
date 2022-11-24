import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int sonuc;

        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int j = 1; j <= i; j++) {
                sonuc = i % j;
                if (sonuc == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.print(i + " ");
            }
        }

    }}