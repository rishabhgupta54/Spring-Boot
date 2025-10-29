/*
 * Tight Coupling
 *
 * Tight Coupling means one class is highly dependent on another
 * concrete class. Changing one class will require changes in others.
 *
 * In this example:
 *   - `User` is tightly coupled with `MySQLDatabase`
 *   - There is no flexibility to switch databases
 *
 * FLOW VISUALIZATION (Tight Coupling)
 *
 *   ┌────────────────-──┐
 *   │      Main         │
 *   └───────┬───────────┘
 *           │ creates
 *           ▼
 *   ┌───────────────────┐
 *   │      User         │
 *   │  ───────────────  │
 *   │  MySQLDatabase db │──────┐
 *   └───────────────────┘      │ tightly coupled
 *           │                  │
 *           ▼                  │
 *   ┌──────────────────┐       │
 *   │   MySQLDatabase  │◄──────┘
 *   └──────────────────┘
 *
 *  To switch to PostgreSQL, we must MODIFY the User class.
 *  Violates the Open-Closed Principle (OCP).
 *  Difficult to test or extend.
 */

package in.rishabh_gupta.tight_coupling;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create a User object
        // The User internally creates a MySQLDatabase instance.
        // This is "TIGHT" because Main cannot change the DB dependency.
        User user = new User();

        // Step 2: Get the user info from MySQL
        System.out.println(user.getUser());
    }
}

/*
 * CONCEPT RECAP TABLE
 * -------------------------------------------------------------
 * | Aspect                 | Tight Coupling Example           |
 * |------------------------|----------------------------------|
 * | Dependency Type        | Direct concrete class            |
 * | Flexibility            | None (fixed MySQLDatabase)       |
 * | Testability            | Hard to mock                     |
 * | Maintainability        | Low (code changes ripple)        |
 * | SOLID Principle Broken | Open-Closed Principle            |
 * -------------------------------------------------------------
 */
