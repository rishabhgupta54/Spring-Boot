/*
 * Inversion Of Control
 *
 * In this example, we use Spring's IoC (Inversion of Control) container
 * to inject a dependency (Database implementation) into the User class
 * using a constructor argument.
 *
 * 1. `Database` is an interface — an abstraction.
 * 2. `MySQLDatabase` and `PostgreSQL` are two concrete implementations.
 * 3. `User` depends on a `Database` — but does not know which one.
 * 4. The XML configuration decides which Database bean is injected.
 *
 * FLOW VISUALIZATION
 *
 *               +---------------------------+
 *               |     configuration.xml     |
 *               |---------------------------|
 *               |  <bean id="mySQLDatabase">|
 *               |  <bean id="postgreSQL">   |
 *               |  <bean id="user"...>      |
 *               +-------------┬-------------+
 *                             │
 *                 Constructor Injection
 *                             │
 *           ┌─────────────────┴──────────────────┐
 *           │               User                 │
 *           │ depends on Database (Interface)    │
 *           └─────────────────┬──────────────────┘
 *                             │
 *                  implemented by
 *              ┌──────────────┴───────────────┐
 *              │     MySQLDatabase /          │
 *              │     PostgreSQL               │
 *              └──────────────────────────────┘
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * STEP 1: Load XML Configuration
         * Spring reads configuration.xml, creates all bean instances,
         * and resolves constructor dependencies automatically.
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");

        /*
         * STEP 2: Get the User bean from Spring Context
         * You can switch between MySQL and PostgreSQL simply
         * by changing the bean ID below — without touching Java code.
         */
        User user = (User) applicationContext.getBean("userWithMySQLDatabaseConnection");
        // User user = (User) applicationContext.getBean("userWithPostgreSQLDatabaseConnection");

        /*
         * STEP 3: Use the injected bean
         */
        System.out.println(user.getUser());
    }
}
