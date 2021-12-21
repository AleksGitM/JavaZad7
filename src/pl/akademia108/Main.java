package pl.akademia108;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wpisz swój wiek: ");
        Scanner scanner = new Scanner(System.in);
        String userAge = scanner.next();
        int age = Integer.parseInt(userAge);
        int reszta = age % 2;
        boolean parzysta = (reszta == 0);
            boolean wm = (age > 20 && age < 40);
            boolean rr = (age == 25 || age ==35);
        System.out.println("Twój wiek: " + age);
        System.out.println("Czy liczba jest parzysta: " + parzysta);
        System.out.println("Czy liczba jest wieksza od 20 lub mniejsza od 40: " + wm);
        System.out.println("Czy liczba równa jest 25 lub 35: " + rr);
    }
}
