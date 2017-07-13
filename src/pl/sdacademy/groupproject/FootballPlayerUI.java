package pl.sdacademy.groupproject;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class FootballPlayerUI {

    private Scanner scanner;
    private FootballPlayer player;

    public FootballPlayerUI(Scanner scanner, FootballPlayer player) {
        this.scanner = scanner;
        this.player = player;
    }

    public FootballPlayer getPlayer() {
        return player;
    }

    private String readString(String question) {
        System.out.println(question);
        String answer = scanner.nextLine();

        return answer;
    }

    private Integer readInt(String question) {
        System.out.println(question);
        Integer answer = scanner.nextInt();

        return answer;
    }

    public void run(){
        Scanner read = new Scanner(System.in);

        while(true) {
            System.out.println("Wybierz co chcesz zrobić: wypisz dane pilkarza (wypisz), " +
                    "edycja imienia (imie), edycja nazwiska (nazwisko), edycja strzelania (strzal), edycja szybkosci (szybkosc), " +
                    "koniec (koniec)");
            switch(read.nextLine().toLowerCase()){
                case "wypisz":
                    break;
                case "imie":
                    break;
                case "nazwisko":
                    break;
                case "strzal":
                    break;
                case "szybkosc":
                    break;
                case "koniec":
                    System.out.println("Zakończono edycję");
                    return;
                default:
                    System.out.println("Błedny wybór. Spróbuj ponownie");
                    System.out.println("");
            }
        }

    }
}
