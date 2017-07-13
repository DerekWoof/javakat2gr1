package pl.sdacademy.groupproject;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-13.
 */
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
}
