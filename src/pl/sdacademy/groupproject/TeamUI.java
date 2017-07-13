package pl.sdacademy.groupproject;


import java.util.Scanner;

public class TeamUI {
    public TeamUI getTeam() {
        return team;
    }

    public TeamUI( Scanner scanner, TeamUI team ) {
        this.scanner = scanner;
        this.team = team;
    }
    private Scanner scanner;
    private TeamUI team;

    private String readString(String question){
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.toString();
        System.out.println("Co chcesz zrobić? " + scanner);
        return readString;
    }
    private int readInt (String question){
        Scanner scanner1 = new Scanner(System.in);
        int readInt = Integer.parseInt(scanner1.toString());
        System.out.println("Co chcesz zrobić? " + scanner1);
        return readInt;
    }
}
