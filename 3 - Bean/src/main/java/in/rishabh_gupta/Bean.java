/*
 * Bean (POJO)
 * - A simple Java class that follows standard conventions:
 *     1. Private fields
 *     2. Public getters and setters
 *     3. A no-argument constructor (default)
 *
 * - Spring uses reflection to create and inject values into such beans.
 */

package in.rishabh_gupta;

public class Bean {

    private String message;

    // Getter and Setter — used by Spring for Dependency Injection
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // toString() — displays bean content
    @Override
    public String toString() {
        return "Bean{" + "message='" + message + '\'' + '}';
    }
}
