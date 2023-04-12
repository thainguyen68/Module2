package btvn;

public class Address {
    private static int idUp=1;
    private int id;
    private String name;

    public Address() {
        this.id=idUp++;
    }

    public Address(String name) {
        this.id=idUp++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +". "+ name;
    }
}
