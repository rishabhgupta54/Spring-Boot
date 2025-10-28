package in.rishabh_gupta;

public class MySQLDatabase implements Database{
    @Override
    public String getUser() {
        return "Getting User From MySQL Database";
    }
}
