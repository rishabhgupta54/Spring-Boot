/*
 * Setter Injection
 * Dependency Injection (DI) is about giving objects their dependencies
 * rather than having them create dependencies themselves.
 *
 * Setter Injection means Spring calls a public setter method
 * to pass the dependency after object creation.
 *
 * In this example:
 *   - `Car` depends on `Specification`.
 *   - Instead of passing `Specification` via constructor,
 *     Spring injects it using the `setSpecification()` method.
 *
 * FLOW VISUALIZATION (Setter Injection)
 *
 * ┌────────────────────────────────────────────────────────────┐
 * │               applicationContext.xml                       │
 * │ <bean id="carSpecification" .../>                          │
 * │ <bean id="car" ...>                                        │
 * │    <property name="specification" ref="carSpecification"/> │
 * └────────────────────────────────────────────────────────────┘
 *                       │
 *                       ▼
 *         ┌────────────────────────────┐
 *         │  ApplicationContext loads  │
 *         └───────────────┬────────────┘
 *                         │
 *                         ▼
 *         ┌────────────────────────────┐
 *         │    Car Bean created        │
 *         ├────────────────────────────┤
 *         │ Calls setSpecification()   │
 *         │   with carSpecification    │
 *         └────────────────────────────┘
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * STEP 1: Load the XML configuration
         * ----------------------------------
         * Spring will create and wire beans as defined in applicationContext.xml.
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        /*
         * STEP 2: Retrieve the Bean from context
         * --------------------------------------
         * The `Car` bean has its dependency injected via setter.
         */
        Car myCar = (Car) applicationContext.getBean("car");

        /*
         * STEP 3: Use the Bean
         */
        myCar.displayDetails();
    }
}
