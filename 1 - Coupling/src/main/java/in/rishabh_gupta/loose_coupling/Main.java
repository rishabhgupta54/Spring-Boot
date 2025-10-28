/*
 * CONCEPT: Loose Coupling
 * Loose Coupling means classes depend on **abstractions**, not
 * on concrete implementations.
 *
 * - Achieved via interfaces, abstract classes, or dependency injection.
 * - We can easily switch databases without modifying the User class.
 *
 * FLOW VISUALIZATION (Loose Coupling)
 *
 *                 +------------------------------+
 *                 |         Interface            |
 *                 |         Database             |
 *                 +--------------┬---------------+
 *                                │
 *        implements              │ implements
 *     ┌─────────────────┐        │       ┌─────────────────┐
 *     │ MySQLDatabase   │        │       │ PostgreSQL      │
 *     └─────────────────┘        │       └─────────────────┘
 *                                │
 *   ┌────────────────────────────┴─────────────────────────────┐
 *   │                           User                           │
 *   │            - depends on Database interface               │
 *   └──────────────────────────────────────────────────────────┘
 *                                ▲
 *                                │
 *                        ┌───────┴────────┐
 *                        │      Main      │
 *                        └────────────────┘
 *
 * Main chooses the Database implementation dynamically
 * User class stays unchanged for all database types
 * Follows **Dependency Inversion Principle (DIP)**
 */

package in.rishabh_gupta.loose_coupling;

public class Main {

    public static void main(String[] args) {

        /*
         * STEP 1: Create a MySQL Database Implementation
         */
        Database mySQLDatabase = new MySQLDatabase();

        // Inject (pass) MySQL dependency into User
        User user1 = new User(mySQLDatabase);
        System.out.println(user1.getUser());

        /*
         * STEP 2: Switch to PostgreSQL Database
         */
        Database postgreSQL = new PostgreSQL();

        // Inject (pass) PostgreSQL dependency into User
        User user2 = new User(postgreSQL);
        System.out.println(user2.getUser());

        /*
         * STEP 3: Notice we didn’t change the User class at all!
         *
         * Only the Main class decides which implementation to use.
         * This makes our code more flexible and scalable.
         */
    }
}

/*
 * CONCEPT RECAP TABLE
 * --------------------------------------------------------------
 * | Aspect                 | Loose Coupling Example            |
 * |------------------------|-----------------------------------|
 * | Dependency Type        | Interface (Abstraction)           |
 * | Flexibility            | High (switch DBs easily)          |
 * | Testability            | Easy (mock interfaces)            |
 * | Maintainability        | High (no ripple effect)           |
 * | SOLID Principle Used   | Dependency Inversion Principle    |
 * --------------------------------------------------------------
 */
