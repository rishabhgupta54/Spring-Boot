/*
 * The Car class depends on Specification.
 * Instead of creating Specification itself, it receives it
 * through the constructor — this is called Constructor Injection.
 *
 * BENEFIT:
 * - Makes Car independent of Specification’s creation.
 * - Follows Inversion of Control (IoC) principle.
 */

package in.rishabh_gupta;

public class Car {
    private Specification specification;

    // Constructor-based Dependency Injection
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
