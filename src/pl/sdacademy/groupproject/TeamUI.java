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
}
