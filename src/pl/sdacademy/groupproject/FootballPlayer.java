package pl.sdacademy.groupproject;


public class FootballPlayer extends Person {
    public FootballPlayer( Integer id, String name, String surname, int shooting, int speed, String name1, String surname1 ) {
        super(id, name, surname);
        this.shooting = shooting;
        this.speed = speed;
        this.name = name1;
        this.surname = surname1;
    }

    public FootballPlayer( String name, String surname, int shooting, int speed, String name1, String surname1 ) {
        super(name, surname);
        this.shooting = shooting;
        this.speed = speed;
        this.name = name1;
        this.surname = surname1;
    }

    private int shooting;
    private int speed;
    private String name;
    private String surname;

    public int getShooting() {
        return shooting;
    }

    public void setShooting( int shooting ) {
        this.shooting = shooting;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed( int speed ) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "shooting=" + shooting +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
