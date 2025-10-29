/*
 * Constructor Injection
 *
 * Dependency Injection (DI) is a design pattern where the container
 * (Spring) is responsible for creating and providing dependent objects
 * instead of the class creating them itself.
 *
 * In this example:
 *   - `Specification` is a separate bean that stores make and model info.
 *   - `Car` depends on `Specification`.
 *   - The dependency is provided by Spring through a constructor.
 *
 * FLOW VISUALIZATION
 *
 *  ┌──────────────────────────────────────────────────┐
 *  │                application.xml                   │
 *  │  <bean id="carSpecification" .../>               │
 *  │  <bean id="car" ...>                             │
 *  │     <constructor-arg ref="carSpecification"/>    │
 *  └──────────────────────────────────────────────────┘
 *                      │
 *                      ▼
 *         ┌────────────────────────────┐
 *         │ ApplicationContext loads   │
 *         └───────────────┬────────────┘
 *                         │
 *                         ▼
 *         ┌────────────────────────────┐
 *         │     Specification Bean     │
 *         │   make = "Kia"             │
 *         │   model = "Seltos"         │
 *         └───────────────┬────────────┘
 *                         │ injected into constructor
 *                         ▼
 *         ┌────────────────────────────┐
 *         │          Car Bean          │
 *         │  new Car(Specification)    │
 *         └────────────────────────────┘
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * STEP 1: Load Spring XML Configuration
         * -------------------------------------
         * ClassPathXmlApplicationContext reads the XML file
         * from the classpath and initializes all beans defined inside it.
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");

        /*
         * STEP 2: Retrieve the Bean
         * -------------------------
         * The bean is retrieved using its id ("car").
         * Spring automatically injects the Specification bean
         * into the Car's constructor.
         */
        Car myCar = (Car) applicationContext.getBean("car");

        /*
         * STEP 3: Use the Bean
         * --------------------
         * Once retrieved, you can use its methods normally.
         */
        myCar.displayDetails();
    }
}
