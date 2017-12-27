/**
 *
 */
package Hello_World;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author okuda
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, ChangeNumTest.class, ChangeNumTest2.class, ChangeNumTest3.class, HTMLParserTest.class,
        HTMLParserTest2.class })

public class AllTests {

}
