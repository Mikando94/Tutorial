import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę pierwszych liczb do wygenerowania: ");
        int ilosc = scanner.nextInt();

        int liczba = 2;
        int znalezione = 0;

        while (znalezione < ilosc) {
            if (czyPierwsza(liczba)) {
                System.out.print(liczba + " ");
                znalezione++;
            }
            liczba++;
        }
    }

    static boolean czyPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

}