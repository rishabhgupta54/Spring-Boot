/*
 * This simple bean provides data for another bean.
 * It contains standard getters and setters so Spring
 * can populate its properties via XML <property> tags.
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
