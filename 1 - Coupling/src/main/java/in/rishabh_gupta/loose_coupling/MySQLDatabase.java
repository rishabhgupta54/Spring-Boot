package in.rishabh_gupta.loose_coupling;

public class MySQLDatabase implements Database{
    @Override
    public String getUser() {
        return "Getting User From MySQL Database";
    }
}
