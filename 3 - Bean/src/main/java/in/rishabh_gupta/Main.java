/*
 * Bean
 *
 * A "bean" in Spring is simply an object that is managed by
 * the Spring IoC (Inversion of Control) container.
 *
 * In this example:
 *   - We define a Bean class with a property 'message'
 *   - We configure it in an XML file (applicationBeanContext.xml)
 *   - We load that XML using ClassPathXmlApplicationContext
 *   - We retrieve the Bean object from the Spring container
 *
 * Spring handles the creation and initialization automatically.
 *
 *   ┌────────────────────────────┐
 *   │ applicationBeanContext.xml │
 *   │  <bean id="bean1" .../>    │
 *   └───────────────┬────────────┘
 *                   │
 *                   ▼
 *   ┌────────────────────────────────┐
 *   │ ClassPathXmlApplicationContext │
 *   └───────────────┬────────────────┘
 *                   │ loads XML
 *                   ▼
 *   ┌──────────────────────────────────────┐
 *   │     BeanFactory / ApplicationContext │
 *   └───────────────┬──────────────────────┘
 *                   │ creates
 *                   ▼
 *   ┌────────────────────────────────┐
 *   │          Bean object           │
 *   │  message = "I am a first bean" │
 *   └────────────────────────────────┘
 */

package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
         * STEP 1: Load the Spring Configuration File
         * ClassPathXmlApplicationContext:
         *  - Reads the XML configuration from the classpath.
         *  - Creates and manages beans defined inside that file.
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        /*
         * STEP 2: Retrieve the Bean
         * - Beans are identified using their "id" from the XML.
         * - The container returns a fully constructed and initialized object.
         */
        Bean bean1 = (Bean) applicationContext.getBean("bean1");

        /*
         * STEP 3: Use the Bean
         * - Access its properties or methods.
         * - The bean is ready for use.
         */
        System.out.println(bean1);
    }
}
