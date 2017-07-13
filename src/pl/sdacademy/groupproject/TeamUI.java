package pl.sdacademy.groupproject;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            switch(this.readString("Co chcesz zrobić:\n Wypisz dane drużyny (wypisz),\n Edycja nazwy (nazwa),\n Edycja daty zalozenia (datazalozenia)" +
                    ", \n Dodaj piłkarza do druzyny (dodaj), \n Usuń piłkarza z drużyny (usuń), \n Edytuj piłkarza (edytuj), " +
                    "\n Koniec (koniec)").toLowerCase()){
                case "wypisz":
                    printTeamInfo();
                case "nazwa":
                    this.setTeamName();
                    break;
                case "datazalozenia":
                    setTeamDateOfFoundation();
                    break;
                case "dodaj":
                    break;
                case "usuń":
                    break;
                case "edytuj":
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

    private void setTeamDateOfFoundation() {
        LocalDate localDate = this.team.getLocalDate();
        boolean check = false;
        do {
            String date = readString("Podaj nową datę założenia w formacie dd.mm.yyyy");
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyy");
            try {
                localDate = LocalDate.parse(date, format);
            } catch (Exception e) {
                System.out.println("Podaj prawidłowy format daty!");
                check = true;
            }
        } while(check);
        this.team.setLocalDate(localDate);
    }
}
