/*
 * - Uses constructor-based dependency injection.
 * - Spring automatically calls this constructor
 *   and provides a matching Specification bean.
 */

package in.rishabh_gupta;

public class Car {
    private Specification specification;

    // Spring injects the Specification bean here
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
