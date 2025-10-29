/*
 * - Car depends on a Specification object.
 * - With autowire="byType", Spring automatically injects
 *   a bean of type Specification into this property.
 */

package in.rishabh_gupta;

public class Car {
    private Specification specification;

    // Spring uses this setter to inject dependency
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
