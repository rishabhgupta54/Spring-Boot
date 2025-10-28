package in.rishabh_gupta;

public class User {
    Database database;

    public User(Database database) {
        this.database = database;
    }

    public String getUser() {
        return this.database.getUser();
    }
}

