package tiktok.entities;

public class Base {
    private String name;
    private int id;

    public Base(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Base() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
