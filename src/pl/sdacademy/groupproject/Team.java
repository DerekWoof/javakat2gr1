package pl.sdacademy.groupproject;

import java.time.LocalDate;
import java.util.List;

public class Team extends AbstractEntity{
    private List<FootballPlayer> players;

    private String name;
    private LocalDate localDate;

    public Team(Integer id, String name, LocalDate localDate) {
        super(id);
        this.name = name;
        this.localDate = localDate;
    }

    public Team(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<FootballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<FootballPlayer> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
