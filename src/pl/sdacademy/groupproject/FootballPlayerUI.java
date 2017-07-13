package pl.sdacademy.groupproject;

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

    public void editPlayerName(){
        System.out.println("Proszę podaj imię piłkarza");
        String name = scanner.nextLine();
        player.setName(name);

    }

    public void editPlayerSurname(){
        System.out.println("Proszę podaj nazwisko piłkarza");
        String surname = scanner.nextLine();
        player.setName(surname);

    }

    public String printPlayerInfo (){
       return player.toString();
    }

    public void editPlayerSpeed(){
        System.out.println("Proszę podaj szybkosc piłkarza");
        String speed = scanner.nextLine();
        player.setName(speed);
    }
    public void editPlayerShooting(){
        System.out.println("Proszę podaj strzał piłkarza");
        String shooting = scanner.nextLine();
        player.setName(shooting);
    }

    public void run(){

        while(true) {
            switch(this.readString("Wybierz co chcesz zrobić: wypisz dane pilkarza (wypisz), " +
                    "edycja imienia (imie), edycja nazwiska (nazwisko), edycja strzelania (strzal), edycja szybkosci (szybkosc), " +
                    "koniec (koniec)").toLowerCase()){
                case "wypisz":
                    printPlayerInfo();
                case "imie":
                    editPlayerName();
                    break;
                case "nazwisko":
                    editPlayerSurname();
                case "strzal":
                    editPlayerShooting();
                case "szybkosc":
                    editPlayerSpeed();
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
