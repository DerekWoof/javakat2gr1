package pl.sdacademy.groupproject;

/**
 * Created by RENT on 2017-07-13.
 */
public class Person extends AbstractEntity {

    private String name;
    private String surname;

    public Person(Integer id, String name, String surname) {
        super(id);
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
