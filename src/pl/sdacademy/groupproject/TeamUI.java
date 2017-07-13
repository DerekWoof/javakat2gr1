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
        System.out.println(question);
        String readString = scanner.nextLine();
        return readString;
    }
    private int readInt (String question){
        System.out.println(question);
        int readInt = scanner.nextInt();
        return readInt;
    }
}
