package in.rishabh_gupta.loose_coupling;

public class User {
    Database database;

    public User(Database database) {
        this.database = database;
    }

    public String getUser() {
        return this.database.getUser();
    }
}

