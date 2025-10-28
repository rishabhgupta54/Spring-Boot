/*
 * Represents a dependency that will be injected into another bean.
 *
 * - Contains fields: make, model
 * - Provides getters and setters for Spring to inject values.
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
