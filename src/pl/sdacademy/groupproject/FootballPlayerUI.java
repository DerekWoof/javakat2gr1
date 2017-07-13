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

    public String editPlayerName(String name){
        player.setName(name);
        return name;
    }

    public String editPlayerSurname (String surname){
        player.setSurname(surname);
        return surname;
    }

    public String printPlayerInfo (){
       return player.toString();
    }

    public Integer editPlayerSpeed(int speed){
        player.setSpeed(speed);
        return speed;
    }
    public Integer editPlayerShooting(int shooting){
        player.setShooting(shooting);
        return shooting;
    }


}
