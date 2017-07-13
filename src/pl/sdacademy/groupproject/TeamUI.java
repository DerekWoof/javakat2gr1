package pl.sdacademy.groupproject;


import java.util.Scanner;

public class TeamUI {

    public TeamUI() {
    }

    public TeamUI(Scanner scanner, Team team ) {
        this.scanner = scanner;
        this.team = team;
    }
    private Scanner scanner;
    private Team team;

    private String readString(String question){
        System.out.println(question);
        String readString = scanner.nextLine();
        return readString;
    }
    private int readInt (String question){
        System.out.println(question);
        int readInt = scanner.nextInt();
        return readInt;
    }

    public void run(){

        while(true) {
            switch(this.readString("Co chcesz zrobić:\n Wypisz dane drużyny (wypisz),\n Edycja nazwy (nazwa),\n Edycja daty zalozenia (datazalozenia),\n Koniec (koniec)").toLowerCase()){
                case "wypisz":
                    printTeamInfo();
                case "nazwa":
                    this.setTeamName();
                    break;
                case "datazalozenia":
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

    private void setTeamName(){
        team.setName(readString("Podaj nazwę druzyny"));
    }
    private String printTeamInfo(){
       return team.toString();
    }
}
