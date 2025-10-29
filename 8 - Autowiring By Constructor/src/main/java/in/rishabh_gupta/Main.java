/*
 * Autowiring by Constructor
 * In Spring, autowire=constructor means:
 *     Spring automatically identifies and injects dependencies
 *     by matching the parameter *type* in the class constructor.
 *
 * RULE:
 *   - The container searches for a bean whose type matches
 *     the constructor argument type.
 *   - If exactly one matching bean is found → it's injected automatically.
 *
 * EXAMPLE FLOW:
 *
 * ┌──────────────────────────────────────────────────────┐
 * │              configuration.xml (Beans)               │
 * │------------------------------------------------------│
 * │ <bean id="specification" class="..."/>               │
 * │ <bean id="car" class="..." autowire="constructor"/>  │
 * └──────────────────────────────────────────────────────┘
 *                      │
 *                      ▼
 * ┌────────────────────────────────┐
 * │     Spring Container           │
 * ├────────────────────────────────┤
 * │ Finds Car constructor          │
 * │ → requires Specification type  │
 * │ Finds matching bean available  │
 * │ Injects into constructor       │
 * └────────────────────────────────┘
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // STEP 1: Load Spring configuration
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");

        // STEP 2: Retrieve the 'car' bean — dependency injected via constructor
        Car myCar = (Car) applicationContext.getBean("car");

        // STEP 3: Display car details
        myCar.displayDetails();
    }
}
