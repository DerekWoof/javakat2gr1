package pl.sdacademy.groupproject;

public abstract class AbstractEntity {

    private Integer id;

    public AbstractEntity(Integer id) {
        this.id = id;
    }

    public AbstractEntity(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
