/*
 * A simple independent bean that provides car details.
 * This bean will be injected into Car automatically
 * because its ID matches the property name in Car.
 */

package in.rishabh_gupta;

public class Specification {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" + "make='" + make + '\'' + ", model='" + model + '\'' + '}';
    }
}
