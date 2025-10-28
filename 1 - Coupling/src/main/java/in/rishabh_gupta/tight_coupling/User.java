package in.rishabh_gupta.tight_coupling;

public class User {
    MySQLDatabase mySQLDatabase = new MySQLDatabase();

    public String getUser() {
        return this.mySQLDatabase.getUser();
    }
}
