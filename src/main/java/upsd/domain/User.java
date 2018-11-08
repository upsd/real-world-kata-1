package upsd.domain;

public class User {

    private final int id;
    private final String name;

    public User(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }
}
