package pl.sdacademy.groupproject;

import java.time.LocalDate;

public class Team extends AbstractEntity{
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
}
