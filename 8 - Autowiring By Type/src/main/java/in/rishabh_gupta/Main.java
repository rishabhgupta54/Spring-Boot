/*
 * Autowiring by Type
 * In Spring, autowire byType means:
 *     Spring automatically matches a dependency by class type
 *     instead of by bean ID or property name.
 *
 * RULE:
 *   - The container looks for a bean whose type matches the property type.
 *   - If exactly ONE matching bean is found → it gets injected.
 *   - If none or more than one are found → exception is thrown.
 *
 * EXAMPLE FLOW:
 *
 * ┌────────────────────────────────────────────────┐
 * │            configuration.xml (Beans)           │
 * │------------------------------------------------│
 * │ <bean id="specification" class="..."/>         │
 * │ <bean id="car" class="..." autowire="byType"/> │
 * └────────────────────────────────────────────────┘
 *                      │
 *                      ▼
 * ┌────────────────────────────────────┐
 * │            Spring Container        │
 * ├────────────────────────────────────┤
 * │ Finds property: Specification type │
 * │ Searches for bean of same type     │
 * │ Found: specification (1 match)     │
 * │ Calls car.setSpecification(...)    │
 * └────────────────────────────────────┘
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");

        Car myCar = (Car) applicationContext.getBean("car");

        myCar.displayDetails();
    }
}
