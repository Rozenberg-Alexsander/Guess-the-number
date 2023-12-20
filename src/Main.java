import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt(10) + 1;
        System.out.println("Введите чило от 0 до 10");
        Scanner userNumber = new Scanner(System.in);
        int scannerNumber = userNumber.nextInt();

        if (scannerNumber > randInt || scannerNumber < randInt) {
            for (int schetchik = 2; schetchik > 0; --schetchik) {
                if (scannerNumber > randInt) {
                    System.out.println("Загаданное мною число меньше. Осталось попыток " + schetchik);
                    Scanner userNumberTwo = new Scanner(System.in);
                    scannerNumber = userNumberTwo.nextInt();
                } else if (scannerNumber < randInt) {
                    System.out.println("Загаданное мною число больше. Осталось попыток " + schetchik);
                    Scanner userNumberThr = new Scanner(System.in);
                    scannerNumber = userNumberThr.nextInt();
                }
            }
            if (scannerNumber == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
            }
        }
        if (scannerNumber > randInt || scannerNumber < randInt) {
            System.out.println("ЛУЗЕР! Загаданное мною число " + randInt);

        }
    }
}