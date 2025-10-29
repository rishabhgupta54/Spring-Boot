/*
 * The Car class depends on a Specification object.
 * Because we're using autowire="byName" in XML,
 * Spring will look for a bean with ID matching the
 * property name 'specification' and inject it automatically.
 */

package in.rishabh_gupta;

public class Car {
    private Specification specification;

    // Setter method to be used by Spring for injection
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
