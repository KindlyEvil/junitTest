package unittestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({unittestaddnumbers.class,unittestaddstring.class})
public class AllTests {

}
