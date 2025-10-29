/*
 * Autowiring by Name
 * In Spring, autowiring allows the container to automatically
 * satisfy bean dependencies, without manually writing <property> or <constructor-arg>.
 *
 * Autowiring "byName" means:
 *     Spring looks for a bean whose ID matches the name of the property
 *     inside the dependent class and automatically injects it.
 *
 * In this example:
 *     - `Car` has a property named `specification`
 *     - Spring searches for a bean with id="specification"
 *     - Finds <bean id="specification" .../> and injects it automatically.
 *
 * FLOW VISUALIZATION (Autowire by Name)
 *
 * ┌────────────────────────────────────────────────┐
 * │            configuration.xml (Beans)           │
 * │------------------------------------------------│
 * │ <bean id="specification" class="..."/>         │
 * │ <bean id="car" class="..." autowire="byName"/> │
 * └────────────────────────────────────────────────┘
 *                      │
 *                      ▼
 * ┌───────────────────────────────────────────────┐
 * │               Spring Container                │
 * ├───────────────────────────────────────────────┤
 * │ Finds property: "specification" in Car        │
 * │ Matches bean ID: "specification"              │
 * │ Calls car.setSpecification(specificationBean) │
 * └───────────────────────────────────────────────┘
 *
 * This avoids explicit <property> tag and automatically wires
 * beans with matching names.
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * STEP 1: Load configuration.xml
         * -------------------------------
         * Spring container will automatically:
         *  - Create both beans
         *  - Detect that 'car' is autowired byName
         *  - Find a bean named 'specification'
         *  - Call setSpecification() method
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("configuration.xml");

        /*
         * STEP 2: Get the 'car' bean from context
         * -------------------------------
         * Since dependency is already injected,
         * we can directly use the object.
         */
        Car myCar = (Car) applicationContext.getBean("car");

        /*
         * STEP 3: Display the result
         */
        myCar.displayDetails();
    }
}
