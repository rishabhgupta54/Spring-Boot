/*
 * - The dependency (Specification) is injected by calling
 *   the public setter method after the bean is created.
 * - This is useful when:
 *     → Dependency is optional
 *     → You want flexibility to change dependency post-instantiation
 */

package in.rishabh_gupta;

public class Car {
    private Specification specification;

    // Setter for Dependency Injection
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + this.specification.toString());
    }
}
