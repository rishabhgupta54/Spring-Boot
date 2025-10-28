package in.rishabh_gupta.loose_coupling;

public class PostgreSQL implements Database {
    @Override
    public String getUser() {
        return "Getting User From PostgreSQL Database";
    }
}
